
package com.portfolio.agustincastilla.Services;

import com.portfolio.agustincastilla.Entity.Experiencia;
import com.portfolio.agustincastilla.Repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {
    private final IExperienciaRepository iExperienciaRepository;
    
    @Autowired
    public ExperienciaService (IExperienciaRepository iExperienciaRepository){
            this.iExperienciaRepository = iExperienciaRepository;}
    
     public Experiencia agregarExperiencia(Experiencia experiencia) {
        return iExperienciaRepository.save(experiencia);
    }
    
    public List<Experiencia> traerExperiencia(){
        return iExperienciaRepository.findAll();
        
    }
    
    public Experiencia editarExperiencia(Experiencia experiencia){
     return iExperienciaRepository.save(experiencia);  
    }
    
    public void borrarExperiencia (Long id){
        iExperienciaRepository.deleteById(id);
    }
    public Optional<Experiencia> buscarIdExperiencia(Long id){
     return iExperienciaRepository.findById(id);
    }
    
    
    
    
}
