# Uppercase and alphabet position without .upper(); bonus: next letter, z wraps to a.
letter = input()

upper = chr(ord(letter) - (ord('a') - ord('A')))
position = ord(letter) - ord('a') + 1
next_letter = chr((ord(letter) - ord('a') + 1) % 26 + ord('a'))  # bonus

print(upper, position)
print(next_letter)
