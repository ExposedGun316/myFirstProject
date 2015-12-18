/**
 * Created by Ronan on 02/12/2015.
 */

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args){

        String string;


        //All wrong at the moment... fuck this
        Scanner word = new Scanner(System.in);
        System.out.print("Please enter word:");
        string = word.next();
        String translator = new StringBuilder(string).reverse().toString();
        System.out.println(translator + "ay");


    }
}
