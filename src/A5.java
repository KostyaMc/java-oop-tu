public class A5 {
    static int height(int min, int max){
        return (int)(Math.random() * (max - min) + 1) + min;
    }

    static int[] height_list(int children_num, int min, int max){
        int[] list_h = new int[children_num];

        for (int i=0; i < list_h.length; i++){
            list_h[i] = height(min, max);
        }
        return list_h;
    }

    static double harmonicMin(int[] list){
        double sumOfReciprocals = 0.0;
        for (int value: list){
            sumOfReciprocals += 1.0 / value;
        }
        return list.length / sumOfReciprocals;
    }

    public static void main(String[] args){
        int[] small_ch = height_list(10, 60, 100);
        int[] average_ch = height_list(15, 101, 140);
        int[] big_ch = height_list(20, 141, 200);

        for (int i=0; i < small_ch.length; i++){
            System.out.println(small_ch[i]);
        }
        System.out.println();

        for (int i=0; i < average_ch.length; i++){
            System.out.println(average_ch[i]);
        }
        System.out.println();

        for (int elem: big_ch){
            System.out.println(elem);
        }
        System.out.println();

        for (int i=0; i < small_ch.length; i++){
            if (small_ch[i] > 80) {
                System.out.println(small_ch[i]);
            }
        }
        double harmonic = harmonicMin(big_ch);
        System.out.println(harmonic);
    }
}
