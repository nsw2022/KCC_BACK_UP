package hrMiniTest.io;

public enum Job {
	
	EXIT("종료"),LIST("목록"),ADD("추가"),FIX("수정"),DEL("삭제");
	
	private String label;
	
	private Job(String label) {
		this.label = label;
	}
	
	public static int length() {
		return values().length;
	}
	
	public static Job valueOf(int ordinal) {
		return values()[ordinal];
	}
	
	public static String labels() {
		Job[] jops = values();
		String lables = "";
		String last = "";
		
		for (Job job : jops) {
			if(job.ordinal()==0) last = job.ordinal() + "." + job.label;
			else lables += job.ordinal() + "." + job.label + ", ";
		}
		lables += last;
		
		return lables;
		
	}
}
