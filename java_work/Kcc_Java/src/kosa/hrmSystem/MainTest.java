package kosa.hrmSystem;

import java.util.Scanner;

import kosa.hrmSystem.dao.StaffDB;
import kosa.hrmSystem.employees.Employee;
import kosa.hrmSystem.employees.Executives;
import kosa.hrmSystem.employees.GeneralEmployee;
import kosa.hrmSystem.employees.HrStaff;
import kosa.hrmSystem.employees.JobSeeker;
import kosa.hrmSystem.enums.StateType;
import kosa.hrmSystem.executives_func.Approval;
import kosa.hrmSystem.hr.HumanResourceMg;

public class MainTest {
	public static void main(String[] args) {
		/*
		StaffDB db = new StaffDB();
		Login.login(db);
		System.out.println(db.toString());
		HumanResourceMg humanResourceMg = new HumanResourceMg(db);
		humanResourceMg.hrUpdate();
		Approval approval = new Approval();
		approval.hrApproval(db, humanResourceMg);
		*/
		Scanner sc = new Scanner(System.in);
		StaffDB db = new StaffDB();
		HumanResourceMg humanResourceMg = new HumanResourceMg(db);
		while (true) {
			System.out.println("1. �α���   2. ȸ������");
			String str = sc.nextLine();
			switch (str) {
			case "1":
				Employee user = Login.login(db);
				if (user instanceof HrStaff) {
					String hrInput = sc.nextLine();
					// 1���λ����� ���� �޿� ä��
					switch (hrInput) {
					case "1":
						humanResourceMg.hrUpdate();						
						break;

					default:
						break;
					}
				}else if(user instanceof GeneralEmployee) {
					// ��/���, �ް���û, ������ ��ȸ, ���� ������ȸ
					// System.out.println("������");//// ����
				}else if(user instanceof Executives) {
					// 1.�λ����  2.ä�����  3.�ٿ�����
					// System.out.println("������");////����
					Approval approval = new Approval();
					approval.hrApproval(db, humanResourceMg);
				}
				
				break;

			default:
				break;
			}
		}

	}
}
