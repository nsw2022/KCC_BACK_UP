package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ListExam {

	public static void main(String[] args) {
		// 1~45 중복되지않는 로또번호 6개 출력하자
		Random r = new Random();

		// 1. 배열로 구현
//		Random rnd = new Random();
//		int[] nums = new int[6];
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = rnd.nextInt(45) + 1;// 1~5
//			
//			for (int j = 0; j < i; j++) {
//				if (nums[i] == nums[j]) {
//					i--;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(nums));
		
		//1. 배열로 구현
//		
//		int arr[] = new int[6];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = r.nextInt(45)+1;
//			for (int j = 0; j < i; j++) {
//				if (arr[i]==arr[j]) {
//					i--;
//				}
//			}	
//		}
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
//		//2. List
//		List<Integer> list = new ArrayList<Integer>();
//		for (int i = 1; i < 46; i++) {
//			list.add(i);
//		}
//		
//		Collections.shuffle(list);
//		for (int i = 0; i <6; i++) {
//			System.out.print(list.get(i) + " ");
//		}
//		System.out.println();
//		list.clear();
//		while (true) {
//			int n = r.nextInt(45)+1;
//			if (list.contains(n)) {
//				continue;
//			}else {
//				list.add(n);
//			}
//			if (list.size()==6) {
//				break;
//			}
//		}
//		Collections.sort(list);
//		System.out.println(list);
		
		//3. Set 자료구조 (TreeSet) ==> 중복 허용 X
		Set<Integer> set = new TreeSet<Integer>();
		
		for (int i=0; set.size()<6; i++) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
	}

}
