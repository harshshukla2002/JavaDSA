package recursion.string;

public class SkipCharacter {
    public static void main(String[] args) {
        String str = "anbvnfnrdncen";
        char target = 'n';

        System.out.println(skipChar("",str, target));
    }

    static String skipChar(String res, String str, char target){
        if(str.isEmpty()) return res;

        char ch = str.charAt(0);

        if(ch==target) return skipChar(res,str.substring(1), target);

        return skipChar(res + ch, str.substring(1), target);
    }
}
