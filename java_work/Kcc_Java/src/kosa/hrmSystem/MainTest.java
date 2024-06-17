package kosa.hrmSystem;

import kosa.hrmSystem.dao.StaffDB;
import kosa.hrmSystem.employees.Employee;
import kosa.hrmSystem.employees.JobSeeker;
import kosa.hrmSystem.enums.StateType;

public class MainTest {
    public static void main(String[] args) {
    	StaffDB db = new StaffDB();
    	
    	Login.login(db);
    	

    }
}
