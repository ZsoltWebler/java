package orb.webler.zsolr;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello world!");

        Counter counter = new Counter();
        for(int i = 0; i<3;i++){
            JavaSzal szal = new JavaSzal(i+"#", counter);
            szal.start();
        }

        new Thread(new MasikJavaSzal()).start();






    }
}