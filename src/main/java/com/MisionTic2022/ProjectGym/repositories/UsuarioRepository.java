package com.MisionTic2022.ProjectGym.repositories;

import com.MisionTic2022.ProjectGym.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    
}
