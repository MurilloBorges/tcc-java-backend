package br.com.projeto.tcc.message;

import java.util.Date;

import br.com.projeto.tcc.chat.ChatVO;
import br.com.projeto.tcc.user.UserVO;

public class MessageVO {

	private Long codMessage;
	private ChatVO chatVO;
	private UserVO userVO;
	private String status;
	private Date dataInsert;
	private String message;
	
	public Long getCodMessage() {
		return codMessage;
	}
	public void setCodMessage(Long codMessage) {
		this.codMessage = codMessage;
	}
	public ChatVO getChatVO() {
		return chatVO;
	}
	public void setChatVO(ChatVO chatVO) {
		this.chatVO = chatVO;
	}
	public UserVO getUserVO() {
		return userVO;
	}
	public void setUserVO(UserVO userVO) {
		this.userVO = userVO;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDataInsert() {
		return dataInsert;
	}
	public void setDataInsert(Date dataInsert) {
		this.dataInsert = dataInsert;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
