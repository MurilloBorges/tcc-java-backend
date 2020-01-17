package br.com.projeto.tcc.chat;

import java.util.List;

import br.com.projeto.tcc.message.Message;

public class ChatVO {

	private Long id;
	private List<Message> messages;	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}	
}
