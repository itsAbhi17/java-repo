import java.sql.SQLOutput;

public class transposearray {
    public static void main(String[] args) {
        int [][]arr= {{2,4,5,3},
                {22,4,3,2},
                { 54,3,2,5},
                { 2,99,7,54}};

        int n= arr.length;
        int m = arr[0].length;
        for ( int i=0; i<m;i++){
            for ( int j=0; j<n;j++){
                System.out.print(arr[j][i] +" ");
            }
            System.out.println();
        }
    }
}
