public class Test {

    static int cot = 6;

    static {
        cot += 9;
    }

    public static void main(String[] args) {
        System.out.println(cot);
    }

    static {
        cot /= 3;
    }

}
