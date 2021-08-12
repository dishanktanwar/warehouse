package in.nareshit.raghu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.model.Uom;
import in.nareshit.raghu.repo.UomRepository;
import in.nareshit.raghu.service.IUomService;

@Service
public class UomServiceImpl implements IUomService {
	@Autowired
	private UomRepository repo;
	
	@Override
	public Integer saveUom(Uom uom) {
		return repo.save(uom).getId();
	}

	@Override
	public List<Uom> getAllUoms() {
		return repo.findAll();
	}

}
