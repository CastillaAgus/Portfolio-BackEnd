
package com.portfolio.agustincastilla.Repository;

import com.portfolio.agustincastilla.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia,Long> {
    
}
