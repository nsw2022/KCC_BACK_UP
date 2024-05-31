package kosa.video;

import java.util.ArrayList;
import java.util.List;

public class SpecialMember extends GeneralMember{
	private String userId, userName, userAddress, userRentVideo;
	private int point;
	private List<Video> videos;
	
	
	
	public SpecialMember(String userId, String userName, String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		videos = new ArrayList<Video>();
	}
	
	
	@Override
	public void resgistVideo(Video video) {
		videos.add(video);
		point += 10;
	}
	
	@Override
	public void showUser() {
		for (Video video : videos) {
			System.out.println("ȸ���� ���̵� : "+getUserId());
			System.out.println("ȸ���� �̸� : "+getUserName());
			System.out.println("ȸ���� �ּ� : "+getUserAddress());
			System.out.println("ȸ���� ���� ��ȣ : "+video.getVideoNo());
			System.out.println("ȸ���� ���� ���� : "+video.getVideoName());
			System.out.println("ȸ���� ���� ���ΰ� : "+video.getVideoActor());
			System.out.println("ȸ���� ���ʽ� ����Ʈ ����: "+ point);
		}
		
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserRentVideo() {
		return userRentVideo;
	}
	public void setUserRentVideo(String userRentVideo) {
		this.userRentVideo = userRentVideo;
	}
	public List<Video> getVideos() {
		return videos;
	}
	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}
	
	

}
