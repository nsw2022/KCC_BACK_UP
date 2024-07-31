package kosa.dao;

import kosa.member.Member;

public class MemberDao {
	private static MemberDao instance = new MemberDao();

    private MemberDao() {}

    public static MemberDao getInstance() {
        return instance;
    }

    public void insert(Member member) {
      
        System.out.println("Member inserted: " + member);
    }

}
