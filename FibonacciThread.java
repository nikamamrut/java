//q17
public class FibonacciThread extends Thread {
    private int n;
    private int result;

    public FibonacciThread(int n) {
        this.n = n;
    }

    public int getResult() {
        return result;
    }

    @Override
    public void run() {
        if (n <= 1) {
            result = n;
        } else {
            FibonacciThread t1 = new FibonacciThread(n - 1);
            FibonacciThread t2 = new FibonacciThread(n - 2);

            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            result = t1.getResult() + t2.getResult();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            FibonacciThread t = new FibonacciThread(i);
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Fibonacci(" + i + ") = " + t.getResult());
        }
    }
}
