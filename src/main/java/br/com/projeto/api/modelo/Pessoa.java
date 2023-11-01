package br.com.projeto.api.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoas")
public class Pessoa  {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long codigo;
private String nome ;
private long idade;

   


    /**
     * @return long return the codigo
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return long return the idade
     */
    public long getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(long idade) {
        this.idade = idade;
    }

}
