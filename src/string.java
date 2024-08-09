import java.lang.reflect.Array;
import java.util.Arrays;

public class string {
    public static void main(String[] args) {
        String str = "nitin";
        int s =0;
        int end = str.length()-1;
        boolean ispalin =true;
        while (s<=0){
            if (str.charAt(s) != str.charAt(end)){
                ispalin = false;
                break;

            } s++;
            end--;

        }
        System.out.println("palindrome : "+ispalin);

        int [] freq = new int [26];
        String string= "bdfnfhmghsferyaadfhgjkaasgfj";
        for( int i =0; i< string.length(); i++){
            char c = string.charAt(i);
            int index = c -'a';
            freq[index] +=1;

        }
        System.out.println(Arrays.toString(freq));
         int maxIndex = 0;
         for( int i =1; i<=25; i++){
         if (freq [i]> freq [maxIndex]){
             maxIndex = i;
         }
    } maxIndex+=97;
         char c =(char)maxIndex;
        System.out.println("maximum index: " +c);

}
}
