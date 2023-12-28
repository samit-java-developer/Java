package code.stream.top20;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GoodQuestion {

	static List<Notes> noteLst = new ArrayList<>();

	static {
		noteLst.add(new Notes(1, "note1", 11));
		noteLst.add(new Notes(2, "note2", 22));
		noteLst.add(new Notes(3, "note3", 33));
		noteLst.add(new Notes(4, "note4", 44));
		noteLst.add(new Notes(5, "note5", 55));

		noteLst.add(new Notes(6, "note4", 66));
	}

	public static void main(String[] args) {

		Map<String, Integer> map1 = noteLst.stream().collect(Collectors.toMap(Notes::getTagName, Notes::getTagId));
		System.out.println(map1);

		Map<String, Integer> map2 = noteLst.stream()
				.collect(Collectors.toMap(Notes::getTagName, Notes::getTagId, (oldvalue, newValue) -> oldvalue));
		System.out.println(map2);

		Map<String, Integer> map3 = noteLst.stream()
				.collect(Collectors.toMap(Notes::getTagName, Notes::getTagId, (oldvalue, newValue) -> oldvalue,LinkedHashMap::new));
		System.out.println(map3);
	}

	static class Notes {
		private Integer no;
		private String tagName;
		private Integer tagId;
		public Notes(Integer no, String tagName, Integer tagId) {
			super();
			this.no = no;
			this.tagName = tagName;
			this.tagId = tagId;
		}
		public Integer getNo() {
			return no;
		}
		public void setNo(Integer no) {
			this.no = no;
		}
		public String getTagName() {
			return tagName;
		}
		public void setTagName(String tagName) {
			this.tagName = tagName;
		}
		public Integer getTagId() {
			return tagId;
		}
		public void setTagId(Integer tagId) {
			this.tagId = tagId;
		}
	}
}
