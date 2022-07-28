
package com.portfolio.agustincastilla.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPro;
    private String tituloPro;
    private int fechaPro;
     private String descPro;
    private String tipoPro;
    private String estadoPro;

    public Proyectos() {
    }

    public Proyectos(Long idPro, String tituloPro, int fechaPro, String descPro, String tipoPro, String estadoPro) {
        this.idPro = idPro;
        this.tituloPro = tituloPro;
        this.fechaPro = fechaPro;
        this.descPro = descPro;
        this.tipoPro = tipoPro;
        this.estadoPro = estadoPro;
    }

    
    
}
