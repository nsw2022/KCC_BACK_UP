package kosa.hrmSystem.employees;

import kosa.hrmSystem.enums.DepartmentType;
import kosa.hrmSystem.enums.StateType;

public class Employee {
    private String name;
    private DepartmentType departmentType;
    private StateType vacationState;
    private StateType workOutsideState;
    private StateType businessTripState;

    //constructor
    public Employee() {
        this.vacationState = null;

    }

    //    method

    //    setter getter
    public StateType getBusinessTripState() {
        return businessTripState;
    }

    public void setBusinessTripState(StateType businessTripState) {
        this.businessTripState = businessTripState;
    }

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(DepartmentType departmentType) {
        this.departmentType = departmentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StateType getVacationState() {
        return vacationState;
    }

    public void setVacationState(StateType vacationState) {
        this.vacationState = vacationState;
    }

    public StateType getWorkOutsideState() {
        return workOutsideState;
    }

    public void setWorkOutsideState(StateType workOutsideState) {
        this.workOutsideState = workOutsideState;
    }
}
