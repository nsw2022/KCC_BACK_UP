package kosa.io;

import java.io.Serializable;

public class Video implements Serializable{
	private String videoNo, videoName, videoActor;
	
	public Video() {}
	public Video(String videoNo, String videoName, String videoActor) {
		this.videoNo = videoNo;
		this.videoName = videoName;
		this.videoActor = videoActor;
	}
	
	public String getVideoNo() {
		return videoNo;
	}
	public void setVideoNo(String videoNo) {
		this.videoNo = videoNo;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public String getVideoActor() {
		return videoActor;
	}
	public void setVideoActor(String videoActor) {
		this.videoActor = videoActor;
	}
	@Override
	public String toString() {
		return "Video [videoNo=" + videoNo + ", videoName=" + videoName + ", videoActor=" + videoActor + "]";
	}
	
	
	
}
