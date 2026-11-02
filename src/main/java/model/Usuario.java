package model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 255)
    private String senha;
    
    @Column(nullable = false, length = 20)
    private String tipo;
    
    //Construtores
    public Usuario() {
    }

    // ===== GETTERS E SETTERS =====

    public Long getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getTipo() {
        return tipo;
        
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @Override
    public String toString() {
        return nome + " (" + email + ")";
    }
}