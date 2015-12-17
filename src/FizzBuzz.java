/**
 * Created by Ronan on 02/12/2015.
 */
public class FizzBuzz {
    public static void main(String[] args){
        int numbers;

        for (numbers = 1; numbers < 100; numbers++){
            if (numbers % 3 == 0 & numbers % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(numbers % 3 == 0){
                System.out.println("Fizz");
            }else if(numbers % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(numbers);
            }
        }

    }
}
