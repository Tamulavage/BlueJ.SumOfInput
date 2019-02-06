/**
 * Created by iyasuwatts on 10/17/17.
 * 
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        int sumOfInt = 0;
        
        System.out.println("Hello, please input a number :");
        
        Scanner reader = new Scanner(System.in);
        int numToCount = reader.nextInt();
        
        reader.close();
        
        for(int x=1;x<=numToCount; x++){
            sumOfInt=sumOfInt+x;
        }
        
        System.out.println("Sum of number 1 to " + numToCount + " is " + sumOfInt);
        

    }
    

}
