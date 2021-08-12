package in.nareshit.raghu.service;

import java.util.List;

import in.nareshit.raghu.model.Uom;

public interface IUomService {

	public Integer saveUom(Uom uom);
	public List<Uom> getAllUoms();
}
