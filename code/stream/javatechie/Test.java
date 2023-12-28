package code.stream.javatechie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<User> users = Stream
				.of(new User("user1", "9809839839", List.of("abc@gmail.com", "def@gmail.com")),
						new User("user2", "089998989", List.of("ghi@gmail.com", "jkl@gmail.com")))
				.collect(Collectors.toList());

		List<String> emailList = users.stream().flatMap(e -> e.getEmail().stream()).collect(Collectors.toList());
		System.out.println(emailList);
	}

	static class User {
		String name;
		String phone;
		List<String> email;

		public User(String name, String phone, List<String> email) {
			super();
			this.name = name;
			this.phone = phone;
			this.email = email;
		}

		public User() {
			super();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public List<String> getEmail() {
			return email;
		}

		public void setEmail(List<String> email) {
			this.email = email;
		}

	}

}
