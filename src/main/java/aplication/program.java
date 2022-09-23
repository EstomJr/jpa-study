package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class program {

	public static void main(String [] args) {
		
		Pessoa p1 = new Pessoa(null, "Estom","estonjr@at,com");
		//salvando dados no objeto pessoa
		Pessoa p2 = new Pessoa(null, "Est","eston@at,com");
				
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		//EntityManagerFactory é utilizado para instanciar objetos EntityManager
				//Persistence.createEntityMG passa o nome e as definições de configuração salvos no persistence.xml
		
		EntityManager em = emf.createEntityManager();
		//EntityManager é a classe que efetua as operações de acesso a dados na entidade(persistir, deletar, buscar)

		em.persist(p1);
		//Persiste o bjeto p1 no banco de dados
		
		Pessoa p = em.find(Pessoa.class, 3);
		//Busca um objeto no banco passando os argumentos da class e o ID
		
		em.remove(p);
		//Remove um objeto do banco após retornar o objeto com find
		
		//Observação: quando for pra fazer uma operação que não seja só leitura simples de arquivo(ex: salvar/remover)
		//precisa de uma transação
		
		em.getTransaction().begin();
		// o begin para fazer a operação no banco
		
		em.getTransaction().commit();
		// e o commit pra salvar essas operações
		
				
		em.close();
		emf.close();
		//Fecha as classes
	}
}
