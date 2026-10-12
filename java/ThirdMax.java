public class ThirdMax {

    static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == first || num == second || num == third) {
                continue; // only distinct values count
            }

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }
        return (int) (third == Long.MIN_VALUE ? first : third);
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{3, 2, 1}));     // 1
        System.out.println(thirdMax(new int[]{1, 2}));        // 2
        System.out.println(thirdMax(new int[]{2, 2, 3, 1}));  // 1
    }
}
