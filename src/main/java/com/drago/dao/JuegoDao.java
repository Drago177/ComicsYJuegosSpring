package com.drago.dao;

import com.drago.domain.Juego;
import org.springframework.data.repository.CrudRepository;

public interface JuegoDao extends CrudRepository<Juego, Long> {
        
}
