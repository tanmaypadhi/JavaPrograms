import java.util.ArrayList;
import java.util.List;

/*
 * Find out the common elements in two Array List.
 */

public class CommonElementsInArrayList {

    public static void findCommonElements(){
        ArrayList<Integer> listA = new ArrayList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.add(3);

        ArrayList<Integer> listB = new ArrayList<Integer>();
        listB.add(2);
        listB.add(3);
        listB.add(4);

        System.out.println("listA :" + listA);
        System.out.println("listB :" + listB);

        //ArrayList<Integer> listC = new ArrayList<Integer>(listB);
        listB.retainAll(listA);
        System.out.println("Common Elements are  - listB :" + listB);

    }

    public static void main (String args[]){
        findCommonElements();
    }
}
