package br.com.projeto.tcc.chat;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ChatService {
	
	private final String USER = "teste";
	private final String TOKEN = "99999999999999";
	private final String URL = "teste";
	private final String PASSWORD = "123";
		
	public List<ChatVO> getChat() throws Exception{
    	try {
    		List<ChatVO> chatVOs = null;   	
    		
    		return chatVOs;
    	} catch (Exception e) {
    		e.printStackTrace();
			throw new Exception("Falha ao carregar chat.");
    	}
    }
	
	public ChatVO getChat(Long idChat) throws Exception{
    	try {
    		ChatVO chatVO = null;   	
    		
    		return chatVO;
    	} catch (Exception e) {
    		e.printStackTrace();
			throw new Exception("Falha ao carregar chat.");
    	}
    }

	public ChatVO postChat(ChatVO chatVO) throws Exception {
		try {			
			return chatVO;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Falha ao criar chat.");
		}		
	}
	
	public ChatVO patchChat(Long idChat, ChatVO chatVO) throws Exception {
		try {			
			return chatVO;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Falha ao criar chat.");
		}		
	}
}
