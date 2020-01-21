package br.com.projeto.tcc.exception;

import org.springframework.http.HttpStatus;

public class ApiTccException extends RuntimeException{
	private static final long serialVersionUID = -8415040490938026221L;

	public ApiTccException(String message, String error, HttpStatus status) {
        this.message = message;
        this.error = error;
        this.status = status;
    }
	
	public ApiTccException(String message, String error, HttpStatus status, String detail) {
        this.message = message;
        this.error = error;
        this.status = status;
        this.detail = detail;
    }

    private String message;
    private String error;
    private String detail;
    private HttpStatus status;

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public HttpStatus getStatus() {
        return status;
    }
    public void setStatus(HttpStatus status) {
        this.status = status;
    }
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}