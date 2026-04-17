class Sample extends Thread {
    String name;

    Sample(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(name + ":" + i);
        }
    }
}

public class ConcurrencyExample {
    public static void main(String[] args) {
        Sample s1 = new Sample("Task1");
        Sample s2 = new Sample("Task2");

        s1.start();
        s2.start();
    }
}
