package hrMiniTest.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import hrMiniTest.dao.LaborerDao;
import hrMiniTest.dao.LaborerDaoImple;
import hrMiniTest.domain.Laborer;

public class LaborerDaoTest {
	public static void main(String[] args) {
		List<Laborer> laborers = new ArrayList<Laborer>();
		
		laborers.add(new Laborer(11, "노승우", LocalDate.now()));
		
		LaborerDao laborerDao = new LaborerDaoImple(laborers);
		System.out.println(laborerDao.selectLaborers());
		
		laborerDao.insertLaborer("이지훈", LocalDate.now());
		System.out.println(laborerDao.selectLaborers());
		
		laborerDao.updateLaborer(new Laborer(11, "노승우", LocalDate.of(2024, 2, 1)));
		System.out.println(laborerDao.selectLaborers());
		
		laborerDao.deleteLaborer(11);
		System.out.println(laborerDao.selectLaborers());
		
		try {
			laborerDao.updateLaborer(new Laborer(11, "노승우", LocalDate.of(2024, 2, 1)));
			System.out.println(laborerDao.selectLaborers());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("에러나도 중간에 안멈치는거 맞지맞지?>");
		try {
			laborerDao.deleteLaborer(11);
			System.out.println(laborerDao.selectLaborers());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
