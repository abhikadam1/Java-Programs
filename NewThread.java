public class NewThread {
    public static void main1() {
        long startTime = System.nanoTime();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });
        t.start();
        long endTime = System.nanoTime();
        System.out.println("Time taken by thread to run: " + (endTime - startTime) + 
        " nanoseconds");
        try{
            t.sleep(1500); // Task takes 1.5 seconds

        }catch(Exception E){
            System.out.println("Exception caught "+ E.getMessage());

        }
        
        long durationNano = endTime - startTime;
        long durationMillis = durationNano / 1_000_000;

        System.out.println("Task completed in: " + durationNano + " nanoseconds");
        System.out.println("Task completed in: " + durationMillis + " milliseconds");
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        // Simulate a task
        try {
            Thread.sleep(1500); // Task takes 1.5 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        main1();
        long endTime = System.nanoTime();

        long durationNano = endTime - startTime;
        long durationMillis = durationNano / 1_000_000;

        System.out.println("Task completed in: " + durationNano + " nanoseconds");
        System.out.println("Task completed in: " + durationMillis + " milliseconds");
    
    }
}
