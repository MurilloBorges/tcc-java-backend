package br.com.projeto.tcc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiTccExceptionResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ApiTccException.class)
	public final ResponseEntity<?> handleTccException(ApiTccException ex, WebRequest request) {
		ErrorResponse response = new ErrorResponse();
		response.setStatus(ex.getStatus());
		response.setError_code(ex.getError());
		response.setMessage(ex.getMessage());
		response.setDetail(ex.getDetail());
		return new ResponseEntity<>(response, response.getStatus());
	}
	
	private class ErrorResponse {

	    private HttpStatus status;
	    private String error_code;
	    private String message;
	    private String detail;
	    
		public HttpStatus getStatus() {
			return status;
		}
		public void setStatus(HttpStatus status) {
			this.status = status;
		}
		public String getError_code() {
			return error_code;
		}
		public void setError_code(String error_code) {
			this.error_code = error_code;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getDetail() {
			return detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
	}
}
