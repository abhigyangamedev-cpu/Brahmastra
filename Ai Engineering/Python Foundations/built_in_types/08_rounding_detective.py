import math

x = float(input())
print(round(x), int(x), math.floor(x), math.ceil(x))

#  2.5 ->  2  2  2  3   round goes to even on a tie
#  3.5 ->  4  3  3  4   round goes to even on a tie
# -2.5 -> -2 -2 -3 -2   int truncates toward 0, floor goes down
# -2.7 -> -3 -2 -3 -2   round goes to nearest
