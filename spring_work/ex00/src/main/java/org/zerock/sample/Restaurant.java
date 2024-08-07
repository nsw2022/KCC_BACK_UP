package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor //모든 생성자
@NoArgsConstructor //default 생성자
public class Restaurant {
	
	@Autowired
	private Chef chef;
}
