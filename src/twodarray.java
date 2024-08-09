public class twodarray {
    public static void main(String[] args) {
        int  n = 4 ;
        int [][]arr= {{2,4,5,3},
                      {22,4,3,2},
                      { 54,3,2,5},
                       { 2,99,7,54}};
        for(int i=0;i<=n;i++){
            int m=arr[i].length;
            for(int j=0;j<m ; j++) {
                System.out.print(arr[i][j] + " ");


            }System.out.println();
       }

    }
}
