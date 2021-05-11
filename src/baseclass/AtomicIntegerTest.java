package baseclass;

public class AtomicIntegerTest {


        private static final int THREADS_CONUT = 20;


        public static int count = 0;

        public static void increase(int finalI) {
            count++;
            System.out.println("count:"+count +";finalI"+finalI);
        }

        public static void main(String[] args) {
            System.out.println("start---");
            Thread[] threads = new Thread[THREADS_CONUT];
            System.out.println("new thread array---");
            for (int i = 0; i < THREADS_CONUT; i++) {
                //System.out.println("before new thread---");
                int finalI = i;
                threads[i] = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("new thread---finalI:"+finalI);
                        for (int j = 0; j < 10000; j++) {
                            increase(finalI);
                        }
                    }
                });
                threads[i].start();
            }

            while (Thread.activeCount() > 1) {
                Thread.yield();
            }
            System.out.println(count);
        }

}
