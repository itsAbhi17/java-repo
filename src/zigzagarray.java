public class zigzagarray {
    public static void main(String[] args) {

        int [][]arr= {{2,4,5,3},
                       {22,4,3,2},
                        { 54,3,2,5},
                         { 2,99,7,54}};

        int n= arr.length;
        int m = arr[0].length;
         for ( int j=0; j<m;j++){
             if (j%2==0){
                 for (int i=0; i<n;i++) {
                     System.out.print(arr[i][j] + " ");
                 } }else{
                         for ( int k= n-1;k>=0; k--){
                             System.out.print( " "+ arr[k][j]);
                         }
                     }System.out.println();
                 }
             }
         }

