package programmers.days0305;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*

문제 설명
문자열 my_string과 정수 배열 indices가 주어질 때, 
my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.


입출력 예
my_string	             indices	                      result
"apporoograpemmemprs"	[1, 16, 6, 15, 0, 10, 11, 3]	"programmers"
 */
public class Lv0_52 {
	public String solution(String my_string, int[] indices) {
		
		List <Character> list = new ArrayList<Character>();
		
		
		for(int i = 0; i < my_string.length(); i++) {
	     
		    list.add(my_string.charAt(i));
		}

		int index = 0;

	    

		 Arrays.sort(indices); // 정렬
	        for (int i = indices.length - 1; i >= 0; i--) {
	            list.remove(indices[i]); // 뒤에서부터 삭제
	        }


	        return list.stream().map(String::valueOf).collect(Collectors.joining());
	}
}
