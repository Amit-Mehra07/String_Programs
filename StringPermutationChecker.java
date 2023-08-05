package JavaProgram.String_programs;

import java.util.Arrays;

public class StringPermutationChecker {
    public static boolean arePermutations(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean arePermutations = arePermutations(str1, str2);

        if (arePermutations) {
            System.out.println(str1 + " and " + str2 + " are permutations of each other.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not permutations of each other.");
        }
    }
}

