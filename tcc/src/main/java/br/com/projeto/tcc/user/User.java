package br.com.projeto.tcc.user;

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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import br.com.projeto.tcc.chat.Chat;
import br.com.projeto.tcc.message.Message;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 2203664240370603697L;
	
	@Id
	@SequenceGenerator(name = "user_seq", sequenceName = "userseq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@Column(name = "cod_user", nullable = false, unique = true)
	private Long codUser;

	@Column(name = "first_name", nullable = false, length = 30)
	private String firstName;
	
	@Column(name = "last_name", nullable = false, length = 30)
	private String lastName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "birth", nullable = false)
	private Date birth;
	
	@Column(name = "sex", nullable = false, length = 1)
	private String sex;
	
	@Column(name = "photo", nullable = true)
	private Byte photo;
	
	@Column(name = "email", nullable = false, length = 50)
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_insert", nullable = false)
	private Date dataInsert;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_acess", nullable = false)
	private Date lastAcess;
	
	@Column(name = "password", nullable = false)
	private String password;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
	@JsonBackReference
	private Chat chat;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Message> messages;
	
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
	
	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
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
