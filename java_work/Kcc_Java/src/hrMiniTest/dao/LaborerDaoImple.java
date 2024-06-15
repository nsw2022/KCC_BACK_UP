package hrMiniTest.dao;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import hrMiniTest.domain.Laborer;

public class LaborerDaoImple implements LaborerDao {
	private List<Laborer> laborers;
	private int laborerIdSeq;
	
/*
 		List<Laborer> selectLaborers(): 모든 구직자 목록을 조회합니다.
		void insertLaborer(String laborerName, LocalDate hireDate): 새로운 구직자를 등록합니다.
		void updateLaborer(Laborer laborer): 기존 구직자 정보를 업데이트합니다.
		void deleteLaborer(int laborerId): 구직자 정보를 삭제합니다.
  */

	public LaborerDaoImple(List<Laborer> laborers) {
		super();
		this.laborers = laborers;
		this.laborerIdSeq = 1;
	}

	@Override
	public List<Laborer> selectLaborers() {
		return laborers;
	}
	
	private Laborer selectLaborer(int laborerId) {
		List<Laborer> list = laborers.stream()
				.filter(laborer -> laborer.getLaborerId()==laborerId)
				.collect(Collectors.toList());
		Laborer laborer = null;
		if (!list.isEmpty()) {
			laborer=list.get(0);
		}
		return laborer;
	}

	@Override
	public void insertLaborer(String laborerName, LocalDate hireDate) {
		laborers.add(new Laborer(laborerIdSeq++, laborerName, hireDate));
	}

	@Override
	public void updateLaborer(Laborer laborer) {
	
		
		this.deleteLaborer(laborer.getLaborerId());
		
	
		laborers.add(laborer);
		laborers.sort(Comparator.comparing(Laborer::getLaborerId));
	}

	@Override
	public void deleteLaborer(int laborerId) {
	    Laborer laborer = selectLaborer(laborerId);
	    if (laborer != null) {
	        laborers.remove(laborer);
	    } else {
	    	throw new RuntimeException("해당 구직자가 없습니다.");
	        //throw new NonException("해당 구직자가 없습니다.");
	    }
	}


}
