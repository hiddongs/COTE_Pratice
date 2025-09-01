package programmers.days0811;

import java.util.ArrayList;

/*
 * 
문제 설명
정수 리스트 num_list와 정수 n이 주어질 때, 
num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

num_list	        n	result
[4, 2, 6, 1, 7, 6]	2	[4, 6, 7]
[4, 2, 6, 1, 7, 6]	4	[4, 7]
 * 
 */

public class Lv0_64 {

	public int[] solution(int[] num_list, int n) {
		
		  int[] answer = {};
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        for(int i = 0; i < num_list.length; i+=n) {
	           
	        	  list.add(num_list[i]);
	              
	        }
	        
	        return list.stream().mapToInt(Integer::intValue).toArray();
	    }
}
