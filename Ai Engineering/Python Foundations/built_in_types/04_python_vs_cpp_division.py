# Python floors toward -infinity; C++ truncates toward 0.
a, b = map(int, input().split())

py_q, py_r = a // b, a % b

cpp_q = abs(a) // abs(b)
if (a < 0) != (b < 0):
    cpp_q = -cpp_q
cpp_r = a - b * cpp_q

print("Python:", py_q, py_r)
print("C++:   ", cpp_q, cpp_r)
