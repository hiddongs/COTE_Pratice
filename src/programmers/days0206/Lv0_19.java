package programmers.days0206;

/*
 
 문제 설명
두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.

a	b	flag	result
-4	7	true	3
-4	7	false	-11
 */
public class Lv0_19 {

//	int a = -4; 
//	int b = 7;
//	boolean flag;
	 public int solution(int a, int b, boolean flag) {
	        int answer = 0;
	        if(flag) { // ture
	        	return answer = a + b;
	        }
	        else // false
	        	return answer = a - b;
	        
	    }
}
