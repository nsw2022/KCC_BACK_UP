package kosa.subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {


	  public static void main(String[] args) {
	        Map<String, List<String>> multiValueMap = new HashMap<>();

	        // 값을 추가하는 함수
	        addValueToMap(multiValueMap, "FPS", "헬다이버즈");
	        addValueToMap(multiValueMap, "FPS", "GTFO");
	        addValueToMap(multiValueMap, "FPS", "래프트4데드");
	        addValueToMap(multiValueMap, "Horror", "파스모포비아");
	        addValueToMap(multiValueMap, "Horror", "DEVOUR");

	        // 출력
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
