/**Importar paquete y demás cosas */
package co.edu.uniandes.dse.parcialejemplo.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**Importar el repositorio */
import co.edu.uniandes.dse.parcialejemplo.entities.MedicoEntity; 

@Repository
public interface MedicoRepository extends JpaRepository<MedicoEntity, Long>{
    List<MedicoEntity>findByid(Long id);
}