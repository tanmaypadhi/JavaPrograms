public class pairs {

    public static void main(String[] args) {

        int[] a = {0, 1, -1, 2, 3, 2, 4, 5, 6, 1, 2};

        int n = 4;

        int arrSize = a.length;

        for (int i = 0; i < arrSize; i++) {

            for (int j = i+1; j < arrSize - 1; j++) {

                if (a[i] + a[j] == n) {

                    System.out.println("Pairs are: " + a[i] + "," + a[j]);


                }


            }

        }


    }
}

