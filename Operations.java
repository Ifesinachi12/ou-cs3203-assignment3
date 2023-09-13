//a java program that computes basic operations of an array of numbers

import java.util.Arrays;
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




        //takes in a given array, reverses the array ans returns the newly reversed array
        public static int[] reverse_array(int[] array){

            int[] rev_array = new int[array.length]; // create a new array for the reverse
            int j = 0; // create index for reverse array

            for (int i = array.length - 1; i >= 0; i--){

                rev_array[j] = array[i]; // reverse the array
                j++; // increment j (the index of the reverse array)
            }

            return rev_array; //return the reversed array
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
            int[] rev_array = reverse_array(array); // call reverse method

            //print sum result
            System.out.print("Addition result: ");
            System.out.println(sum_result);

            //print product result
            System.out.print("Product Result: ");
            System.out.println(product_result);

            //print reversed array
            System.out.print("Reversed Array Result: ");
            System.out.println(Arrays.toString(rev_array));

            //print original array for comparison
            System.out.print("For Comparison, Original array: ");
            System.out.println(Arrays.toString(array));


            System.out.print("Thanks for playing! ");
            

        }
        //end

}


