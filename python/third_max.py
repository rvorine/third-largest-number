def third_max(nums):
    first = second = third = None

    for num in nums:
        if num in (first, second, third):
            continue  # only distinct values count

        if first is None or num > first:
            first, second, third = num, first, second
        elif second is None or num > second:
            second, third = num, second
        elif third is None or num > third:
            third = num

    return third if third is not None else first


if __name__ == "__main__":
    print(third_max([3, 2, 1]))        # 1
    print(third_max([1, 2]))           # 2  (fewer than 3 distinct -> max)
    print(third_max([2, 2, 3, 1]))     # 1  (duplicates ignored)
