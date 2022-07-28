
package com.portfolio.agustincastilla.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity 
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String tituloEdu;
    private int fechaEdu;
    private String descEdu;
    private String imgEdu;
    private String tipoEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, int fechaEdu, String descEdu, String imgEdu, String tipoEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
        this.descEdu = descEdu;
        this.imgEdu = imgEdu;
        this.tipoEdu = tipoEdu;
    }
     
  

}
