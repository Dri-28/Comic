package com.project.Comic.Repository;

import com.project.Comic.Model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUsuario extends CrudRepository<Usuario,String>{


}
