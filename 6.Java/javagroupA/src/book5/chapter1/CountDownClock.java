package book5.chapter1;

//public class CountDownClock extends Thread {
//    public void run() {
//        for (int t = 20; t >= 0; t--) {
//            System.out.println("T minus " + t);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//            }
//        }
//    }
//}

//class CountDownClock
//        implements TimeMonitor {
//    private int t;
//
//    public CountDownClock(int start) {
//        {
//            this.t = start;
//        }
//
//
//        public static void main (String[]args)
//        {
//            Thread clock = new CountDownClock();
//            clock.start();
//        }
//        public void run () {
//            boolean aborted = false;
//            for (; t >= 0; t--) {
//                System.out.println("T minus " + t);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    aborted = true;
//                }
//                if (Thread.interrupted())
//                    aborted = true;
//                if (aborted) {
//                    System.out.println(
//                            "Stopping the clock!");
//                    break;
//                }
//            }
//        }
//
//        public int getTime () {
//            return t;
//        }
//
//        public synchronized void abortCountDown () {
//            Thread[] threads =
//                    new Thread[Thread.activeCount()];
//            Thread.enumerate(threads);
//            for (Thread t : threads)
//                t.interrupt();
//        }
//    }
//}