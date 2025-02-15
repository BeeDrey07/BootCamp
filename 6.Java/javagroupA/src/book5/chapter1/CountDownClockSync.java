package book5.chapter1;

class CountDownClockSync extends Thread {
    private int start;

    public CountDownClockSync(int start) {
        this.start = start;
    }

    synchronized public void run() {
        for (int t = start; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}