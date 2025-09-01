package programmers.days0311;

import java.util.Arrays;

/*

문제 설명
정수 리스트 num_list와 정수 n이 주어질 때, num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ num_list의 길이 ≤ 30
1 ≤ num_list의 원소 ≤ 9
1 ≤ n ≤ num_list의 길이
입출력 예
num_list	         n	    result
[2, 1, 6]	         1	    [1, 6, 2]
[5, 2, 1, 7, 5]	     3	    [7, 5, 5, 2, 1]
 */
public class Lv0_61 {
	
	 public int[] solution(int[] num_list, int n) {
	        int[] answer = {};
	        
	        int[] first = Arrays.copyOfRange(num_list, n, num_list.length);  // 뒤쪽
	        int[] second = Arrays.copyOfRange(num_list, 0, n);              // 앞쪽
	        answer =  new int[first.length + second.length];
	               
         
         System.arraycopy(first, 0, answer, 0, first.length);
         System.arraycopy(second, 0, answer, first.length, second.length);
         
         return answer;

	
	      
	    }

}
