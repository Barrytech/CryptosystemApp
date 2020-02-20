import java.util.Scanner;

public class RailFenceCipher {
     
    public static void public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // this scanner collects the input of the user (text and key)
        System.out.print ("Enter the text you want to encryp");
        String normalText = in.nextLine (); // collects the text that is going to be encrypted

        System.out.print ("Enter the Key");
        int Key = in.nextInt(); // collects the key that is going to create the grib

        encryption(normalText, key);

System.out.println(encryption(normalText, key));
    }

static String encryption (String text, int key){ // encryption java method.
    String encryptedText = " ";

    boolean check  = false; // this checks the ZigZag is being followed in the grib
    int j = 0;  // j represents the index in the grib. if j = 0 this means that it is the first box in the grib.
    int row = key; // number of rows is equal to the key 
    int column = text.length (); // the legnth of the text is the number of columns
    char[] [] a = new char [row] [column];

    for (int i = 0; i< column; i++){ 
        if (j == 0 || key -1)
        check = !check; // check if j is equal to 0 or -1 (this checks if j is at the first row, first column or last row, first column)

        a[j][i] = text.charAt(i); // adding each character to the grib
        if (check)
            j++;
        else
            j--;
    }
    for (int i = 0; i < row; i++){
        for (int k = 0; k < column; c++){
            if (a[i][c] != 0 )
            encryptedText += a[i][c];

        }
    }
    for (int i = 0; i < row; i++){
        for (int k = 0; k < column; c++){
            System.out.print (a[i] [k] + ““);
    }
    System.out.println();
    }

    return encryptedText;
}
//_____________________________________________________________________________________________________________________
static String decryption (String text, int key ){//method for decrypting text
String decryptedText = " ";

boolean check  = false; // this checks the ZigZag is being followed in the grib
    int j = 0;  // j represents the index in the grib. if j = 0 this means that it is the first box in the grib.
    int row = key; // number of rows is equal to the key 
    int column = text.length (); // the legnth of the text is the number of columns
    char[] [] a = new char [row] [column];
// for loop added 
  
   


for (int i = 0; i< column; i++){ 
    if (j == 0 || (key -1)
    check = !check; // check if j is equal to 0 or -1 (this checks if j is at the first row, first column or last row, first column)

    a[j][i] = '*'; // adding each character to the grib
    
    if (check)
        j++;
    else
        j--;
}


}
System.out.println();
int index = 0;
check = false;
for(int i=0; i< row; i++){
    for (int c = 0; c< column; c++){
       if (a[i][c] == '*' && index < column){
           a[i][c] = text.charAt(index++);
       }
    }
}




j = 0;
for (int i = 0; i< column; i++){ 
    if (j == 0 || key -1)
    check = !check; // check if j is equal to 0 or -1 (this checks if j is at the first row, first column or last row, first column)

    decryptedText += a[j][i];
    if (check)
        j++;
    else
        j--;
}



return decryptedText;



}



}