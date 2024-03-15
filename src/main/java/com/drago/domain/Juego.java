package com.drago.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name="juego")
public class Juego implements Serializable{
        private static final long serialVersionUID = 1L;
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idJuego;
        
        @NotEmpty
        private String nombre;
        
        private String descripcion;
        
        private String imagen;
        
}
