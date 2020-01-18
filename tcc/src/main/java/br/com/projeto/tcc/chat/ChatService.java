package br.com.projeto.tcc.chat;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ChatService {
		
	public List<ChatVO> listarChats() throws Exception{
    	try {
    		List<ChatVO> chatVOs = null;   	
    		
    		return chatVOs;
    	} catch (Exception e) {
    		e.printStackTrace();
			throw new Exception("Falha ao carregar chat.");
    	}
    }
	
	public ChatVO listarChats(Long idChat) throws Exception{
    	try {
    		ChatVO chatVO = null;   	
    		
    		return chatVO;
    	} catch (Exception e) {
    		e.printStackTrace();
			throw new Exception("Falha ao carregar chat.");
    	}
    }

	public ChatVO salvarChat(ChatVO chatVO) throws Exception {
		try {			
			return chatVO;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Falha ao criar chat.");
		}		
	}
	
	public ChatVO atualizarChat(Long idChat, ChatVO chatVO) throws Exception {
		try {			
			return chatVO;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Falha ao criar chat.");
		}		
	}
}
