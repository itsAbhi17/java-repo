public class array {


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] reverse = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+(" "));
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - i -1];


        }

        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i]+"  ");

        }


    }
}

