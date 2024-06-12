package kosa.thread;

public class Main {

    public static void main(String[] args) {
        Manager m = new Manager();

        Baker b1 = new Baker("±èÅ¹±¸", m);
        Baker b2 = new Baker("¹ÚÅ¹±¸", m);
        Baker b3 = new Baker("ÀÌÅ¹±¸", m);

        Customer c1 = new Customer("±è¼Òºñ", m);
        Customer c2 = new Customer("¹Ú¼Òºñ", m);
        Customer c3 = new Customer("Á¶¼Òºñ", m);

        b1.start();
        c1.start();

        b2.start();
        c2.start();

        b3.start();
        c3.start();

    }

}