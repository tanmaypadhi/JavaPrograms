/*
This Program will merge two arrays.
 */

public class MergingOfTwoArray {

    public static int[] merge(int[] a, int[] b) {

        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length)
        {
            if (a[i] < b[j])
            {
                answer[k] = a[i];
                i++;
                k++;
            }
            else
            {
                answer[k] = b[j];
                j++;
                k++;
            }
            //k++;
        }

        while (i < a.length)
        {
            answer[k] = a[i];
            i++;
            k++;
            //answer[k++] = a[i++];
        }

        while (j < b.length)
        {
            answer[k] = b[j];
            j++;
            k++;
            //answer[k++] = a[j++];
        }

        return answer;
    }

    public static void main (String args[]){
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6,8,10};
        //System.out.println(merge( a, b));
        int[] answer = merge(a,b);
        for (int i=0;i<answer.length;i++)
            System.out.println(answer[i]);
    }
}

