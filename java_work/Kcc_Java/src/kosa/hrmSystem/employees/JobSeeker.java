package kosa.hrmSystem.employees;

import java.time.LocalDate;

import kosa.hrmSystem.enums.StateType;

public class JobSeeker {

    //    field
    private StateType isPass; //  ��/�� ����
    int jobSeekerId;// �ε��� ��ȣ
    String name;// �̸�
    LocalDate applyDate; // ������¥
    
    
    // constructor
    public JobSeeker() {
        this.isPass = StateType.pending;
    }

	public StateType getIsPass() {
		return isPass;
	}

	public void setIsPass(StateType isPass) {
		this.isPass = isPass;
	}

	public int getJobSeekerId() {
		return jobSeekerId;
	}

	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(LocalDate applyDate) {
		this.applyDate = applyDate;
	}
	
	
    
    
    
}
