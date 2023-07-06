package orb.webler.zsolr;

public class JavaSzal extends Thread {

    String name;
    Counter counter;

    public JavaSzal(String name, Counter c){
        this.name = name;
        this.counter = c;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i + " - " + counter.increment());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
