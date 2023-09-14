//a java program that computes basic operations of an array of numbers

import java.util.Scanner;

public class Operations {

    
        
        // add_list method: Adds a list of integers in a given array and returns the sum
        public static int add_list(int[] array){

            int result = 0; //initialize result

            for (int i = 0; i < array.length; i++){

                result += array[i]; // sum all numbers within the array
            }

            return result; // return the sum total
        } 
        //end 
    


        //multp_list method: multiplies all numbers in a given array and returns the total
        public static int multp_list(int[] array){

            int result = 1; //initialize result

            for (int i = 0; i < array.length; i++){

                result *= array[i]; // multiplies all entries of the array
            }

            return result;
        }
        //end



        // main method to test the methods
        public static void main(String[] args){

            System.out.println("Type in any amount of integers separated by spaces: your first integer should represent the size of the array (it will not be included in the calculation)");
            Scanner input = new Scanner(System.in); // create variable to read input from user

            int size = input.nextInt(); // get the first integer which is the size of the list

            int[] array = new int[size]; // declare array

            //loop through the list and add all the numbers into the array
            for (int i = 0; i < size; i++){

                array[i] = input.nextInt(); // get each input
            }

            int sum_result = add_list(array); // call add_list method
            int product_result = multp_list(array); // call the multp_list method

            //print sum result
            System.out.print("Addition result: ");
            System.out.println(sum_result);

            //print product result
            System.out.print("Product Result: ");
            System.out.println(product_result);

            //Making a comment for part 10

        }

}


