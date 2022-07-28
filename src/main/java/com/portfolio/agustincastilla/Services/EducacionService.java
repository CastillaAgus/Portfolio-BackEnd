 
package com.portfolio.agustincastilla.Services;

import com.portfolio.agustincastilla.Entity.Educacion;
import com.portfolio.agustincastilla.Repository.IEducacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class EducacionService {
    private final IEducacionRepository iEducacionRepository;
    
    @Autowired 
    public EducacionService(IEducacionRepository iEducacionRepository) {
        this.iEducacionRepository = iEducacionRepository;
    }
    
    public Educacion agregarEducacion(Educacion educacion) {
        return iEducacionRepository.save(educacion);
    }
    
    public List<Educacion> traerEducacion(){
        return iEducacionRepository.findAll();
        
    }
    
    public Educacion editarEducacion(Educacion educacion){
     return iEducacionRepository.save(educacion);  
    }
    
    public void borrarEducacion (Long id){
        iEducacionRepository.deleteById(id);
    }
    public Optional<Educacion> buscarIdEducacion(Long id){
     return iEducacionRepository.findById(id);
    }
     
   
    
}
