package hrMiniTest.dao;

import java.time.LocalDate;
import java.util.List;

import hrMiniTest.domain.Laborer;

public interface LaborerDao {
	
	/*
	 	List<Laborer> selectLaborers(): ��� ������ ����� ��ȸ�մϴ�.
		void insertLaborer(String laborerName, LocalDate hireDate): ���ο� �����ڸ� ����մϴ�.
		void updateLaborer(Laborer laborer): ���� ������ ������ ������Ʈ�մϴ�.
		void deleteLaborer(int laborerId): ������ ������ �����մϴ�. 
	  
	 */
	
	List<Laborer> selectLaborers();
	void insertLaborer(String laborerName, LocalDate hireDate);
	void updateLaborer(Laborer laborer);
	void deleteLaborer(int laborerId);

}
