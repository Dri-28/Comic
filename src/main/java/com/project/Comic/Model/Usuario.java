package com.project.Comic.Model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Usuario {



    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    @Column
    public String id;

    @Column
    @NotBlank
    public String nome;

    @Column
    public String email;
    @Column
    public String cpf;
    @Column
    public String nascimento;

    public String getId() {
        return id;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;}

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString(){
        return "Usuario{" +
                "id=' " + id+'\'' +
                ",nome=' " + nome + '\'' +
                ",email=  '" + email + '\'' +
                "cpf='  " + cpf + '\''+
                "nascimento='  " + nascimento+ '\''+
                '}';
    };

}


