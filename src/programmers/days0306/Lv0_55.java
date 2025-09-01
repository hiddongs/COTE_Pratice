package programmers.days0306;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

문제 설명
정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다. slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.

n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.

입출력 예
n	slicer	     num_list	                result
3	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	[2, 3, 4, 5, 6]
4	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	[2, 4, 6]
 */
public class Lv0_55 {
//	public int[] solution(int n, int[] slicer, int[] num_list) {
//	
//		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> list2 = new ArrayList<Integer>();
//		for(int i = 0; i < num_list.length; i++) {
//			list.add(num_list[i]);
//		}
//
//		switch (n) {
//
//		 case 1: {
//			 
//			 list2 = list.subList(0, slicer[1]+1);
//			 break;
//		 }
//		 case 2:{
//
//			 list2 = list.subList(slicer[0], list.size());
//			 break;
//		 }
//		 case 3:{
//		 	 list2 =list.subList(slicer[0], slicer[1]);
//		 	break;
//		 }
//		 case 4:{
//			 
//			 for(int i = list.get(slicer[0]); i <= list.get(slicer[1]); i++){
//				
//				 if(i < list.size()) {
//					 list2.add(list.get(i));
//					 }
//				
//			 }
//			 break;
//		
//			 
//		 }
//		}
//
//		 return list2.stream().mapToInt(Integer::intValue).toArray();
//		
//	}
	  public int[] solution(int n, int[] slicer, int[] num_list) {
	        int a = slicer[0], b = slicer[1], c = slicer[2]; 
	        int[] result = null;

	        switch (n) {
	            case 1:
	                result = Arrays.copyOfRange(num_list, 0, b + 1);
	                break;

	            case 2:
	                result = Arrays.copyOfRange(num_list, a, num_list.length);
	                break;

	            case 3:
	                result = Arrays.copyOfRange(num_list, a, b + 1);
	                break;

	            case 4:
	                List<Integer> list = new ArrayList<>();
	                for (int i = a; i <= b; i += c) {
	                    list.add(num_list[i]);
	                }
	                result = list.stream().mapToInt(Integer::intValue).toArray();
	                break;
	        }
	         return result;
	    }

}



