class Solution:
    def sumEvenAfterQueries(self, nums, queries):
        result = []
        sum1 = sum(list(filter(lambda n: n % 2 == 0, nums )))
        i = 0
        while(i < len(queries)):
            if queries[i][0] % 2 == 0 and nums[queries[i][1]] % 2 == 0 :
               sum1 += queries[i][0]
                    
            elif queries[i][0] % 2 != 0 and nums[queries[i][1]] % 2 != 0:
                sum1 += queries[i][0] + nums[queries[i][1]]
            elif nums[queries[i][1]] % 2 == 0 and queries[i][0] % 2 != 0:
                sum1 -= nums[queries[i][1]]

            nums[queries[i][1]] = queries[i][0] + nums[queries[i][1]]
            result.append(sum1)

            i += 1

        print(result)
        return result

nums = [1,2,3,4]
queries = [[1,0],[-3,1],[-4,0],[2,3]]
solution = Solution()
solution.sumEvenAfterQueries(nums, queries)
