package kosa.video;

public class TeacherGeneralMember {
	private String id, name, address;
	private TeacherVideo rentalVideo;
	
	public TeacherGeneralMember(){}

	public TeacherGeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void rental(TeacherVideo teacherVideo) {
		this.rentalVideo = teacherVideo;
	}
	
	public void show() {
		System.out.println("회원 아이디 : "+id);
		System.out.println("회원 이름 : "+name);
		System.out.println("회원 주소 : "+address);
		rentalVideo.show();
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public TeacherVideo getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(TeacherVideo rentalVideo) {
		this.rentalVideo = rentalVideo;
	}

	
	
	
	
}
