
package com.portfolio.agustincastilla.Services;

import com.portfolio.agustincastilla.Entity.Persona;
import com.portfolio.agustincastilla.Exception.UserNotFoundException;
import com.portfolio.agustincastilla.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService {
   
    private final IPersonaRepository iPersonaRepository;
    
    @Autowired 
    public PersonaService(IPersonaRepository iPersonaRepository) {
        this.iPersonaRepository = iPersonaRepository;
    }
    
    public  Persona agregarPersona( Persona persona) {
        return iPersonaRepository.save(persona);
    }
    
    public List<Persona> traerPersona(){
        return iPersonaRepository.findAll();
        
    }
    
    public Persona editarPersona( Persona persona){
     return iPersonaRepository.save(persona);  
    }
    
    public void borrarPersona (Long id){
        iPersonaRepository.deleteById(id);
    }
    public Persona buscarIdPersona(Long id){
     return iPersonaRepository.findById(id).orElseThrow(() ->new UserNotFoundException("Usuario no encontrado"));
    }
}
