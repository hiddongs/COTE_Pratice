package programmers.days0305;
//문제 설명
//알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, 
//my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., my_string에서 'Z'의 개수, 
//my_string에서 'a'의 개수, my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.
//
//
//my_string	result
//"Programmers"	[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]
public class Lv0_50 {
	
		public int[] solution(String my_string) {
	        int[] answer = new int[52]; // 대문자 26개 + 소문자 26개

	        for (char c : my_string.toCharArray()) {
	            if (c >= 'A' && c <= 'Z') { // 대문자
	                answer[c - 'A']++;
	            } else if (c >= 'a' && c <= 'z') { // 소문자
	                answer[c - 'a' + 26]++;
	            }
	        }

	        return answer;
	    }
	
		
}
