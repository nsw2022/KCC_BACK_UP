package org.zerock.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// VO객체  VS  DTO객체
// DB에 있는 데이터의 값을 읽고 쓰기를 할때는 VO 객체

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SampleDTO {
	private String name;
	private int age;
}
