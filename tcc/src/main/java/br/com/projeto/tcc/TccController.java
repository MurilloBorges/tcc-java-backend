package br.com.projeto.tcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tcc")
public class TccController {

	@Autowired
	private TccService service;
	
	@GetMapping(value = "/chat")
	public ResponseEntity getChat() {
		try {
			return ResponseEntity.ok().body(service.getChat(Long.valueOf(0)));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.toString());
		}
	}
	
	@PostMapping(value = "/chat")
	public ResponseEntity postChat(@RequestBody Long idChat, String msg) {
		try {
			return ResponseEntity.ok().body(service.postChat(Long.valueOf(0), ""));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
}
