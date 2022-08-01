
package com.portfolio.agustincastilla.Controller;

import com.portfolio.agustincastilla.Entity.Proyectos;
import com.portfolio.agustincastilla.Services.ProyectosService;
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
 @RequestMapping("/proyectos")
@CrossOrigin( origins  = "https://portfolioagustincastilla.web.app")
public class ProyectosController {
     
    private final ProyectosService proyectosService;
    
    public ProyectosController (ProyectosService proyectosService) {
        this.proyectosService = proyectosService;
    }
    
   @GetMapping ("/lista")
   public ResponseEntity<List<Proyectos>> traerProyecto() {
          List<Proyectos> proyectos=proyectosService.traerProyecto();
       return new ResponseEntity<>(proyectos,HttpStatus.OK);
   }
  
    
   @PutMapping("/editar")
   public ResponseEntity<Proyectos> editarProyecto(@RequestBody Proyectos proyecto){
       Proyectos editarProyectos=proyectosService.editarProyecto(proyecto);
       return new ResponseEntity<>(editarProyectos, HttpStatus.OK);
   }
   
   @PostMapping("/agregar")
     public ResponseEntity<Proyectos> crearProyecto(@RequestBody Proyectos proyecto){
          Proyectos nuevoProyectos =proyectosService.agregarProyecto(proyecto);
          return new ResponseEntity<>(  nuevoProyectos,HttpStatus.CREATED);
      }
     
     @DeleteMapping("/borrar/{id}")
     public ResponseEntity<?> borrarProyecto(@PathVariable ("id") Long id){
         proyectosService.borrarProyecto(id);
     
     return new ResponseEntity<>(HttpStatus.OK);
     }       
}