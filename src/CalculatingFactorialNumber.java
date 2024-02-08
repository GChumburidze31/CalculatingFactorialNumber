
/*
Develop a program that calculates the factorial of a number provided using a while-loop.
 */

public class CalculatingFactorialNumber {
    public static void main (String []args){

        int target = 8;
        int i = 1;
        int newNumber = target;

        while (i < target){
            newNumber *= i;
            i++;
            System.out.println(newNumber);
        }
    }
}
