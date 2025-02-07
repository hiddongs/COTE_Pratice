package programmers.days0207;

/*
문제 설명
두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 
이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.

a	d	included	                                      result
3	4	[true, false, false, true, true]	                37
7	1	[false, false, false, true, false, false, false]	10
 */
public class Lv0_21 {
	
//	  int a = 3;
//    int d = 4;
//    boolean [] included;
	 public int solution(int a, int d, boolean[] included) {
		 
		   int answer = 0;
		   for(int n = 0; n < included.length; n++) {
			   if(included[n] == true) {
			   int result = a + (n * d);
			   answer += result;
		    }
		   }
	        return answer;
	    }

}
