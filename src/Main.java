import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <=10 ; i++) {
            System.out.printf("%d^%d=",2,i);
            for (int j = 0; j <=i; j++) {
                if (i==j) System.out.printf("%d = %d\n",2,((int) Math.pow(2,i)));
                else System.out.printf("%d*",2);

            }

        }
    }

}




