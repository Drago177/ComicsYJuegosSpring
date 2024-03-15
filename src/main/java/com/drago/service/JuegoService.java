package com.drago.service;

import com.drago.domain.Juego;
import java.util.List;

public interface JuegoService {
        
        public List<Juego> listarJuegos();
        
        public void guardar(Juego juego);
        
        public void eliminar(Juego juego);
        
        public Juego encontrarJuego(Juego juego);
}
