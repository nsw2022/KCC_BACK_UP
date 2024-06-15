package hrMiniTest.dao;

import java.time.LocalDate;
import java.util.List;

import hrMiniTest.domain.Laborer;

public interface LaborerDao {
	
	/*
	 	List<Laborer> selectLaborers(): 모든 구직자 목록을 조회합니다.
		void insertLaborer(String laborerName, LocalDate hireDate): 새로운 구직자를 등록합니다.
		void updateLaborer(Laborer laborer): 기존 구직자 정보를 업데이트합니다.
		void deleteLaborer(int laborerId): 구직자 정보를 삭제합니다. 
	  
	 */
	
	List<Laborer> selectLaborers();
	void insertLaborer(String laborerName, LocalDate hireDate);
	void updateLaborer(Laborer laborer);
	void deleteLaborer(int laborerId);

}
