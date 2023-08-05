package JavaProgram.String_programs;

import java.util.Arrays;
import java.util.Scanner;

public class BasicStrings {
    public static void main(String[] args) {
        String firstName  = "Amit";
        String lastName  = "Mehra" ;
                                                   // Concatenation
//        System.out.println(firstName+" "+lastName);
        //For taking input from user we need a Scanner class that exist in util class

//        Scanner sc = new Scanner(System.in);
//        String occupation = sc.next();//taking single token
//        System.out.println(occupation);
//        String sentence = sc.nextLine();// able to take sentencent
//        System.out.println("This is your sentence -> "+ sentence);


                                                 // LENGTH OF STRING -->> length()

//        System.out.println(lastName.length());

        // TO PRINT CHARACTER ONE BY ONE IN THAT STRING WE USE charAt() method

        /*for (int i = 0; i < firstName.length(); i++) {
            System.out.println(firstName.charAt(i));
        }*/


                                                 // STRING COMPARISON -->> compareTo()
        String name1 = "Sonyjkh";
        String name2 = "Sonyii";
        //1. s1 < s2 --> any +ve value
        //2. s1 == s2 --> 0 return zero
        //3. s1 > s2 --> any -ve value

//hello or cello , so hello is a big string because of its order..
//        if(name1.compareTo(name2) < 0){
//            System.out.println("String 1 is less than to String2");
//        } else if (name1.compareTo(name2)> 0) {
//            System.out.println("String 1 is greater than to String2");
//        } else if (name1.compareTo(name2) ==0) {
//            System.out.println("Strings are equal");
//        }
//        else {
//            System.out.println("Strings are not equal");
//        }//Something wrong here

        /*if(new String("Amit") == new String("Amit")){
            System.out.println("String are equal");
        }else{
            System.out.println("String are NOT equal");
        }*/


/*String s1 = new String("Mehra");
        String s2 = new String("Mehra");
        if(s1.equals(s2)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not Equals");
        }*/

                                                             // SUBSTRING IN STRING
        String sentence = "My name is tony stark";
//        substring(beg index, end index)
//        String names = sentence.substring(11,15);//12,13,14,15
        String names = sentence.substring(11,sentence.length());//12,13,14,15
        //when we not assign last index then it will automatically take till last of the string
        System.out.println(names);
    }

}
