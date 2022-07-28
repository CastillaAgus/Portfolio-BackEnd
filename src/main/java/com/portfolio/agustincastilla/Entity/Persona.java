
package com.portfolio.agustincastilla.Entity;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String img;
    private String descripcion;
    private String titulo;

    @OneToMany (fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;
    
    
    @OneToMany (fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;
    
    
    @OneToMany (fetch = FetchType.LAZY, mappedBy = "idSkills")
    private List<Skills> skillsList;
    
    
    
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String img, String descripcion, String titulo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.descripcion = descripcion;
        this.titulo = titulo;
    }
    
    
}
