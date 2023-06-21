//q11
import javax.swing.*;
import java.awt.*;

public class main4{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Threaded Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTextArea textArea1 = new JTextArea();
        textArea1.setEditable(false);

        JTextArea textArea2 = new JTextArea();
        textArea2.setEditable(false);

        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(new JScrollPane(textArea1));
        panel.add(new JScrollPane(textArea2));

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    textArea1.append(i + "\n");
                    try {
                        Thread.sleep(1000); // Sleep for 1 second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    textArea2.append((i*i) + "\n");
                    try {
                        Thread.sleep(1000); // Sleep for 1 second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
