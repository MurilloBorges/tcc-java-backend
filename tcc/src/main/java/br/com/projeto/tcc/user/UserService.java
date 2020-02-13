package br.com.projeto.tcc.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.projeto.tcc.exception.ApiTccException;

@Service
public class UserService {
	
	public List<UserVO> listarUsuarios() throws ApiTccException {
    	try {
    		List<UserVO> userVOs = new ArrayList<UserVO>();   	
    		
    		return userVOs;    	
		} catch (ApiTccException e) {
			throw e;
		} catch (Exception e) {
			throw new ApiTccException("Falha ao carregar usuários.", "ERRO_INTERNO", HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
	
	public UserVO listarUsuarios(Long codUser) throws ApiTccException {
    	try {
    		UserVO userVO = null;   	
    		
    		return userVO;
    	} catch (ApiTccException e) {
			throw e;
		} catch (Exception e) {
			throw new ApiTccException("Falha ao carregar usuário.", "ERRO_INTERNO", HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }

	public UserVO salvarUsuario(UserVO userVO) throws ApiTccException {
		try {			
			
			return userVO;
		} catch (ApiTccException e) {
			throw e;
		} catch (Exception e) {
			throw new ApiTccException("Falha ao salvar usuário.", "ERRO_INTERNO", HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}
	
	public UserVO atualizarUsuario(Long codUser, UserVO userVO) throws ApiTccException {
		try {			
			
			return userVO;
		} catch (ApiTccException e) {
			throw e;
		} catch (Exception e) {
			throw new ApiTccException("Falha ao atualizar usuário.", "ERRO_INTERNO", HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}


}
