def kind(s):
    try:
        int(s)
        return "int"
    except ValueError:
        pass
    try:
        float(s)
        return "float"
    except ValueError:
        pass
    if s.lower() in ("true", "false"):
        return "bool"
    return "text"


print(kind(input().strip()))
