package JavaProgram.String_programs;

public class WordStringProg {
    public static void main(String[] args) {
String sentence = "Hello My name is Tony Stark";
String myName = "Khiladi 786 Don"; String d = "",r= "";
String empty = "";
String college = "Devi Ahilya Vishwa Vidhyalaya";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if(Character.isUpperCase(ch)){
                empty = empty+ch;
            }
        }
        System.out.println("This is our new generated string that made by only UpperCase Letter   --> "+empty);

        //NEW STRING WHERE DIGITS FIRST AND THEN REMAINING CHRACTERS -->
        for (int i = 0; i < myName.length(); i++) {
            char ch = myName.charAt(i);
//            if(Character.isDigit(ch)){//for arranging digits first and then  characters
            if(Character.isUpperCase(ch)){//for arranging upper case letter first then lower case
                d = d+ch;
            }else{
                r = r+ch;
            }
        }
        String complete = d+r;
//        System.out.println("New String is --> "+complete);
        System.out.println("Arrangement of Upper case first then lowercase --> "+complete);


        // REMOVING ALL WHITE SPACES IN A STRING -->>
        String rmSpace = "";
        for (int i = 0; i < college.length(); i++) {
char ch  = college.charAt(i);
            if(!Character.isWhitespace(ch)){
                rmSpace = rmSpace+ch;
            }
        }
        System.out.println("The resultant is without spaces -->> "+rmSpace);

        // REVERSE THE CASE OF STRING LIKE LOWER TO UPPER AND VICE A VERSA -->>
        String caseChangeStr = "";
        for (int i = 0; i <college.length() ; i++) {
            char ch = college.charAt(i);
            if(Character.isUpperCase(ch)){
                caseChangeStr = caseChangeStr+Character.toLowerCase(ch);
            }else{
                caseChangeStr = caseChangeStr+Character.toUpperCase(ch);
            }
        }
        System.out.println("This is the reversed case string -- >>"+ caseChangeStr);

        //REVERSE THE STRING   ---- >>>>
        String reverse = "";
        for (int i = 0; i < college.length(); i++) {
            char ch = college.charAt(i);
            reverse = ch+reverse;
        }
        System.out.println("This is the reverse String -- >>  "+reverse);
        if(college.equalsIgnoreCase(reverse)){
            System.out.println("Its palindrome");
        }else{
            System.out.println("Not a Palindrome");

        }
    }
}
