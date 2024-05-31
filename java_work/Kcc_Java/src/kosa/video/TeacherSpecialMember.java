package kosa.video;

import java.util.ArrayList;
import java.util.List;

public class TeacherSpecialMember extends TeacherGeneralMember{
	private int bounsPoint;
	
	public TeacherSpecialMember() {}
	
	public TeacherSpecialMember(String id,String name,String address,int bounsPoint) {
		super(id, name, address);
		this.bounsPoint = bounsPoint;
	}
	
	@Override
	public void rental(TeacherVideo teacherVideo) {
		// TODO Auto-generated method stub
		super.rental(teacherVideo);
		bounsPoint+=100;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("ȸ���� ���ʽ� ����Ʈ ���� :" + bounsPoint);
	}
	
	public void specialPrint() {
		System.out.println("����� ���");
	}

}
