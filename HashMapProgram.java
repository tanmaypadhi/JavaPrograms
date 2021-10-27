import java.util.HashMap;
import java.util.Map;

/*Implementation of Hashmap and cloning of Hashmap which is nothing to copy a Hashmap into another Hashmap */

public class HashMapProgram {

    public static void main (String args[]){
        HashMap<Integer,String> HMap = new HashMap<Integer,String>();
        HashMap<Integer,String> HMap1 = new HashMap<Integer,String>();
        HMap.put(1, "one");
        HMap.put(2, "Two");
        HMap.put(3, "Three");
        HMap.put(4, "Four");
        HMap.put(5, "Five");

        HMap1 = (HashMap<Integer,String>) HMap.clone();

        //System.out.println(HMap.get(1));
        //System.out.println(HMap.size());
        for (Map.Entry<Integer, String> entry: HMap1.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println (key + " : " + value);
        }
    }

}



