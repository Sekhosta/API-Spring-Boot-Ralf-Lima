package br.com.projeto.api.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity 
@Table(name="clientes")
public class Cliente {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo ;

    @NotEmpty(message = "Informe um nome!")
   private String nome; 
   @NotEmpty(message = "Informe um email válido!")
   private String email; 

   

    public long getCodigo() {
        return codigo;
    }

    
    public void setCodigo(long codigo) {
        this.codigo = codigo;
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

}
