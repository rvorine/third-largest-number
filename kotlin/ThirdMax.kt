fun thirdMax(nums: IntArray): Int {
    var first = Long.MIN_VALUE
    var second = Long.MIN_VALUE
    var third = Long.MIN_VALUE

    for (num in nums) {
        if (num.toLong() == first || num.toLong() == second || num.toLong() == third) continue // only distinct values count

        if (num > first) {
            third = second
            second = first
            first = num.toLong()
        } else if (num > second) {
            third = second
            second = num.toLong()
        } else if (num > third) {
            third = num.toLong()
        }
    }
    return (if (third == Long.MIN_VALUE) first else third).toInt()
}

fun main() {
    println(thirdMax(intArrayOf(3, 2, 1)))     // 1
    println(thirdMax(intArrayOf(1, 2)))        // 2
    println(thirdMax(intArrayOf(2, 2, 3, 1)))  // 1
}
