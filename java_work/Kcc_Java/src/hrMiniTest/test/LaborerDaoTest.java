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
		
		laborers.add(new Laborer(11, "��¿�", LocalDate.now()));
		
		LaborerDao laborerDao = new LaborerDaoImple(laborers);
		System.out.println(laborerDao.selectLaborers());
		
		laborerDao.insertLaborer("������", LocalDate.now());
		System.out.println(laborerDao.selectLaborers());
		
		laborerDao.updateLaborer(new Laborer(11, "��¿�", LocalDate.of(2024, 2, 1)));
		System.out.println(laborerDao.selectLaborers());
		
		laborerDao.deleteLaborer(11);
		System.out.println(laborerDao.selectLaborers());
		
		try {
			laborerDao.updateLaborer(new Laborer(11, "��¿�", LocalDate.of(2024, 2, 1)));
			System.out.println(laborerDao.selectLaborers());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("�������� �߰��� �ȸ�ġ�°� ��������?>");
		try {
			laborerDao.deleteLaborer(11);
			System.out.println(laborerDao.selectLaborers());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
