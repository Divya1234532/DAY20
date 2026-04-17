public class SingleThread {
    public static void main(String[] args) {
        //single threaded
        task1();
        //Scanner sc=new Scanner(System.in); Disadvantage of Single-Threading
        //int n=sc.nextInt();  the CPU remains idle during I/O operations (like scanning or waiting for input/output).
        task2();
    }
    static void task1()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("From Task1: "+i);
        }
    }
    static void task2()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("From Task2: "+i);
        }
    }
}
