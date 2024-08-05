package kosa.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// xml역할을 java파일로도 가능하다.

//@Configuration
//여기서 설정파일임을 인지한다.
public class Factory {	
	@Bean
	public Dao oracleDao() {
		return new OracleDao();
		
	}
	
	@Bean
	public Service writeService2() {
		return new WriteService();
	}
}
