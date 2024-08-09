public class callstack {



   //factorail
    public static int factorial (int m){
        if (m==1|| m==0){
            return 1;
        }
        else return factorial(m-1)*m;
    }
   //simple recursion
    public static void print ( int start , int n) {
        if (start <=n){
            System.out.println(start);

         start++;
        print(start,n);}


    }

    public static void main(String[] args) {
        print(0,8);
       int fact= factorial(5);
        System.out.println( "factorial :" +fact);
    }
}