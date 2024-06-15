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
 		List<Laborer> selectLaborers(): ��� ������ ����� ��ȸ�մϴ�.
		void insertLaborer(String laborerName, LocalDate hireDate): ���ο� �����ڸ� ����մϴ�.
		void updateLaborer(Laborer laborer): ���� ������ ������ ������Ʈ�մϴ�.
		void deleteLaborer(int laborerId): ������ ������ �����մϴ�.
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
	    	throw new RuntimeException("�ش� �����ڰ� �����ϴ�.");
	        //throw new NonException("�ش� �����ڰ� �����ϴ�.");
	    }
	}


}
