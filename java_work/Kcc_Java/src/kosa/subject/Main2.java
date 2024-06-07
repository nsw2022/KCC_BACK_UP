package kosa.subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		Map<String, ArrayList<String>> userHobbies = new HashMap<>();

		// 사용자 'John'의 취미 목록을 초기화하고, 'Fishing'을 추가합니다.
		userHobbies.computeIfAbsent("John", k -> new ArrayList<>()).add("Fishing");

		// 'John'의 취미 목록에 'Hiking'을 추가합니다. 이때 'John'은 이미 존재하므로 새로운 ArrayList를 생성하지 않습니다.
		userHobbies.computeIfAbsent("John", k -> new ArrayList<>()).add("Hiking");

		// 결과 출력
		System.out.println(userHobbies);
	}

}
