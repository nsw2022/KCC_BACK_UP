package kosa.hrmSystem.attendance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import kosa.hrmSystem.dao.StaffDB;
import kosa.hrmSystem.employees.Employee;

public class AttendanceMg {
	private StaffDB db;
	private List<Employee> allEmployee;
	private Map<String, String> workWrite;

	public AttendanceMg(StaffDB db) {
		this.db = db;
		this.allEmployee = db.readDB(); // 이 시점에서 DB에서 직원 데이터를 읽어옵니다.
		this.workWrite = new HashMap<>(); // 출퇴근 기록을 저장할 맵을 초기화합니다.
	}

	// 출근
	public void startWork(String id) {
		workWrite.put(id, "출근");
	}

	// 퇴근
	public void endWork(String id) {
		workWrite.put(id, "퇴근");
	}

	// 출퇴근 현황 조회
	public void commute() {
		Iterator<String> iter = workWrite.keySet().iterator();
		List<String> keys = new ArrayList<String>();
		while (iter.hasNext()) {
			String key = iter.next();
			keys.add(key);
			String value = workWrite.get(key);
			System.out.println(key);

		}

		
	}

	// 출퇴근 현황 조회
	public void printAttendanceRecords() {
		for (String id : workWrite.keySet()) {
			String records = workWrite.get(id);
			System.out.println("Employee ID: " + id);
			System.out.println("출퇴근 기록:");

			System.out.println(records);

			System.out.println("------------------");
		}
	}

}
