package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.Uom;

public interface UomRepository 
	extends JpaRepository<Uom, Integer>
{

}
