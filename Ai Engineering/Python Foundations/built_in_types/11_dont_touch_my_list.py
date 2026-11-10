def doubled(nums):
    return [x * 2 for x in nums]  # NEW list


def double_in_place(nums):
    for i in range(len(nums)):
        nums[i] *= 2  # mutates caller's list, returns None


a = [1, 2, 3]
b = doubled(a)
print(a, b)    # [1, 2, 3] [2, 4, 6]
print(a is b)  # False

r = double_in_place(a)
print(a, r)    # [2, 4, 6] None
