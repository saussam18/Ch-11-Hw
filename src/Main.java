import java.lang.reflect.Array;
import java.util.*;

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
        set.add("king");
        set.add("why");
        set.add("LOL");
        set.add("Probably");
        set.add("kek");
        maxLength(set);
        //Problem 9
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(1);
        hasOdd(set2);
        //Problem 10
        removeEvens(set);
        //Problem 12
        ArrayList<String> list5 = new ArrayList<String>();
        list5.add("kek");
        list5.add("kek");
        list5.add("like");
        list5.add("dude");
        list5.add("kek");
        contains3(list5);
        //Problem 14
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        HashMap<String, Integer> map3 = new HashMap<String, Integer>();
        map2.put("Bob", 77);
        map2.put("Carol", 67);
        map2.put("Bill", 57);
        map2.put("Paul", 47);
        map2.put("Guy", 12);
        map3.put("Bob", 77);
        map3.put("Carol", 22);
        map3.put("Paul", 11);
        map3.put("Ian", 42);
        map3.put("Guy", 12);
        intersect(map2, map3);
        //Problem 15
        mode(list3);
        //Problem 18
        HashMap<Integer, String> map4 = new HashMap<Integer, String>();
        map4.put(42, "Guy");
        map4.put(22, "Guy");
        map4.put(12, "Bob");
        map4.put(47, "Rick");
        map4.put(55, "Rick");
        map4.put(99, "Judy");
        reverse(map4);
    }
        public static void reverse (HashMap<Integer, String> map){
            HashMap<String, Set<Integer>> map2 = new HashMap<String, Set<Integer>>();
            for (Integer key : map.keySet()) {
                if(map2.containsKey(map.get(key)) == false){
                    map2.put(map.get(key), new TreeSet<Integer>());
                    map2.get(map.get(key)).add(key);
                }else{
                    map2.get(map.get(key)).add(key);
                }
            }
            System.out.println(map2);
        }

        public static void mode (ArrayList<Integer> list){
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            int check = itr.next();
            if(map2.containsKey(check) == false){
                map2.put(check, 1);
            }else{
                int x = map2.get(check);
                x++;
                map2.put(check, x);
            }
        }
        int max = 0;
        int it = 0;
        for (Integer key : map2.keySet()) {
            int check = map2.get(key);
            if(check > max){
                 max = check;
                 it = key;
            }
        }
        System.out.println(it + " is the mode with " + max);

    }

        public static void intersect ( HashMap<String, Integer> map1,  HashMap<String, Integer> map2) {
        HashMap<String, Integer> map3 = new HashMap<String, Integer>();
        for (String key : map1.keySet()) {
            if(map1.containsKey(key) && map2.containsKey(key)){
                int check1 = map1.get(key);
                int check2 = map2.get(key);
                if(check1 == check2){
                    map3.put(key, check1);
                }
            }
        }
        System.out.println(map3);
    }

        public static void contains3 (ArrayList<String> list){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Iterator<String> itr = list.iterator();
        boolean contains = false;
        System.out.println(list);
        while(itr.hasNext()){
            String check = itr.next();
            if(map.containsKey(check) == false){
                map.put(check, 0);
            }
                if(map.containsKey(check)){
                int x = map.get(check);
                x++;
                map.put(check, x);
                System.out.println(map);
            }
            if(map.get(check) == 3){
                contains = true;
                break;
            }
        }
        System.out.println(contains);
        }

        public static void removeEvens (HashSet<String> set){
        System.out.println(set);
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            String check = itr.next();
            if(check.length() % 2 == 0){
                itr.remove();
            }
        }
        System.out.println(set);
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
