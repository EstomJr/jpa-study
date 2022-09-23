package dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
// Para indicar que a classe de domínio corresponde à tabela

public class Pessoa implements Serializable{
	//Transformar um objeto em byte, ser trasnferido na rede e persistido em banco
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//Vai indicar que o ID vai ser gerado automaticamente
	
	@Column(name="id_pessoa")
	private Integer id;
	
	//Forma de alterar o nome da coluna no banco
	@Column(name="nome_completo")
	private String nome;
	
	@Column(name="email")
	private String email;

	public Pessoa() {
		
	}

	public Pessoa(Integer id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
	
	
	
}
