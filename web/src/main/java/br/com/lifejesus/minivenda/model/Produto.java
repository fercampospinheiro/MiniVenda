package br.com.lifejesus.minivenda.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	@ManyToMany
	@JoinTable(name = "tb_produto_tb_fornecedor", joinColumns = @JoinColumn(name = "idProduto"), inverseJoinColumns = @JoinColumn(name = "idFornecedor"))
	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

	@ManyToMany
	@JoinTable(name = "tb_produto_tb_categoria", joinColumns = @JoinColumn(name = "idProduto"), inverseJoinColumns = @JoinColumn(name = "idCategoria"))
	private Collection<Categoria> categorias = new ArrayList<Categoria>();

	public Produto() {
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

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedor(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public Collection<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Collection<Categoria> categorias) {
		this.categorias = categorias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categorias == null) ? 0 : categorias.hashCode());
		result = prime * result
				+ ((fornecedores == null) ? 0 : fornecedores.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (categorias == null) {
			if (other.categorias != null)
				return false;
		} else if (!categorias.equals(other.categorias))
			return false;
		if (fornecedores == null) {
			if (other.fornecedores != null)
				return false;
		} else if (!fornecedores.equals(other.fornecedores))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", fornecedor="
				+ fornecedores + ", categorias=" + categorias + "]";
	}

}
