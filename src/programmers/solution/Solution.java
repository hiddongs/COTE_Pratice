package programmers.solution;

import java.util.ArrayList;
import java.util.Arrays;

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



class Solution {

	String my_string = "banana";
	String is_prefix = "ban";
	
	public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String str = "";
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < my_string.length(); i++) {
        	str = my_string.substring(i);
        	list.add(str);
        }
        if(list.contains(is_prefix)) {
        	return answer = 1;
        }
        else
        	return answer = 0;
        
    }syso
}
	
	
