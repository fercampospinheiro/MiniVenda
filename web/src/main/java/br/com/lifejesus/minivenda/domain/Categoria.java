package br.com.lifejesus.minivenda.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

//@Entity
@Table(name = "tb_categoria")
public class Categoria {
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	@ManyToMany(mappedBy = "categorias")
	private List<Produto> produtos = new ArrayList<Produto>();

	public Categoria() {

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

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
