
package service;

import dao.UsuarioDAO;
import model.Usuario;

public class UsuarioService {

private final UsuarioDAO usuarioDAO;

public UsuarioService() {
    this.usuarioDAO = new UsuarioDAO();    
} 

public Usuario login(String email, String senha) {
    if (email == null || email.trim().isEmpty()) {
        return null;
    }
    
    if (senha == null || senha.trim().isEmpty()) { 
        return null;
    } 
    
    return usuarioDAO.login(email, senha);
}
    
public Usuario buscarPorEmail(String email) {
    if (email == null || email.trim().isEmpty()) {
        return null;
    }
    
    return usuarioDAO.buscarPorEmail(email);
}

public void salvar(Usuario usuario) {
    
    if (usuario == null) {
        throw new IllegalArgumentException(
        "Os dados do usuário não foram informados."
        );
    }
    
    if (usuario.getNome() == null
            || usuario.getNome().trim().isEmpty()) {
        throw new IllegalArgumentException(
            "O nome do usuário é obrigatório"
                
        );
    }
            
    if (usuario.getEmail() == null
            || usuario.getEmail().trim().isEmpty()) {
        throw new IllegalArgumentException(
            "O e-mail do usuário é obrigatório."
        );
    }

    if (usuario.getSenha() == null
            || usuario.getSenha().trim().isEmpty()) {
        throw new IllegalArgumentException(
            "A senha do usuário é obrigatória."
        );
    }

    if (usuario.getTipo() == null
            || usuario.getTipo().trim().isEmpty()) {
        throw new IllegalArgumentException(
            "O tipo do usuário é obrigatório."
        );
    }

    if (usuarioDAO.buscarPorEmail(usuario.getEmail()) != null) {
        throw new IllegalArgumentException(
            "Este e-mail já está cadastrado."
        );
    }            
    
    
    usuarioDAO.salvar(usuario);
}
}


