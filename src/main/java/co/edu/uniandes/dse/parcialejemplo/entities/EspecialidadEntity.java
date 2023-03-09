
package co.edu.uniandes.dse.parcialejemplo.entities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import uk.co.jemos.podam.common.PodamExclude;

@Getter
@Setter
@Entity /**Se convertira en una tabla en la BD */
public class EspecialidadEntity{
    private Long id;
    private String descripción;
    private String nombre;

    /**relacion @oneToMany una especialidad puede ser ejercida por varios medicos*/
    @PodamExclude
    @OneToMany(mappedBy="especialidad", cascade=CascadeType.PERSIST,orphanRemoval=true)
    private List<MedicoEntity> medicos = new ArrayList<>();



}