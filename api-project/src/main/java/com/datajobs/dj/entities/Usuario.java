package com.datajobs.dj.entities;

import javax.persistence.*;
import java.util.Date;


@Table(name = "usuario")
@Entity(name = "usuario")
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataCadastro", nullable = false)
    private Date dataCadastro;

    @Column(name = "nome", nullable = false, length = 60)
    private String nome;

    @Column(name = "login",unique = true ,nullable = false, length = 60)
    private String login;

    @Column(name = "password", nullable = false, length = 14)
    private String password;

    @Column(name = "email", nullable = false, length = 100)
    private String email;


    public Usuario() {
    }

    public Usuario(Long id, Date dataCadastro, String nome, String login, String password, String email) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.nome = nome;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        nome = nome.replaceAll("[^a-zA-Z]" + " ","" );
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
