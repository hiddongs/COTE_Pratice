package programmers.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/*
문제 설명
정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
0 ≤ end_num ≤ start_num ≤ 50
입출력 예
start_num	        end_num	     result
10	                3	         [10, 9, 8, 7, 6, 5, 4, 3]
 */
class Solution {

	  public int[] solution(int start_num, int end_num) {
	    
	        Integer [] answers = {}; 
	        int size = start_num-end_num;
	        answers = new Integer[size+1];
	        for(int i = size; i > end_num; i--) {
	        	answers[i] += start_num;
	        	start_num--;
	        }
	        
	        Arrays.sort(answers,Collections.reverseOrder());
	        return Arrays.stream(answers).mapToInt(Integer::intValue).toArray();
	    }
}


	
