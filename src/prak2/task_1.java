package prak2;

public class task_1 {
    static int[] concatenation(int[] masiiv1, int[] masiiv2){
        int[] new_masiiv = new int[masiiv1.length + masiiv2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < masiiv1.length && j < masiiv2.length){
            if (masiiv1[i] < masiiv2[j]){
                new_masiiv[k] = masiiv1[i];
                i++;
            }
            else{
                new_masiiv[k] = masiiv2[j];
                j++;
            }
            k++;
        }
        while (i < masiiv1.length){
            new_masiiv[k++] = masiiv1[i++];
        }
        while (j < masiiv2.length){
            new_masiiv[k++] = masiiv2[j++];
        }

        return new_masiiv;
    }
    
    static int[] turning_over(int[] masiiv){
        int[] new_masiiv = new int[masiiv.length];
        int k = 0;

        for (int i = masiiv.length-1; i > 0; i--) {
            new_masiiv[k] = masiiv[i];
            k++;
        }
        
        return  new_masiiv;
    }

    public static void main(String[] args){
        int[] masiiv1 = {-10, 17, 21};
        int[] masiiv2 = {-2, 5, 17, 28};

        int[] new_masiiv = concatenation(masiiv1, masiiv2);

        for (int i = 0; i < new_masiiv.length; i++) {
            System.out.print(new_masiiv[i] + " ");
        }
        System.out.println();
        
        int[] masiiv3 = {0, 1, 2, 3, -1};

        int[] new_masiiv2 = turning_over(masiiv3);
        for (int i = 0; i < new_masiiv2.length; i++) {
            System.out.print(new_masiiv2[i] + " ");
        }
    }
}
