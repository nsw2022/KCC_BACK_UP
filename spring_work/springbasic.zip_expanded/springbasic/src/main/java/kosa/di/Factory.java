package kosa.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// xml������ java���Ϸε� �����ϴ�.

//@Configuration
//���⼭ ������������ �����Ѵ�.
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
