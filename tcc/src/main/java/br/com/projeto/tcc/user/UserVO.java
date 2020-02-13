package br.com.projeto.tcc.user;

import java.util.Date;
import java.util.List;

import br.com.projeto.tcc.chat.ChatVO;
import br.com.projeto.tcc.message.MessageVO;

public class UserVO {

	private Long codUser;	
	private String firstName;
	private String lastName;
	private Date birth;
	private String sex;
	private Byte photo;
	private String email;
	private Date dataInsert;
	private Date lastAcess;
	private String password;
	private ChatVO chatVO;
	private List<MessageVO> messageVOs;
	
	public Long getCodUser() {
		return codUser;
	}
	public void setCodUser(Long codUser) {
		this.codUser = codUser;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Byte getPhoto() {
		return photo;
	}
	public void setPhoto(Byte photo) {
		this.photo = photo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataInsert() {
		return dataInsert;
	}
	public void setDataInsert(Date dataInsert) {
		this.dataInsert = dataInsert;
	}
	public Date getLastAcess() {
		return lastAcess;
	}
	public void setLastAcess(Date lastAcess) {
		this.lastAcess = lastAcess;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ChatVO getChat() {
		return chatVO;
	}
	public void setChat(ChatVO chatVO) {
		this.chatVO = chatVO;
	}
	public List<MessageVO> getMessageVOs() {
		return messageVOs;
	}
	public void setMessageVOs(List<MessageVO> messageVOs) {
		this.messageVOs = messageVOs;
	}	
}
