
class MaxEle {
    static int arr[] = {10, 24, 4500, 90, 198};

    static int findLargest() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Largest element in the array: " + findLargest());
    }
}
