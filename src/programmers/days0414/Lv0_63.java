package programmers.days0414;

import java.util.ArrayList;

/*
 * 
 * 문제 설명
정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.


입출력 예
num_list	      n	     result
[2, 1, 6]	      1	     [2]
[5, 2, 1, 7, 5]	  3	     [5, 2, 1]
 * 
 */
public class Lv0_63 {
	
	 public int[] solution(int[] num_list, int n) {
	       
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        for(int i = 0; i < n; i++) {  	
	        			list.add(num_list[i]);
	        }
	        return list.stream().mapToInt(Integer::intValue).toArray();
	 }
}
