# Bug: the outer * 3 repeats the REFERENCE to one inner list.
bad = [[0] * 3] * 3
bad[0][0] = 1
print(bad)             # [[1, 0, 0], [1, 0, 0], [1, 0, 0]]
print(bad[0] is bad[1])  # True

# Fix: a new row each time.
grid = [[0] * 3 for _ in range(3)]
grid[0][0] = 1
print(grid)                # [[1, 0, 0], [0, 0, 0], [0, 0, 0]]
print(grid[0] is grid[1])  # False
