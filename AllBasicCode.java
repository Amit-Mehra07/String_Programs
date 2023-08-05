package JavaProgram.String_programs;

public class AllBasicCode {
    public static void main(String[] args) {
        String quote = "Its Simplea178";
        int countU = 0; int countL = 0; int countD = 0; int countRepeat = 0; int countVowel = 0;

        for(int i = 0; i<quote.length(); i++){
            char c = quote.charAt(i);//its takin char one by one and stored in variable c.
//            System.out.println(c);// it prints all character in a new line

            //PRINT ASCII VALUE OF EACH CHARACTER OF A STRING -->>
//            System.out.println(c+" -->> "+(int)c);

            //PRINT ONLY UPPER CASE LETTER OF A STRING -->>
//            if(Character.isUpperCase(c))
//            System.out.println(c);

//            if(Character.isLowerCase(c))
//                System.out.println(c);

//            if(Character.isDigit(c))//To find digits in your string
//                System.out.println(c);

//            if(Character.isLetter(c))//The isLetter(char ch) method returns a Boolean value i.e. true if the given(or specified) character is a letter.
//                                    // Otherwise, the method returns false.
//                System.out.println(c);

//            if(Character.isLetterOrDigit(c))//Letter or Digit prints all
//                System.out.println(c);

            //COUNT ONLY UPPER CASE CHARACTER IN A STRING -->>
            //We need to initialize a count var outside the for loop
if(Character.isUpperCase(c)){
    countU++;

}
if(Character.isLowerCase(c)){
    countL++;
}
if(Character.isDigit(c)){
    countD++;
}
// COUNTING PARTICULAR CHARACTER -->
char u = Character.toUpperCase(c);
if(u =='S') {
    countRepeat++;
}

//To COUNT ALL VOWELS  -->>
            if(u =='A'|| u == 'E' || u == 'I' || u == 'O' || u == 'U'){
                countVowel++;
            }


        }
        System.out.println(countU+" Upper Case Letter");
        System.out.println(countL+" Lower Case Letter");
        System.out.println(countD+" Digits here");
        System.out.println("Repeated "+countRepeat+" Times ");
        System.out.println("In this string "+countVowel+" Times Vowels are Used ");
    }
}
