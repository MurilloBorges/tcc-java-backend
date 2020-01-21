package br.com.projeto.tcc.chat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/chats")
public class ChatController {

	@Autowired
	private ChatService service;
		
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ChatVO>> getChat() {
		return new ResponseEntity<List<ChatVO>>(service.listarChats(), HttpStatus.OK);		
	}
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ChatVO> getChat(@PathVariable Long id) {
		return new ResponseEntity<ChatVO>(service.listarChats(id), HttpStatus.OK);		
	}	
		
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ChatVO> postChat(@RequestBody ChatVO chatVO) {
		return new ResponseEntity<ChatVO>(service.salvarChat(chatVO), HttpStatus.CREATED);		
	}	
	
	@PatchMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ChatVO> patchChat(@PathVariable Long id, @RequestBody ChatVO chatVO) {
		return new ResponseEntity<ChatVO>(service.atualizarChat(id, chatVO), HttpStatus.OK);		
	}	
}
