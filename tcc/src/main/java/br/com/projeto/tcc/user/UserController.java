package br.com.projeto.tcc.user;

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
public class UserController {
	
	@Autowired
	private UserService service;
		
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<UserVO>> getUser() {
		return new ResponseEntity<List<UserVO>>(service.listarUsuarios(), HttpStatus.OK);		
	}
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserVO> getUser(@PathVariable Long id) {
		return new ResponseEntity<UserVO>(service.listarUsuarios(id), HttpStatus.OK);		
	}	
		
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserVO> postUser(@RequestBody UserVO userVO) {
		return new ResponseEntity<UserVO>(service.salvarUsuario(userVO), HttpStatus.CREATED);		
	}	
	
	@PatchMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserVO> patchUser(@PathVariable Long id, @RequestBody UserVO userVO) {
		return new ResponseEntity<UserVO>(service.atualizarUsuario(id, userVO), HttpStatus.OK);		
	}	
}
