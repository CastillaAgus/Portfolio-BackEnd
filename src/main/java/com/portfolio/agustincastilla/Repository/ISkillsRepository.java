
package com.portfolio.agustincastilla.Repository;

import com.portfolio.agustincastilla.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillsRepository  extends JpaRepository<Skills,Long>{
    
}
