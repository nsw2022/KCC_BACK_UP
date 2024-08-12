package org.zerock.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class UserVO {
    private String userId;
    private String userName;
    
    private String userPass;
    private Date userRegDate;
    
	public UserVO(String userId, String userName,  String userPass) {
		super();
		this.userId = userId;
		this.userName = userName;
	
		this.userPass = userPass;
	}

	public UserVO(String userId, String userPass) {
		super();
		this.userId = userId;
		this.userPass = userPass;
	}

	
    
    
}
