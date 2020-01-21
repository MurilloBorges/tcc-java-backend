package br.com.projeto.tcc.chat;

import java.util.List;

import br.com.projeto.tcc.message.MessageVO;

public class ChatVO {

	private Long id;
	private List<MessageVO> messageVOs;	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<MessageVO> getMessageVOs() {
		return messageVOs;
	}
	public void setMessageVOs(List<MessageVO> messageVOs) {
		this.messageVOs = messageVOs;
	}		
}
