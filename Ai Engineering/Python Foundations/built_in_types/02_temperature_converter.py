# Celsius (may be decimal) -> Fahrenheit rounded to 2 places. F = C * 9/5 + 32
c = float(input())
f = c * 9 / 5 + 32
print(round(f, 2))
