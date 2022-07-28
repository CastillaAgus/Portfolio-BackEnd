
package com.portfolio.agustincastilla.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkills; 
    private int porcentajeSkills;
    private String imgSkills;
    private String nombreSkills;

    public Skills() {
    }

    public Skills(Long idSkills, int porcentajeSkills, String imgSkills, String nombreSkills) {
        this.idSkills = idSkills;
        this.porcentajeSkills = porcentajeSkills;
        this.imgSkills = imgSkills;
        this.nombreSkills = nombreSkills;
    }
    
    
    
    
    
    
}
