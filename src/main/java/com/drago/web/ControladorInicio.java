package com.drago.web;

import com.drago.domain.Juego;
import com.drago.service.JuegoService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControladorInicio {

        @Autowired
        private JuegoService juegoService;

        @GetMapping("/")
        public String inicio(Model model) {
                List<Juego> juegos = juegoService.listarJuegos();
                model.addAttribute("juegos", juegos);
                return "index";
        }

        @GetMapping("/agregar")
        public String agregar(Juego juego) {
                return "modificar";
        }

        @PostMapping("/guardar")
        public String guardar(@Valid Juego juego, Errors errores) {
                if(errores.hasErrors()){
                        return "modificar";
                }
                juegoService.guardar(juego);
                return "redirect:/";
        }

        @GetMapping("/editar/{idJuego}")
        public String editar(Juego juego, Model model) {
                juego = juegoService.encontrarJuego(juego);
                model.addAttribute("juego", juego);
                return "modificar";
        }

        @GetMapping("/eliminar/{idJuego}")
        public String eliminar(Juego juego) {
                juegoService.eliminar(juego);
                return "redirect:/";
        }
}
