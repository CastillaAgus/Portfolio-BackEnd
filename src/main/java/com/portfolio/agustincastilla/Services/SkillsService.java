
package com.portfolio.agustincastilla.Services;

import com.portfolio.agustincastilla.Entity.Skills;
import com.portfolio.agustincastilla.Repository.ISkillsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsService {
    
    private final ISkillsRepository iSkillsRepository;
    
    @Autowired 
    public SkillsService(ISkillsRepository iSkillsRepository) {
        this.iSkillsRepository = iSkillsRepository;
    }
    
    public Skills agregarSkills(Skills skill) {
        return iSkillsRepository.save(skill);
    }
    
    public List<Skills> traerSkills(){
        return iSkillsRepository.findAll();
        
    }
    
    public Skills editarSkills(Skills skill){
     return iSkillsRepository.save(skill);  
    }
    
    public void borrarSkills (Long id){
        iSkillsRepository.deleteById(id);
    }
    public Optional<Skills> buscarIdSkills(Long id){
     return iSkillsRepository.findById(id);
    }
    
}
