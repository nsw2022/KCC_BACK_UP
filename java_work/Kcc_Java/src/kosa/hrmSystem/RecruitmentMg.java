package kosa.hrmSystem;

import kosa.hrmSystem.employees.JobSeeker;

import java.util.LinkedList;
import java.util.List;

public class RecruitmentMg {
    private List<JobSeeker> jobSeekers;
    private List<JobSeeker> tmpJobSeekers;

    public RecruitmentMg() {
        this.jobSeekers = new LinkedList<JobSeeker>();
        this.tmpJobSeekers = new LinkedList<JobSeeker>();
    }

    public void jobSeekerSearch(){
        for (int i = 0; i<jobSeekers.size();i++){
            JobSeeker jobSeeker = jobSeekers.get(i);
            System.out.println((i+1)+") "+"ID: "+jobSeeker.getJobSeekerId()+"이름: "+jobSeeker.getName()+" 지원날짜: "+jobSeeker.getApplyDate()+" (합/불): "+jobSeeker.getIsPass());
        }
    }
    public void jobSeekerPass(int ID){
        JobSeeker tmp = null;
        for (JobSeeker jobSeeker : jobSeekers) {
            if( jobSeeker.getJobSeekerId() == ID){
             tmp = jobSeeker;
            }
        }
        if(tmp == null){
            System.out.println("해당 아이디의 지원자는 없습니다.");
        }
        tmpJobSeekers.add(tmp);
        System.out.println("지원자가 1차 합격하였습니다");
    }

    public List<JobSeeker> getJobSeekers() {
        return jobSeekers;
    }

    public void setJobSeekers(List<JobSeeker> jobSeekers) {
        this.jobSeekers = jobSeekers;
    }

    public List<JobSeeker> getTmpJobSeekers() {
        return tmpJobSeekers;
    }

    public void setTmpJobSeekers(List<JobSeeker> tmpJobSeekers) {
        this.tmpJobSeekers = tmpJobSeekers;
    }
}
