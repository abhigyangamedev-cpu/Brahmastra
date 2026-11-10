# Binary string -> decimal, hex, octal without prefixes.
s = input()
n = int(s, 2)
print(n)
print(hex(n)[2:])
print(oct(n)[2:])
