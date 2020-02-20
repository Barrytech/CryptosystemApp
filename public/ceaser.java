// this entire code is to edit and shape it into become a ceasar cipher crypto system
import java.util.Random;
import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello Prof. Lane, This is my programming Assignment 1");
        System.out.println(' ');
        System.out.println(" Please enter the number of element you want your array to have: ");
        
        // I am creating a scanner to prompt the user how long the array should be
        Scanner choice = new Scanner(System.in);
        // Creating random values to fill in the array with
        Random rd = new Random();
        int x = choice.nextInt();  
        int [] Array = new int[x];
        
        for( int i =0; i< x; i++){
            
            Array[i] = rd.nextInt(100);
        }
        // Printing out the array created from the user's requirements
        
        System.out.println(" Here is the array you created from your inputs: ");
        
        for( int i = 0; i <Array.length; i++ ){
            
            System.out.print( Array[i] +" ");
        }
        System.out.println(" ");
        System.out.println(" ");
        //Now Prompting the user to chose an operation to perform with the array
        System.out.println(" Which operation do you want to perform? ");
        System.out.println(" Press 1 for Fetch ");   
        System.out.println(" Press 2 for Insert ");
        System.out.println(" Press 3 for Delete ");
        System.out.println(" Press 4 for Update ");
        
        int entry = choice.nextInt();
        
        //Fetch
        if (entry == 1){
            //Prompting the user to choose which value to fetch from the array displayed
            
            Scanner This = new Scanner(System.in);
            System.out.println("enter the value you want to fetch");
            int Z = This.nextInt();
            for ( int i = 0; i< Array.length; i++){
                if (Array[i] == Z){
                    System.out.println( " The value you fetched is at index " + i + " ");
                }
            }
            
        }
        //Insert
        else if( entry == 2){
            //Prompting the value to choose what value they want you insert
            System.out.println("Please enter what value you want to insert into your array");
            Scanner insert = new Scanner(System.in);
            int ins = insert.nextInt();
            int inserted = x+1;
            
            int [] newArray = new int[inserted];
            
            for ( int i = 0; i<Array.length; i++){
                newArray[i]= Array[i];
            
            }
            newArray[x]= ins;
            //review this loop
            // I have tried to find a way to print the array as a whole but all I got is printing the value separateley
            // I know the SOP shouldn't be inside this for loop but that's the only way i got it working. 
            for (  int i = 0; i<inserted; i++){
                System.out.println(" The new Array after your insertion is " + newArray[i]);
               
            }
          
        }
        //Delete
        else if ( entry == 3){
            //Prompting the user to chose which value to delete from the array
            System.out.println(" Please choose the value you want to delete from the array ");
            Scanner delete = new Scanner(System.in);
            int del = delete.nextInt();
            int deleted = x-1;
            
            int [] newArray = new int[deleted];
            for (int i =0; i<Array.length; i++){
                newArray[i]= Array[i];
            }
            for (int i = 0; i<Array.length-1; i++){
                Array[i] = Array[i+1];
            }
            System.out.println(" The new array is " );
            for ( int i = 0; i< deleted; i++){
                System.out.println(Array[i]+ " ");
            }
        }
        //Update    
        else if ( entry == 4){
            //Prompting the user to choose which value to update
            System.out.println(" Please choose the value you want to update ");
            Scanner update = new Scanner(System.in);
            int upd = update.nextInt();
            System.out.println(" Please enter the value you want you use to update ");
            Scanner newVal = new Scanner(System.in);
            int newValue = newVal.nextInt();
            
            for (int i = 0; i<Array.length; i++){
                if( upd == Array[i]){
                    Array[i] = newValue;
                }
            }
        }
        else{
            System.out.println(" Please choose from choices above!");
        }
    }
    
}
