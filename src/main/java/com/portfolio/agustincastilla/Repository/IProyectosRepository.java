
package com.portfolio.agustincastilla.Repository;

import com.portfolio.agustincastilla.Entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectosRepository  extends JpaRepository<Proyectos,Long>{
    
}
