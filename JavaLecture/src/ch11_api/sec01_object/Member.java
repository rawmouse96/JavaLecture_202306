package ch11_api.sec01_object;

public class Member {
	String id;
	String name;
	
	Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return 0;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

	
}
