package com.leetcode.challenges;

import java.util.Arrays;

public class SumOfEven {
	
	public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
		int[] result = new int[queries.length];
		
		int sum = Arrays.stream(nums).reduce(0, (a, b) -> (a % 2 == 0 ? a : 0) + ((b % 2 == 0) ? b : 0));
		System.out.println(sum);
		
		for (int i = 0; i < queries.length; i++) {
			int dummysum = nums[queries[i][1]] + queries[i][0];
			if (queries[i][0] % 2 == 0 && nums[queries[i][1]] % 2 == 0) {
				//Even + even = even
				
				if ((nums[queries[i][1]] + queries[i][0]) < 0 && queries[i][0] < 0) {
					sum += queries[i][0];
				} else {
					sum += queries[i][0];
				}
				
			} else if (queries[i][0] % 2 != 0 && nums[queries[i][1]] % 2 != 0) {
					sum += queries[i][0] + nums[queries[i][1]];
			} else if (nums[queries[i][1]] % 2 == 0 && queries[i][0] % 2 != 0) {
				sum -= nums[queries[i][1]];
			}
			
			nums[queries[i][1]] = queries[i][0] + nums[queries[i][1]];
			result[i] = sum;
			
			System.out.println(Arrays.toString(nums));
			System.out.println(sum);
			
		}
		System.out.println(Arrays.toString(result));
		return result;
		
	}
	
	public static void main(String[] args) {
		
		//		int[] nums = { -1, 3, -3, 9, -6, 8, -5 };
		int[] nums = { 1, 2, 3, 4 };
		int[][] queries = { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 }, { -1, 1 } };
		//		int[][] queries = { { -5, 1 }, { 10, 2 }, { -6, 3 }, { 3, 2 }, { 9, 5 }, { 7, 5 }, { 8, 0 } };
		sumEvenAfterQueries(nums, queries);
	}
	
}
