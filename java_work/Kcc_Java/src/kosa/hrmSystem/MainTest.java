package kosa.hrmSystem;

import kosa.hrmSystem.dao.StaffDB;
import kosa.hrmSystem.employees.Employee;
import kosa.hrmSystem.employees.JobSeeker;
import kosa.hrmSystem.enums.StateType;
import kosa.hrmSystem.hr.HumanResourceMg;

public class MainTest {
	public static void main(String[] args) {

		StaffDB db = new StaffDB();
		Login.login(db);
		System.out.println(db.toString());
		HumanResourceMg humanResourceMg = new HumanResourceMg(db);
		humanResourceMg.hrUpdate();
	}
}
