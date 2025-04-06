package string;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();

        for(int i =0;i<26;i++){
            char val = (char)('a' + i);
            string.append(val);
        }

        System.out.println(string);
    }
}
