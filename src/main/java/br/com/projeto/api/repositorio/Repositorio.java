package br.com.projeto.api.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.modelo.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa,Long> {
   
   List<Pessoa>findAll();

   Pessoa findByCodigo(long codigo);

   List<Pessoa>findByOrderByNome();// Asc Desc

   List<Pessoa>findByNomeOrderByIdadeDesc(String nome);

   List <Pessoa> findByNomeContaining(String termo); 

   List <Pessoa> findByNomeStartsWith(String termo);

   List <Pessoa> findByNomeEndsWith(String termo); 

   @Query(value = "SELECT SUM(idade) FROM pessoas", nativeQuery=true)
  Long somaIdades();
   
  @Query(value="SELECT * FROM pessoas WHERE idade>= :idade",nativeQuery = true)
  List<Pessoa>idadeMaiorIgual(long idade); 

  int countByCodigo(long codigo);


}
