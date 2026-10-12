[![Instagram](https://img.shields.io/badge/Instagram-lacopydepastel-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://instagram.com/lacopydepastel)
[![YouTube](https://img.shields.io/badge/YouTube-%40rvorine-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://youtube.com/@rvorine)

# Third Largest Number (LeetCode 414 — Third Maximum Number)

## Problem

Given integer array `nums`, return the **third distinct maximum** number. If fewer than three distinct numbers exist, return the **maximum** instead.

Example:

```
Input:  [3,2,1]        Output: 1
Input:  [1,2]          Output: 2   // only two distinct values -> return max
Input:  [2,2,3,1]      Output: 1   // duplicates don't count: distinct values are 3,2,1
```

## Solution

Track the top three distinct values in one pass — no sorting.

Keep three variables `first > second > third`, all starting as `Long.MIN_VALUE` ("unset"). Using a `long` sentinel is safe because no `int` input can ever equal it, whereas `Integer.MIN_VALUE` would collide with a legitimate input value. (JavaScript and Python have no fixed-width Long, so they use `-Infinity` / `float("-inf")` instead.)

For each `num`:
1. If it equals `first`, `second` or `third`, skip it — only **distinct** values count.
2. If it beats `first`, shift everything down: `third = second`, `second = first`, `first = num`.
3. Else if it beats `second`, shift: `third = second`, `second = num`.
4. Else if it beats `third`, set `third = num`.

At the end, if `third` is still the sentinel return `first` (fewer than three distinct values), otherwise return `third`.

**Time:** O(n) — single pass, constant work per element.
**Space:** O(1) — three variables.

## Implementations

| Language | File |
|---|---|
| Python | [`python/third_max.py`](python/third_max.py) |
| Java | [`java/ThirdMax.java`](java/ThirdMax.java) |
| Kotlin | [`kotlin/ThirdMax.kt`](kotlin/ThirdMax.kt) |
| JavaScript | [`javascript/thirdMax.js`](javascript/thirdMax.js) |
| C# | [`csharp/ThirdMax.cs`](csharp/ThirdMax.cs) |
