package com.project.Comic.Controller;

import com.project.Comic.Model.Comic;
import com.project.Comic.Model.Usuario;
import com.project.Comic.Repository.ComicId;
import com.project.Comic.Repository.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/comics")
public class RestController {


    @Autowired
    private RepositoryUsuario repositoryUsuario;
    private ComicId repositorycomic;


    @PostMapping
    public String cadastrarUsuario( @RequestBody Usuario usuario){
        Usuario usuarios=repositoryUsuario.save(usuario);
        return usuarios.toString();

    }

    @GetMapping("/{comicId}")
    public ResponseEntity<Comic> getComic(@PathVariable int comicId){
        Comic comic = repositorycomic.buscaComic(comicId);

        return comic != null ? ResponseEntity.ok().body(comic) :ResponseEntity.notFound().build();
    }


}
