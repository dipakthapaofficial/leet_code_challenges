class Solution(object):
    def groupAnagrams(self, strs=[]):
        """
        :type strs: List[str]
        :rtype: List[List[str]]

        link to task: https://leetcode.com/problems/group-anagrams/
        """
        anagrams = []
        filteredIndex = set()

        for i in range(0, len(strs)):
            if i in filteredIndex:
                continue

            str = strs[i]
            group = []
            str1 = ''.join(sorted(str))

            group.append(str)
            filteredIndex.add(i)

            for j in range(0, len(strs)):
                if j in filteredIndex:
                    continue
                
                str2 = strs[j]
                str3 = ''.join(sorted(str2))

                if str3 == str1:
                    group.append(str2)
                    filteredIndex.add(j)


            anagrams.append(group)
        
        return anagrams



strs = ["eat","tea","tan","ate","nat","bat"]
strs = ["","",""]
strs = ["a"]
print(strs)
solution = Solution()
solution.groupAnagrams(strs)
