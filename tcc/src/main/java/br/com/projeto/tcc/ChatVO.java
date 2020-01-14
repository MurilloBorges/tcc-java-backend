package br.com.projeto.tcc;

public class ChatVO {

	private Long id;
	private String msg;
	
	public ChatVO(Long id, String msg) {
		super();
		this.id = id;
		this.msg = msg;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
