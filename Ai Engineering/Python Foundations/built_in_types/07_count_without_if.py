# Count even numbers without if or a counter variable (True counts as 1).
nums = list(map(int, input().split()))
print(sum(x % 2 == 0 for x in nums))
