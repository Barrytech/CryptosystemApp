//A Java Program to illustrate Caesar Cipher Technique 
class CaesarCipher 
{ 
    // Encrypts text using a shift od s 
    public static StringBuffer encrypt(String text, int s) 
    { 
        StringBuffer result= new StringBuffer(); 
  
        for (int i=0; i<text.length(); i++) 
        { 
            if (Character.isUpperCase(text.charAt(i))) 
            { 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 65) % 26 + 65); 
                result.append(ch); 
            } 
            else
            { 
                char ch = (char)(((int)text.charAt(i) + 
                                  s - 97) % 26 + 97); 
                result.append(ch); 
            } 
        } 
        return result; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        Scanner key = new Scanner(System.in);
        int s = key.nextInt();
        System.out.println(" Your key value is " + s + "; so the alphabet shifts of" + s + " letter space"));
        Scanner choice = new Scanner(System.in);
        String text  = choice.nextString(); 
      
       ; 
        System.out.println("Text  : " + text));
        System.out.println("Shift : " + s); 
        System.out.println("Cipher: " + encrypt(text, s)); 
    } 
} 