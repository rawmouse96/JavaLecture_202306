package ch11_api.sec04_string;

public class Ex05_IndexOf {

	public static void main(String[] args) {
		String str = "자바 프로그램";
		
		int index = str.indexOf("자바");
		System.out.println(index);
		index = str.indexOf("프로그램");
		System.out.println(index);
		
		// 찾고자하는 문자열이 대상 문자열에 있는 경우 리턴값이 0이상
		System.out.println(str.indexOf("자바") >= 0);
		System.out.println(str.indexOf("자비") >= 0);
		
		System.out.println(str.contains("프로그램"));
		
	}

}
