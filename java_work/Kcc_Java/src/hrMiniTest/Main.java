package hrMiniTest;

import java.util.ArrayList;
import java.util.List;

import hrMiniTest.dao.LaborerDao;
import hrMiniTest.dao.LaborerDaoImple;
import hrMiniTest.domain.Laborer;
import hrMiniTest.io.Console;
import hrMiniTest.io.LaborerIo;
import hrMiniTest.service.LaborerService;
import hrMiniTest.service.LaborerServiceImple;

public class Main {

	public static void main(String[] args) {
		List<Laborer> laborers = new ArrayList<Laborer>();
		
		LaborerDao laborerDao = new LaborerDaoImple(laborers);
		LaborerService laborerService = new LaborerServiceImple(laborerDao);
		LaborerIo laborerIo = new LaborerIo(laborerService);
				
		laborerIo.play();
		Console.info("end .");

	}

}
