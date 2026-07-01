seats = list(map(int, input().split(',')))

maxi = 0
temp= 0 
may_max =0

i=0
if seats[0] == 0:
    while seats[i] !=1:
        may_max += 1
        i +=1

for j in range(i, len(seats)):
    if seats[j] == 0:
        temp +=1
    else:
        maxi = max(maxi, temp)
        temp = 0

print(max(may_max, temp, (maxi+1)//2))

# There is solution which is simulated to the leetcode

# class Solution:
#     def maxDistToClosest(self, seats: List[int]) -> int:
#         maxi = 0
#         temp = 0

#         may_max = 0
#         i = 0
#         if seats[0] == 0:
#             while seats[i] !=1:
#                 i+=1
#                 may_max += 1

        
#         for j in range(i, len(seats)):
#             if seats[j] == 0:
#                 temp += 1
#             else:
#                 maxi = max(maxi, temp)
#                 temp = 0
#         return max(temp, may_max, (maxi+1)//2)
        