public class A1 {
    static int arvutegategevus(int a, int b){
        return a + b;
    }

    static int arvutegategevus(double a){
        return (int)(Math.pow(a, 2));
    }

    static void arvutegategevus(String a, int b){
        for (int i = 0; i < b; i++){
            System.out.println(a);
        }
    }

    public static void main(String[] args){
        int num = arvutegategevus(2, 2);
        System.out.println(num);
        int num2 = arvutegategevus(2);
        System.out.println(num2);
        arvutegategevus("koko", 3);
    }
}
