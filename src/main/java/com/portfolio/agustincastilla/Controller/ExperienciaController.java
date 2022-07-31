
package com.portfolio.agustincastilla.Controller;

import com.portfolio.agustincastilla.Entity.Experiencia;
import com.portfolio.agustincastilla.Services.ExperienciaService;
import java.util.List;
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
@RequestMapping("/experiencia")
@CrossOrigin("https://portfolioagustincastilla.web.app")
public class ExperienciaController {
    private final ExperienciaService experienciaService;
    
    public ExperienciaController (ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }
    
   @GetMapping ("/lista")
   public ResponseEntity<List<Experiencia>> traerExperiencia() {
          List<Experiencia> experiencia= experienciaService.traerExperiencia();
       return new ResponseEntity<>(experiencia,HttpStatus.OK);
   }
  
      @PutMapping("/editar")
   public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
       Experiencia editarExperiencia=experienciaService.editarExperiencia(experiencia);
       return new ResponseEntity<>(editarExperiencia, HttpStatus.OK);
   }
   
   @PostMapping("/agregar")
     public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia){
          Experiencia nuevaExperiencia=experienciaService.agregarExperiencia(experiencia);
          return new ResponseEntity<>(  nuevaExperiencia,HttpStatus.CREATED);
      }
     
     @DeleteMapping("/borrar/{id}")
     public ResponseEntity<?> borrarExperiencia(@PathVariable("id") Long id){
         experienciaService.borrarExperiencia(id);
     
     return new ResponseEntity<>(HttpStatus.OK);
     }       
}
