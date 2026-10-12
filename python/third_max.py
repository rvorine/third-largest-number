NEG_INF = float("-inf")  # Python has no fixed-width Long; -inf is smaller than any input


def third_max(nums):
    first = second = third = NEG_INF

    for num in nums:
        if num in (first, second, third):
            continue  # only distinct values count

        if num > first:
            first, second, third = num, first, second
        elif num > second:
            second, third = num, second
        elif num > third:
            third = num

    return first if third == NEG_INF else third


if __name__ == "__main__":
    print(third_max([3, 2, 1]))        # 1
    print(third_max([1, 2]))           # 2  (fewer than 3 distinct -> max)
    print(third_max([2, 2, 3, 1]))     # 1  (duplicates ignored)
