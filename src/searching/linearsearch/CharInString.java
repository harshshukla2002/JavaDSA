package searching.linearsearch;

public class CharInString {
    public static void main(String[] args) {
        String str = "abcdefgh";

        System.out.println(searchChar(str, 'e'));
    }

    static int searchChar(String str, char target){
        if (str.isEmpty()) return -1;

        for(int index=0;index<str.length();index++){
            if (str.charAt(index) == target) return index;
        }

        return -1;
    }
}
