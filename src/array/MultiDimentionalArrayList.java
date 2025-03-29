package array;

import java.util.ArrayList;

public class MultiDimentionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }
    }
}
