package two_sums.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import group_anagram.java.Solution;

public class Solution {
	
	public int[] twoSum(int[] nums, int target) {
		List<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toList());
		int[] indexes;
		for(int i=0; i<numbers.size(); i++) {
			if (numbers.indexOf(target - numbers.get(i)) >= 0 && numbers.indexOf(target - numbers.get(i)) != i) {
				indexes = new int[] { i, numbers.indexOf(target - numbers.get(i)) };
				System.out.println(Arrays.toString(indexes));
				return indexes;
			}
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		int[] nums = { 3, 2, 4 };
		int target = 6;
		Solution ga = new Solution();
		
		ga.twoSum(nums, target);;
		
	}
}
