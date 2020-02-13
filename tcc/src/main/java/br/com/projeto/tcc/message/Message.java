package br.com.projeto.tcc.message;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

import br.com.projeto.tcc.chat.Chat;
import br.com.projeto.tcc.user.User;

@Entity
@Table(name = "message")
public class Message implements Serializable {

	private static final long serialVersionUID = -5850654913741272853L;

	@Id
	@SequenceGenerator(name = "message_seq", sequenceName = "messageseq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "message_seq")
	@Column(name = "cod_message", nullable = false, unique = true)
	private Long codMessage;
	
	@ManyToOne
	@JoinColumn(name = "cod_chat", referencedColumnName = "cod_chat", nullable = false)	
	@JsonBackReference
	private Chat chat;
	
	@ManyToOne
	@JoinColumn(name = "cod_user", referencedColumnName = "cod_user", nullable = false)	
	@JsonBackReference
	private User user;
		
	@Column(name = "status", nullable = false, length = 1)
	private String status;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_insert", nullable = false)
	private Date dataInsert;
	
	@Column(name = "message", nullable = false)
	private String message;

	public Long getCodMessage() {
		return codMessage;
	}

	public void setCodMessage(Long codMessage) {
		this.codMessage = codMessage;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}		
}
