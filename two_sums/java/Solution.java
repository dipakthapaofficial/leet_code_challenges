package two_sums.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import group_anagram.java.Solution;

public class Solution {
	
	public int[] twoSum(int[] nums, int target) {
		ArrayList<Integer> numbers = Arrays.asList(nums);
		List<Integer> indexes = new ArrayList<>();
		for(int i=0; i<numbers.size(); i++) {
			if(numbers.indexOf(target - numbers.get(i)) >= 0 ) {
				indexes.add(i);
				indexes.add(.indexOf(target - numbers.get(i)));
			}
		}
		System.out.println(indexes);
		
	}
	
	public static void main(String[] args) {
		
		Solution ga = new Solution();
		
		ga.twoSum(null, 0);
		
	}
}
