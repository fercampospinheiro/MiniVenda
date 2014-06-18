package br.com.lifejesus.minivenda.domain;

import javax.persistence.*;

@Entity
@Table(name="tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String username;

    private String senha;

    /** Construtor de uso exclusivo do JPA */
    public User() {}

    public Integer getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!username.equals(user.getUsername())) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }
}
