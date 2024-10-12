//problem no 1

import java.util.Scanner;

public class lengthInt1 {
      
    static void myFu(int n ){
       
        int count = 0;
        System.out.println(n);
        
        if(n==0){

        System.out.print("Number of Digits = 1");

        }
        else{

            while(n != 0)
            
            {
            
            count++;
            
            n = n / 10;
            
            }
            
            System.out.print("Number of Digits is "+count);
            
            }

    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = sc.nextInt(); 


        myFu(num); 
    
    }

    
}
