package br.com.projeto.tcc;

import org.springframework.stereotype.Service;

@Service
public class TccService {
	
	private final String USER = "teste";
	private final String TOKEN = "99999999999999";
	private final String URL = "teste";
	private final String PASSWORD = "123";
	
	public String getChat(Long idChat) throws Exception{
    	try {
    		    		
    		return "";
    	} catch (Exception e) {
    		e.printStackTrace();
			throw new Exception("Falha ao carregar chat.");
    	}
    }

	public boolean postChat(Long idChat, String msg) throws Exception {
		try {
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Falha ao atualizar chat.");
		}
		
	}
}
