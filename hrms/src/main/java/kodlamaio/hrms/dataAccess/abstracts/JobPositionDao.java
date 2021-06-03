package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobPositions;

public interface JobPositionDao extends JpaRepository<JobPositions, Integer>{
	
	// CRUD operasyonları Jparepository artık ile kullanıma hazır
	
}
