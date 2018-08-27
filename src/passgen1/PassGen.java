package passgen1;

/*
Author: @Posiu
Version: 1.0
Date: 27-08-2018
Desc: My first password generator app

Simple console application
 */

public class PassGen {
    public static void main(String[] args) {

        System.out.println("Please type how would you like to build your password.");
        System.out.println("______________________________________________________");


        System.out.println();

        Generator mHowMany = new Generator(); //constructor
        mHowMany.getHowManyPasses();
        int howMany = mHowMany.howManyPass;


        Generator mPassLength = new Generator(); //constructor
        mPassLength.getPassLength();
        int howLong = mPassLength.passLength;

        int loop = 0;
        while(loop < howMany){
            Generator mGenerator = new Generator();
            mGenerator.generatePass(howLong);
            loop++;

        }

    }
}

