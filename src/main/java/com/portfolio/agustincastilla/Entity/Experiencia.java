
package com.portfolio.agustincastilla.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;




@Getter @Setter
@Entity
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String tituloExp;
    private int fechaIniExp;
    private int fechaFinExp ;
    private String descExp;
    private String tipoExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, int fechaIniExp, int fechaFinExp, String descExp, String tipoExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaIniExp = fechaIniExp;
        this.fechaFinExp = fechaFinExp;
        this.descExp = descExp;
        this.tipoExp = tipoExp;
    }

   
    
}
 