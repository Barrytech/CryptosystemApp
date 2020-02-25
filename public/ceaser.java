// this entire code is to edit and shape it into become a ceasar cipher crypto system
import java.util.Random;
import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello this is the ceasar cipher cryptosystem");
        System.out.println(' ');
        System.out.println(" Please enter the key you want to use: ");
        
        // I am creating a scanner to prompt the use you chose the key
        Scanner choice = new Scanner(System.in);
        // Creating an array and fill it with the alphabet
        int x = choice.nextInt();  
        String [] alphabet = new String[26] {"A","B","C","D","E","F","G","I","J"
    ,"K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String [] ciphered = new String[26];
      
        int entry = choice.nextInt();
        //Updated alphabet according to chosen key    
        if ( entry > 0){
            //Prompting the user to choose which value to update

            
            for (int i = 0; i<alphabet.length; i++){
                ciphered[i] = alphabet[i+entry];
                
                }
                system.out.println("This is the ceaser ciphered alphabet " + ciphered[i] );
            }
        
    
    }
    
}
//Hello tho