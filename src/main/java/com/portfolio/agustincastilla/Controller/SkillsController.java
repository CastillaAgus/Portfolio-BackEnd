
package com.portfolio.agustincastilla.Controller;

import com.portfolio.agustincastilla.Entity.Skills;
import com.portfolio.agustincastilla.Services.SkillsService;
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
 @RequestMapping("/skills")
@CrossOrigin( origins ="https://portfolioagustincastilla.web.app")
 public class SkillsController {
     
    private final SkillsService skillsService;
    
    public SkillsController (SkillsService skillsService) {
        this.skillsService = skillsService;
    }
    
   @GetMapping ("/lista")
   public ResponseEntity<List<Skills>> traerSkills() {
          List<Skills> skills= skillsService.traerSkills();
       return new ResponseEntity<>(skills,HttpStatus.OK);
   }
         
      @PutMapping("/editar")
   public ResponseEntity<Skills> editarSkills(@RequestBody Skills skills){
       Skills editarSkills=skillsService.editarSkills(skills);
       return new ResponseEntity<>(editarSkills, HttpStatus.OK);
   }
   
   @PostMapping("/agregar")
     public ResponseEntity<Skills> crearSkills(@RequestBody Skills skills){
          Skills nuevaSkills =skillsService.agregarSkills(skills);
          return new ResponseEntity<>(  nuevaSkills,HttpStatus.CREATED);
      }
     
     @DeleteMapping("/borrar/{id}")
     public ResponseEntity<?> borrarSkills(@PathVariable ("id") Long id){
         skillsService.borrarSkills(id);
     
     return new ResponseEntity<>(HttpStatus.OK);
     }       
}


