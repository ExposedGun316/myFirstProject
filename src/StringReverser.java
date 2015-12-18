/**
 * Created by ExposedGun on 02/12/2015.
 */
import java.util.Scanner;
public class StringReverser {
    public static void main(String[] args){

        String string;

        Scanner word = new Scanner(System.in);
        System.out.print("Enter word:");
        string = word.next();
        String reverse = new StringBuilder(string).reverse().toString();
        System.out.println(reverse);

    }
}
