
package service;

import model.Alvara;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AlvaraServiceTest {
    
    private final AlvaraService service = new AlvaraService();
    
    @Test
    public void deveRejeitarAlvaraNulo() {
        
        assertThrows(
                IllegalArgumentException.class,
                () -> service.validarAlvara(null)
        );
    }
    
    @Test
    public void deveRejeitarNomeVazio() {
        
        Alvara alvara = new Alvara();
        alvara.setNome("");
        
        assertThrows(
                IllegalArgumentException.class,
                () -> service.validarAlvara(alvara)
        );
    }
    
    @Test
    public void deveRejeitarValorNulo() {
        
        Alvara alvara = criarAlvaraValido();
        alvara.setValor(null);
        
        assertThrows(
                IllegalArgumentException.class,
                () -> service.validarAlvara(alvara)
        );
    }
    
    @Test
    public void deveRejeitarValorNegativo() {
        
        Alvara alvara = criarAlvaraValido();
        alvara.setValor(-100.0);
        
        assertThrows(
                IllegalArgumentException.class,
                () -> service.validarAlvara(alvara)
        );
    }
    
    private Alvara criarAlvaraValido() {
        
        Alvara alvara = new Alvara();
        
        alvara.setNome("Alvareá de teste");
        alvara.setTipo("Judicial");
        alvara.setProcesso("12345678901234567890");
        alvara.setValor(1000.0);
        alvara.setDataAlvara(new java.util.Date());
        
        
        return alvara;
    }
    
    @Test
    public void deveAceitarAlvaraValido() {
        
        Alvara alvara = criarAlvaraValido();
        
        
        assertDoesNotThrow(
                () -> service.validarAlvara(alvara)
        
        );
    }
                
}
    

