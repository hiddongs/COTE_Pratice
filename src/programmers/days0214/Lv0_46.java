package programmers.days0214;

/*

문제 설명
어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다. 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ my_string의 길이 ≤ 100
1 ≤ is_prefix의 길이 ≤ 100
my_string과 is_prefix는 영소문자로만 이루어져 있습니다.
입출력 예
my_string	is_prefix	result
"banana"	"ban"	1
"banana"	"nan"	0
"banana"	"abcd"	0
"banana"	"bananan"	0
 */
public class Lv0_46 {
	public static int solution(String my_string, String is_prefix) {
        int answer = 0;
        String str = "";
        if (my_string.startsWith(is_prefix)) {
            return 1;
        } else {
            return 0;
        }
        // 접두사
//        ArrayList<String> list = new ArrayList<String>();
//        StringBuffer bf = new StringBuffer();
//        for(int i = 0; i < my_string.length(); i++) {
//        	str = my_string.substring(i);
//        	list.add(str);
//        	
//        	    
//             bf.append(list);
//
//        	
//        }
//        
//       for(int i = 0; i < is_prefix.length(); i++) {
//        if(list.contains(is_prefix)) {
//        	return answer = 1;
//        }
//        else 
//        	return answer = 0;
//       }
//	return answer;
//       
//   
//        
//	}
}

}
