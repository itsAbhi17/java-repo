public class traversingarray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                        {9, 10, 11, 12}};

//linear serach

        int target = 7;
        int n = arr.length;
        int m = arr[0].length;
       // for (int i = 0; i < n; i++) {
         //   for (int j = 0; j < m; j++) {
           //     if (arr[i][j] == target) {
             //       System.out.println("target the index " + i + "," + j);
               // }
            //}
        //}
    //}
//}




//binary search
        for (int i = 0; i < n; i++){
        int start=0;
        int end = n-1;
        while (start<=end){
        int mid = start + (end-start)/2;
         if ( arr [i][mid] == target ){
                System.out.println(" target is at index(" +i+","+mid+")");
                break;

                } else if(arr[i][mid]<target){
    start=mid+1;

            }else end =mid-1;
        }
        }
    }
}