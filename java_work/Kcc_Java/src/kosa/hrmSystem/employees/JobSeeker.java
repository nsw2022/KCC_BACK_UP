package kosa.hrmSystem.employees;

import java.time.LocalDate;

import kosa.hrmSystem.enums.StateType;

public class JobSeeker {

    //    field
    private StateType isPass; //  합/불 상태
    int jobSeekerId;// 인덱스 번호
    String name;// 이름
    LocalDate applyDate; // 지원날짜
    
    
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
