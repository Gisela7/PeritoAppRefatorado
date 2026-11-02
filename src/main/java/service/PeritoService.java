package service;

import dao.PeritoDAO;
import model.Perito;
import java.util.List;


public class PeritoService {
    
    private final PeritoDAO peritoDAO;
    
    public PeritoService() {
        this.peritoDAO = new PeritoDAO();
    }
    
    public void salvar(Perito perito) {
        
        if (perito == null) {
            throw new IllegalArgumentException(
            "Os dados do perito não foram informados.");
        }
        
        if (perito.getNome() == null
                || perito.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "O nome do perito é obrigatório.");
        }
         
        if (perito.getCpf() == null
                || perito.getCpf().trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "O CPF do perito é obrigatório.");
        }
          
        peritoDAO.salvar(perito);
    }
    
    public List<Perito> listarTodos() {
        return peritoDAO.listarTodos();
    }
    
    public void excluir(int id) {
        
        if (id<= 0) {
            throw new IllegalArgumentException(
            "O código do perito é inválido.");
        }
        
        peritoDAO.excluir(id);
    }    
}
