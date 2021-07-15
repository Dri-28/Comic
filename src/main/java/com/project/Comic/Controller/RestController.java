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

import javax.validation.Valid;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/comics")
public class RestController {


    @Autowired
    private RepositoryUsuario repositoryUsuario;
    @Autowired
    private ComicId repositoryComic;


    @PostMapping
    public String cadastrarUsuario( @Valid @RequestBody Usuario usuario){
        Usuario usuarios=repositoryUsuario.save(usuario);
        return usuarios.toString();

    }

    @GetMapping("/{id}/json")
    public ResponseEntity<Comic> getComic(@PathVariable int id){

        Comic comic = repositoryComic.buscaComic(id);

        return comic != null ? ResponseEntity.ok().body(comic) : ResponseEntity.notFound().build();
    }


}
