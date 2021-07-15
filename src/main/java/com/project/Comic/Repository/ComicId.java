package com.project.Comic.Repository;




import com.project.Comic.Model.Comic;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url= "https://gateway.marvel.com/v1/public/comics?ts=1&apikey=4746&hash=08cb291f1de83a710a9619fe2191621c699496ab/", name="gateway")
public interface ComicId {

    @GetMapping("{comicId}/json")
    Comic buscaComic (@PathVariable("id")int id);

    }

