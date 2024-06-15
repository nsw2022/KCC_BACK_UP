package hrMiniTest.service;

import java.time.LocalDate;
import java.util.List;

import hrMiniTest.domain.Laborer;

public interface LaborerService {
	
	List<Laborer> getLaborers();
	void addLaborer(String laborerName, LocalDate hireDate);
	void fixLaborer(Laborer laborer);
	void delLaborer(int laorerId);

}
