package kosa.hrmSystem;

import kosa.hrmSystem.employees.Employee;
import kosa.hrmSystem.enums.StateType;

public class MainTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
//        employee1.setBusinessTripState(StateType.pending);
        employee2.setBusinessTripState(StateType.commit);
        employee2.setBusinessTripState(StateType.pending);
//        System.out.println(employee1.getBusinessTripState());
        System.out.println(employee2.getBusinessTripState());
//        System.out.println(employee2.getDepartmentType());


    }
}
