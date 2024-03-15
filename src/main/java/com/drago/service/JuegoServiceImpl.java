package com.drago.service;

import com.drago.dao.JuegoDao;
import com.drago.domain.Juego;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JuegoServiceImpl implements JuegoService {

        @Autowired
        private JuegoDao juegoDao;
        
        @Override
        @Transactional(readOnly = true)
        public List<Juego> listarJuegos() {
                return (List<Juego>) juegoDao.findAll();
        }
        
        @Override
        @Transactional
        public void guardar(Juego juego) {
                juegoDao.save(juego);
        }

        @Override
        @Transactional
        public void eliminar(Juego juego) {
                juegoDao.delete(juego);
        }

        @Override
        @Transactional(readOnly = true)
        public Juego encontrarJuego(Juego juego) {
                return juegoDao.findById(juego.getIdJuego()).orElse(null);
        }
        
}
