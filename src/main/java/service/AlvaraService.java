
package service;

import dao.AlvaraDAO; 
import model.Alvara;

public class AlvaraService {
    
    private final AlvaraDAO alvaraDAO;
    
    public AlvaraService() {
        this.alvaraDAO = new AlvaraDAO();        
    }
    
    public void cadastrarAlvara(Alvara alvara) { 
        validarAlvara(alvara); 
        alvaraDAO.salvar(alvara); 
    }
    
    private void validarAlvara(Alvara alvara) {
        if (alvara == null) {
            throw new IllegalArgumentException(
            "Os dados do alvará não foram informados."
            
            );
        }
        
        if (alvara.getNome() == null
                || alvara.getNome().trim().isEmpty()) {
        throw new IllegalArgumentException(
                "O nome do alvará é obrigatório."
        );
    }
       if (alvara.getTipo() == null
               || alvara.getTipo().trim().isEmpty()) {
           throw new IllegalArgumentException(
                   "O tipo do alvará é obrigatório."
           ); 
       }
       
       if (alvara.getProcesso() ==null
               || alvara.getProcesso().trim().isEmpty()) {
           throw new IllegalArgumentException(
                   "O número do processo é obrigatório."
           );
       }
       
       
         if (alvara.getValor() == null) {
            throw new IllegalArgumentException(
                "O valor do alvará é obrigatório."
            );
        }

         if (alvara.getValor() < 0) {
            throw new IllegalArgumentException(
                "O valor do alvará não pode ser negativo."
            );
        } 
         
         if (alvara.getDataAlvara() == null) { 
             throw new IllegalArgumentException( 
                     "A data do alvará é obrigatória." 
             ); 
         } 
    }
    
    public java.util.List<Alvara> listarAlvaras() {
        return alvaraDAO.listar();
    }
}       
        
