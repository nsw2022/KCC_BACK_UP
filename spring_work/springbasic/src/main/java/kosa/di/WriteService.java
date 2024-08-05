package kosa.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service
public class WriteService implements Service {
	
	@Autowired
	@Qualifier("mySQLDao") //하나만 해달라고 명시
	private Dao dao;
	
	public WriteService() {}	

	public WriteService(Dao dao) {
		super();
		this.dao = dao;
	}

	public void insertService() {
		System.out.println("WriteService insertService() 호출");
		dao.insertBoard();
	}

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	
}
