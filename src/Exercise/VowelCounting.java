/*
program counting how many vowels are contained in a sentence given by the user
 */
package Exercise;

import java.util.Scanner;

public class VowelCounting {
        public static void main (String args []){
            Scanner sc = new Scanner(System.in);    // new scanner
            int count=0;
            System.out.println("Enter your sentence ");   //asking input from user
            String sentence = sc.nextLine();
            sentence= sentence.replaceAll("\\s","");    //eliminating all spaces

           // System.out.println(sentence);   //testing

            char [] myCharArray = sentence.toCharArray();    // transforming the String sentence into a char array

            //loop through all the elements in the array and update counter if element matches vowel
            for (int i= 0; i<myCharArray.length; i++){
                if(myCharArray[i]=='a'||myCharArray[i] =='e' ||myCharArray[i] =='i' ||myCharArray[i] =='o'
                        ||myCharArray[i] =='u'){
                    count=count+1;
                }
            }
            System.out.println("Total number of vowels = " + count);
        }
}
