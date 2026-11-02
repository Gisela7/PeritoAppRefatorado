package model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "alvaras")
public class Alvara implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 100)
    private String nome;
    private String tipo;
    private String processo;
    private Double valor;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dataAlvara;
    private boolean pago;

    public Alvara() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProcesso() {
        return processo;
    }

    public void setProcesso(String processo) {
        this.processo = processo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Date dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    
}
