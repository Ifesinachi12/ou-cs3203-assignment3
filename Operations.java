//a java program that computes basic operations of an array of numbers

public class Operations {

    
        
        // add_list method: Adds a list of integers in a given array and returns the sum
        public int add_list(int[] array){

            int result = 0; //initialize result

            for (int i = 0; i < array.length; i++){

                result += array[i]; // sum all numbers within the array
            }

            return result; // return the sum total
        } 
        //end 
    


        //multp_list method: multiplies all numbers in a given array and returns the total
        public int multp_list(int[] array){

            int result = 1; //initialize result

            for (int i = 0; i < array.length; i++){

                result *= array[i]; // multiplies all entries of the array
            }

            return result;
        }
        //end

}
