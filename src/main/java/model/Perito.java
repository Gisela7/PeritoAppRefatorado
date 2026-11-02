package model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "perito")
public class Perito implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nome;
    
    @Column(length = 150)
    private String email;

    @Column(length = 14)
    private String cpf;

    @Column(length = 100)
    private String banco;

    @Column(length = 20)
    private String agencia;

    @Column(length = 20)
    private String conta;

    // Construtor padrão obrigatório
    public Perito() {
    }

    // Getters e Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getBanco() { return banco; }
    public void setBanco(String banco) { this.banco = banco; }

    public String getAgencia() { return agencia; }
    public void setAgencia(String agencia) { this.agencia = agencia; }

    public String getConta() { return conta; }
    public void setConta(String conta) { this.conta = conta; }
}