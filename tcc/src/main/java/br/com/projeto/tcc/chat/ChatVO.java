package br.com.projeto.tcc.chat;

import java.util.Date;
import java.util.List;

import br.com.projeto.tcc.message.MessageVO;
import br.com.projeto.tcc.user.UserVO;

public class ChatVO {

	private Long codChat;
	private UserVO userMe;
	private UserVO userYou;
	private List<MessageVO> messageVOs;	
	private Date dataInsert;
	
	public Long getCodChat() {
		return codChat;
	}
	public void setCodChat(Long codChat) {
		this.codChat = codChat;
	}
	public UserVO getUserMe() {
		return userMe;
	}
	public void setUserMe(UserVO userMe) {
		this.userMe = userMe;
	}
	public UserVO getUserYou() {
		return userYou;
	}
	public void setUserYou(UserVO userYou) {
		this.userYou = userYou;
	}
	public List<MessageVO> getMessageVOs() {
		return messageVOs;
	}
	public void setMessageVOs(List<MessageVO> messageVOs) {
		this.messageVOs = messageVOs;
	}
	public Date getDataInsert() {
		return dataInsert;
	}
	public void setDataInsert(Date dataInsert) {
		this.dataInsert = dataInsert;
	}
}
