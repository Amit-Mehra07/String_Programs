package JavaProgram.String_programs;

public class EncodingbyTwo {
    public static void main(String[] args) {
        String name = "Stupid";
        String newName = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if(ch == 'Y'|| ch == 'Z'||ch == 'z'|| ch == 'y')
                ch -= 26;//back to its starting position
            ch += 2;
            newName = newName+ch;
        }
        System.out.println("Encoded String are : "+newName);
    }
}
