package br.com.projeto.tcc.chat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import br.com.projeto.tcc.message.Message;
import br.com.projeto.tcc.user.User;

@Entity
@Table(name = "chat")
public class Chat implements Serializable {
	
	private static final long serialVersionUID = -7013287007434673690L;

	@Id
	@SequenceGenerator(name = "chat_seq", sequenceName = "chatseq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "chat_seq")
	@Column(name = "cod_chat", nullable = false, unique = true)
	private Long codChat;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "chat", cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_user_me", referencedColumnName = "cod_user", nullable = false)
	@JsonManagedReference
	private User userMe;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "chat", cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_user_you", referencedColumnName = "cod_user", nullable = false)	
	@JsonManagedReference
	private User userYou;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "chat")
	@JsonManagedReference
	private List<Message> messages;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_insert", nullable = false)
	private Date dataInsert;

	public Long getCodChat() {
		return codChat;
	}

	public void setCodChat(Long codChat) {
		this.codChat = codChat;
	}

	public User getUserMe() {
		return userMe;
	}

	public void setUserMe(User userMe) {
		this.userMe = userMe;
	}

	public User getUserYou() {
		return userYou;
	}

	public void setUserYou(User userYou) {
		this.userYou = userYou;
	}

	public Date getDataInsert() {
		return dataInsert;
	}

	public void setDataInsert(Date dataInsert) {
		this.dataInsert = dataInsert;
	}
	
	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}			
}
