package kosa.video;

public class TeacherVideo {
	private String sno;
	private String title;
	private String actor;
	public TeacherVideo() {}
	public TeacherVideo(String sno, String title, String actor) {
		super();
		this.sno = sno;
		this.title = title;
		this.actor = actor;
	}
	
	public void show() {
		System.out.println("ȸ���� ���� ���� ��ȣ : "+sno);
		System.out.println("ȸ���� ���� ���� ���� : "+title);
		System.out.println("ȸ���� ���� ���� ��� : "+actor);
	}
	
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	
	
	

}
