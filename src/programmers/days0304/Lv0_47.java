package programmers.days0304;

/*
문제 설명
문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.


입출력 예
my_string	        s	e	 result
"Progra21Sremm3"	6	12	"ProgrammerS123"
"Stanley1yelnatS"	4	10	"Stanley1yelnatS"

*/
public class Lv0_47 {
	String my_string = "Progra21Sremm3";
	int s = 6;
	int e = 12;
	public String solution(String my_string, int s, int e) {
		String answer = "";


		
		String a = my_string.substring(s, e+1);
		StringBuffer bf = new StringBuffer(a);
		bf.reverse();
		bf.toString();
		answer = my_string.replace(a,bf);
		

		return answer;
	}
}
