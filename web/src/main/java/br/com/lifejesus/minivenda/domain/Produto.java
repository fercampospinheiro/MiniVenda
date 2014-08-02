package br.com.lifejesus.minivenda.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

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

	@ManyToOne
    @JoinColumn(name = "idCategoria")
	private Categoria categoria;

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

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;

        Produto produto = (Produto) o;

        if (!categoria.equals(produto.categoria)) return false;
        if (!fornecedores.equals(produto.fornecedores)) return false;
        if (!id.equals(produto.id)) return false;
        if (!nome.equals(produto.nome)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + nome.hashCode();
        result = 31 * result + fornecedores.hashCode();
        result = 31 * result + categoria.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", fornecedores=" + fornecedores +
                ", categoria=" + categoria +
                '}';
    }
}
