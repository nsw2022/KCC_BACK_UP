package kosa.subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {


	  public static void main(String[] args) {
	        Map<String, List<String>> multiValueMap = new HashMap<>();

	        // ���� �߰��ϴ� �Լ�
	        addValueToMap(multiValueMap, "FPS", "����̹���");
	        addValueToMap(multiValueMap, "FPS", "GTFO");
	        addValueToMap(multiValueMap, "FPS", "����Ʈ4����");
	        addValueToMap(multiValueMap, "Horror", "�Ľ��������");
	        addValueToMap(multiValueMap, "Horror", "DEVOUR");

	        // ���
	        for (Map.Entry<String, List<String>> entry : multiValueMap.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }

	    private static void addValueToMap(Map<String, List<String>> map, String key, String value) {
	        if (!map.containsKey(key)) {
	            map.put(key, new ArrayList<>());
	        }
	        map.get(key).add(value);
	    }


}
