import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++ ){
            list1.add(i);
            list2.add(i);
        }
        alternate(list1, list2);

        


    }

    public static void alternate (ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int x = 0;
        if(list1.size()> list2.size()){
            x = list1.size();
        } else if(list1.size()> list2.size()) {
            x = list2.size();
        } else{
            x = list1.size();
        }
        for(int i = 0; i < x; i++ ){
            list.add(list1.get(i));
            list.add(list2.get(i));
        }
        System.out.println(list);

    }
}
