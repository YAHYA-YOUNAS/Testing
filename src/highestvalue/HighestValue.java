
package highestvalue;


public class HighestValue {

    public static void main(String[] args) {
        int[] numbers = {7,8,9,5,6};
        
        int highest = numbers[0];
        
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] > highest) {
                highest = numbers[i];
            }
            
        }
        System.out.println("Highest value: " +highest);
    }
    
}
