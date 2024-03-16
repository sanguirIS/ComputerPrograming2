public class ISThreads implements Runnable {

    private String name; // Thread name

    public ISThreads(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is " + Thread.currentThread().getState()); // Get state of current thread
        try {
            Thread.sleep(500); // Sleep for half a second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name your first thread: ");
        String thread1Name = scanner.nextLine();

        System.out.print("Name your second thread: ");
        String thread2Name = scanner.nextLine();

        System.out.print("Name your third thread: ");
        String thread3Name = scanner.nextLine();

        // Create and display initial states
        ISThreads thread1 = new ISThreads(thread1Name);
        ISThreads thread2 = new ISThreads(thread2Name);
        ISThreads thread3 = new ISThreads(thread3Name);

        System.out.println(thread1.name + " is " + thread1.getState());
        System.out.println(thread2.name + " is " + thread2.getState());
        System.out.println(thread3.name + " is " + thread3.getState());

        // Start the threads
        System.out.println("\nStarting the threads...");
        thread1.start();
        thread2.start();
        thread3.start();

        // Display states after sleep
        System.out.println("\nAfter sleep...");
        System.out.println(thread1.name + " is " + thread1.getState());
        System.out.println(thread2.name + " is " + thread2.getState());
        System.out.println(thread3.name + " is " + thread3.getState());
    }

    // Your name and last name here (ISThreads.java line 42)
}