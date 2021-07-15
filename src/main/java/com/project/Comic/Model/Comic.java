package com.project.Comic.Model;


import org.hibernate.annotations.Table;

import javax.persistence.Entity;


public class Comic {



    public int id;
    public String Titulo;
    public String Preco;
    public String Autores;
    public int ISBN;
    public String Descricao;

    public int getcomicId() {

        return id;
    }

    public void setComicId(int comicId) {
        this.id = comicId;
    }


    public String getTitulo() {

        return Titulo;
    }

    public void setTitulo(String titulo) {

        Titulo = titulo;
    }

    public String getPreco() {

        return Preco;
    }

    public void setPreco(String preco) {

        Preco = preco;
    }

    public String getAutores() {

        return Autores;
    }

    public void setAutores(String autores) {

        Autores = autores;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {

        this.ISBN = ISBN;
    }

    public String getDescricao() {

        return Descricao;
    }

    public void setDescricao(String descricao) {

        Descricao = descricao;
    }
}
