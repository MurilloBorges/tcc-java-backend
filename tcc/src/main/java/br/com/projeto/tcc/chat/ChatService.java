package br.com.projeto.tcc.chat;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.projeto.tcc.exception.ApiTccException;

@Service
public class ChatService {
		
	public List<ChatVO> listarChats() throws ApiTccException {
    	try {
    		List<ChatVO> chatVOs = null;   	
    		
    		return chatVOs;    	
		} catch (ApiTccException e) {
			throw e;
		} catch (Exception e) {
			throw new ApiTccException("Falha ao carregar chat.", "ERRO_INTERNO", HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
	
	public ChatVO listarChats(Long idChat) throws ApiTccException {
    	try {
    		ChatVO chatVO = null;   	
    		
    		return chatVO;
    	} catch (ApiTccException e) {
			throw e;
		} catch (Exception e) {
			throw new ApiTccException("Falha ao carregar chat.", "ERRO_INTERNO", HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }

	public ChatVO salvarChat(ChatVO chatVO) throws ApiTccException {
		try {			
			
			return chatVO;
		} catch (ApiTccException e) {
			throw e;
		} catch (Exception e) {
			throw new ApiTccException("Falha ao salvar chat.", "ERRO_INTERNO", HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}
	
	public ChatVO atualizarChat(Long idChat, ChatVO chatVO) throws ApiTccException {
		try {			
			
			return chatVO;
		} catch (ApiTccException e) {
			throw e;
		} catch (Exception e) {
			throw new ApiTccException("Falha ao atualizar chat.", "ERRO_INTERNO", HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}
}
