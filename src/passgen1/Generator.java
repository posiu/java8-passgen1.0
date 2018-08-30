package passgen1;

import java.util.Random;
import java.util.Scanner;

public class Generator {


    String[] allChars = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "`", "~", ";",
        ":", "'", "<", ",", ">", ".", "/", "?", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
        "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
        "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

    private Random random = new Random();
    private String pass = ""; // password
    private StringBuilder sb = new StringBuilder(pass);
    int passLength;
    int howManyPass;


    public int getPassLength() {
        Scanner scannerPassLength = new Scanner(System.in);
        System.out.print("How long password would you like? ");
        passLength = scannerPassLength.nextInt();
        return passLength;
    }

    public int getHowManyPasses() {

        Scanner scannerHowManyPass = new Scanner(System.in);
        System.out.print("How many passwords would you like to generate? ");
        howManyPass = scannerHowManyPass.nextInt();
        return howManyPass;
    }

    protected String generatePass(int passLength){

        for (int i = 0; i < passLength; i++) {
            String tmpPass = allChars[random.nextInt(allChars.length)]; //selecting a single char from table
            sb.append(tmpPass); // selected char added to a stringbuilder

            if(sb.length() == passLength){ //if pass have a proper length, then print it
                System.out.println(sb.toString());

            }
        }
        return sb.toString();
    }


}
