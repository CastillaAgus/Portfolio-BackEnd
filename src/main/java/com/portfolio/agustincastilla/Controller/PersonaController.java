package com.portfolio.agustincastilla.Controller;

import com.portfolio.agustincastilla.Entity.Persona;
import com.portfolio.agustincastilla.Services.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
@CrossOrigin("https://portfolioagustincastilla.web.app")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Persona> obtenerPersona(@PathVariable("id") Long id) {
        Persona persona = personaService.buscarIdPersona(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    
    @PostMapping("/agregar")
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona) {
        Persona nuevaPersona = personaService.agregarPersona(persona);
        return new ResponseEntity<>(nuevaPersona, HttpStatus.CREATED);
    }

    
    @PutMapping("/editar")
    public ResponseEntity<Persona> editarPersona(@RequestBody Persona persona) {
        Persona editarPersona = personaService.editarPersona(persona);
        return new ResponseEntity<>(editarPersona, HttpStatus.OK);
    }

    
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrarPersona(@PathVariable("id") Long id) {
        personaService.borrarPersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
