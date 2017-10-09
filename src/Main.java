import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        //Problem 2
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++ ){
            list1.add(i);
            list2.add(i);
        }
        alternate(list1, list2);
        //Problem 5
        ArrayList<Integer> list3 = new ArrayList<Integer>();
            list3.add(3);
            list3.add(7);
            list3.add(3);
            list3.add(-2);
            list3.add(11);
            list3.add(8);
        System.out.println(list3);
      // sortAndRemove(list3);
        //Problem 7
        ArrayList<Integer> list4 = new ArrayList<Integer>();
            list4.add(2);
            list4.add(7);
            list4.add(9);
            list4.add(-8);
            list4.add(11);
            list4.add(5);
        countCommon(list3, list4);
        //Problem 8
        HashSet<String> set = new HashSet<>();
        /*set.add("king");
        set.add("why");
        set.add("LOL");
        set.add("Probably");
        set.add("kek");*/
        maxLength(set);
        //Problem 9
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(1);
        hasOdd(set2);
    }
    public static void hasOdd(HashSet<Integer> set){
        boolean check = false;
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            int x = itr.next();
            if(x % 2 != 0){
                check = true;
                break;
            }
        }
        System.out.println("Has odd = " + check);
    }

        public static void maxLength(HashSet<String> set){
        String max = "0";
        int maxL = 0;
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            String check = itr.next();
            if(check.length() > maxL){
                max = check;
                maxL = max.length();
            }
        }
        System.out.println(max + " Has a length of " + maxL);
    }

        public static void countCommon (ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int count = 0;
        for (int i = 0; i < list1.size(); i++) {
            int x = list1.get(i);
            for (int j = 0; j < list2.size(); j++) {
                int y = list2.get(j);
                if (x == y) {
                    count++;
                    list2.remove(j);
                    j--;
                }
            }
        }
        System.out.println(count);
    }
        public static void sortAndRemove(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            int x = list.get(i);
            int count = 0;
            for(int j = 0; j < list.size(); j++){
                int y = list.get(j);
                if(x == y){
                    count++;
                }
                if(count >= 2){
                    list.remove(j);
                    j--;
                    count = 1;
                }
            }
        }
       // System.out.println(list);
        for(int i = 0; i < list.size(); i++){
            int x = list.get(i);
            for(int j = 0; j < list.size(); j++){
                int y = list.get(j);
                if(x < y){
                    list.remove(j);
                    list.add(y);
                }
            }
            //System.out.println(list);
        }
        System.out.println(list);
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
