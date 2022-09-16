package com.leetcode.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagram {
	
	public String sortAnagram(String str) {
		char[] s = str.toCharArray();
		Arrays.sort(s);
		return String.valueOf(s);
	}
	
	public List<List<String>> groupAnagrams(String[] strs) {
		if (null == strs || strs.length > Math.pow(10, 4) || strs[0].length() > 100) {
			return null;
		}
		List<List<String>> anagrams = new ArrayList<>();
		
		List<String> strList = new ArrayList<>(Arrays.asList(strs));
		System.out.println(strList);
		
		for (int i = 0; i < strList.size(); i++) {
			
			//		for (Iterator<String> iterator = strList.iterator(); iterator.hasNext();) {
			//			String str = iterator.next();
			String str = strList.get(i);
			
			List<String> group = new ArrayList<>();
			
			group.add(str);
			
			String strSorted = sortAnagram(str);
			
			//			for (Iterator<String> iterator2 = strList.iterator(); iterator2.hasNext();) {
			//				String str1 = iterator2.next();
			//				String sortedStr = sortAnagram(str1);
			//				if (strSorted.equals(sortedStr)) {
			//					group.add(str1);
			//					iterator2.remove();
			//				}
			//			}
			
			for (int j = i + 1; j < strList.size(); j++) {
				System.out.println(strList);
				String str1 = strList.get(j);
				String sortedStr1 = sortAnagram(str1);
				if (strSorted.equals(sortedStr1)) {
					group.add(strList.get(j));
					System.out.println("After removal");
					System.out.println(strList);
					strList.remove(j);
				}
			}
			
			//			strList.remove(i);
			//			iterator.remove();
			//			strList.add(i, " ");
			anagrams.add(group);
			System.out.println(anagrams);
			
		}
		
		//		for (int i = 0; i < cleanedUp.length; i++) {
		//			String str = cleanedUp[i];
		//			
		//			//Generate anagram and group them
		//			List<String> group = new ArrayList<>();
		//			group.add(str);
		//			
		//			for (int j = i + 1; j < cleanedUp.length; j++) {
		//				if (str.equals(cleanedUp[j])) {
		//					group.add(cleanedUp[j]);
		//				}
		//			}
		//			
		//			anagrams.add(group);
		//		}
		
		return anagrams;
	}
	
	public static void main(String[] args) {
		
		GroupAnagram ga = new GroupAnagram();
		
		String[] str = { "", "", "" };
		
		List<List<String>> groups = ga.groupAnagrams(str);
		
		System.out.println(groups);
		
	}
	
}
