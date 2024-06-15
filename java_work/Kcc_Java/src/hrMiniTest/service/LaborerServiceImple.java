package hrMiniTest.service;

import java.time.LocalDate;
import java.util.List;

import hrMiniTest.dao.LaborerDao;
import hrMiniTest.domain.Laborer;

public class LaborerServiceImple implements LaborerService {

	private LaborerDao laborDao;
	
	public LaborerServiceImple() {}
	
	public LaborerServiceImple(LaborerDao laborDao) {

		this.laborDao = laborDao;
	}

	@Override
	public List<Laborer> getLaborers() {
		
		return laborDao.selectLaborers();
	}

	@Override
	public void addLaborer(String laborerName, LocalDate hireDate) {
		laborDao.insertLaborer(laborerName, hireDate);
	}

	@Override
	public void fixLaborer(Laborer laborer) {
		laborDao.updateLaborer(laborer);
	}

	@Override
	public void delLaborer(int laborerId) {
		laborDao.deleteLaborer(laborerId);
	}

}
