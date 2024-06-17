package kosa.hrmSystem;

import kosa.hrmSystem.employees.JobSeeker;
import kosa.hrmSystem.executives_func.Approval;

import java.util.LinkedList;
import java.util.List;

public class RecruitmentMg {
    private List<JobSeeker> jobSeekers;
    private List<JobSeeker> tmpJobSeekers; //
    private Approval approval;

    public RecruitmentMg( Approval approval) {
        this.jobSeekers = new LinkedList<JobSeeker>();
        this.tmpJobSeekers = new LinkedList<JobSeeker>();
        this.approval = approval;
    }

    public void jobSeekerSearch(){
        for (int i = 0; i<jobSeekers.size();i++){
            JobSeeker jobSeeker = jobSeekers.get(i);
            System.out.println((i+1)+") "+"ID: "+jobSeeker.getJobSeekerId()+" �̸�: "+jobSeeker.getName()+" ������¥: "+jobSeeker.getApplyDate()+" (��/��): "+jobSeeker.getIsPass());
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
            System.out.println("�ش� ���̵��� �����ڴ� �����ϴ�.");
        }
        tmpJobSeekers.add(tmp);
        System.out.println("�����ڰ� 1�� �հ��Ͽ����ϴ�");
        approval.getRecruitmentApprovalCase().add(tmp);

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