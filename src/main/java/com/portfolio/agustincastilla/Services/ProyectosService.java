
package com.portfolio.agustincastilla.Services;

import com.portfolio.agustincastilla.Entity.Proyectos;
import com.portfolio.agustincastilla.Repository.IProyectosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class ProyectosService {
    
    private final IProyectosRepository iProyectosRepository;
    
    @Autowired 
    public ProyectosService(IProyectosRepository iProyectosRepository) {
        this.iProyectosRepository = iProyectosRepository;
    }
    
    public Proyectos agregarProyecto(Proyectos proyecto) {
        return iProyectosRepository.save(proyecto);
    }
    
    public List<Proyectos> traerProyecto(){
        return iProyectosRepository.findAll();
        
    }
    
    public Proyectos editarProyecto(Proyectos proyecto){
     return iProyectosRepository.save(proyecto);  
    }
    
    public void borrarProyecto (Long id){
        iProyectosRepository.deleteById(id);
    }
    public Optional<Proyectos> buscarIdProyecto(Long id){
     return iProyectosRepository.findById(id);
    }
    
}
