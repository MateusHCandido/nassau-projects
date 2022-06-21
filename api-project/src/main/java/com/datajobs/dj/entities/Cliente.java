package com.datajobs.dj.entities;


import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Table(name = "cliente")
@Entity(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataCadastro", nullable = false)
    private Date dataCadastro;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cpf", nullable = false, length = 11)
    private String cpf;


    @Column(name = "dataNascimento", nullable = false, length = 10)
    private String dataNascimento;

    @Column(name = "formacao", nullable = false, length = 65)
    private String formacao;

    @Column(name= "anoFormacao", nullable = false, length = 4)
    private String anoFormacao;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Lob
    @Column(name = "descricaoAcademica", nullable = false)
    private String descricaoAcademica;


    public Cliente(){}

    public Cliente(Long id, Date dataCadastro, String nome, String cpf, String dataNascimento, String formacao, String anoFormacao, String email, String descricaoAcademica) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.formacao = formacao;
        this.anoFormacao = anoFormacao;
        this.email = email;
        this.descricaoAcademica = descricaoAcademica;

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
        nome= nome.replaceAll("[^a-zA-Z]" + " ", "");
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        cpf= cpf.replaceAll("[^0-9]+", "");
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        dataNascimento = dataNascimento.replaceAll("[^0-9]+" + "/", "");
        this.dataNascimento = dataNascimento;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAnoFormacao() {return anoFormacao;}

    public void setAnoFormacao(String anoFormacao) {
        this.anoFormacao = anoFormacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricaoAcademica() {
        return descricaoAcademica;
    }

    public void setDescricaoAcademica(String descricaoAcademica) {
        this.descricaoAcademica = descricaoAcademica;
    }
}
