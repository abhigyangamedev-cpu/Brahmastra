def greet(name=None):
    return "Hello, " + (name or "Guest")  # None and "" are both falsy


print(greet())
print(greet(""))
print(greet("Abhi"))
