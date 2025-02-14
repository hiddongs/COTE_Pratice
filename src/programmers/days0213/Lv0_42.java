package programmers.days0213;
/*

 */
public class Lv0_42 {
	
	 public String solution(String my_string, int n) {
	       
	        
	        String answer;
	      
	        StringBuilder sb = new StringBuilder(my_string);
	        sb.reverse();
	        sb = new StringBuilder(sb.substring(0,n));
	        sb.reverse();
	        
	        return answer = sb.toString();
	    }

}
