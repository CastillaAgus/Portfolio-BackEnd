
package com.portfolio.agustincastilla.Repository;

import com.portfolio.agustincastilla.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion,Long> {
    
}
