# Print 2 ** n, its digit count, and (bonus) its digit sum.
n = int(input())
ans = str(2 ** n)
print(ans)
print(len(ans))
print(sum(map(int, ans)))  # bonus
