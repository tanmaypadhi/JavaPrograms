import java.util.HashSet;

public class DupInAnArrayUsingHashSet {
    public static void main (String args[]){
        int[] ArraryA = {1,1,2,2,4,5,6,7,7,7,8,8,9,9};
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i=0; i < ArraryA.length; i++){
            boolean unique = hashSet.add(ArraryA[i]);
            if (unique == false)
                System.out.println("Duplicate Element is:" + ArraryA[i]);
        }

    }

}
