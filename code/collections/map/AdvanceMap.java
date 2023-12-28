package code.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdvanceMap {

	public static void main(String[] args) {
		Map<String, Map<String, Object>> mapWithInMap = new HashMap<String, Map<String, Object>>();
		Map<String, Object> innerMap = new HashMap<String, Object>();
		innerMap.put("Greater than", "1:true");
		innerMap.put("Less than", "2:true");

		mapWithInMap.put("RSI", innerMap);
		
		
	}

}
