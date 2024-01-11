package other.reverseNumber;

public class ReverseNumber {

    public void reverseNumber(int N_arg) {
        int N = N_arg;
        boolean enable_print = false;

        while (N > 0) {
            if (!enable_print && N % 10 != 0) {
                enable_print = true;
            }
            if (enable_print) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }
}
