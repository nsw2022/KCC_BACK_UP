package kosa.subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		Map<String, ArrayList<String>> userHobbies = new HashMap<>();

		// ����� 'John'�� ��� ����� �ʱ�ȭ�ϰ�, 'Fishing'�� �߰��մϴ�.
		userHobbies.computeIfAbsent("John", k -> new ArrayList<>()).add("Fishing");

		// 'John'�� ��� ��Ͽ� 'Hiking'�� �߰��մϴ�. �̶� 'John'�� �̹� �����ϹǷ� ���ο� ArrayList�� �������� �ʽ��ϴ�.
		userHobbies.computeIfAbsent("John", k -> new ArrayList<>()).add("Hiking");

		// ��� ���
		System.out.println(userHobbies);
	}

}
