package com.project.Comic.Repository;




import com.project.Comic.Model.Comic;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url= "http://gateway.marvel.com/v1/public/comics/",name="ComicId")
public interface ComicId {

    @GetMapping("{comicId}/json")
    Comic buscaComic (@PathVariable("comicId")int comicId);

    }

