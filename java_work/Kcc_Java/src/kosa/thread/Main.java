package kosa.thread;

public class Main {

    public static void main(String[] args) {
        Manager m = new Manager();

        Baker b1 = new Baker("��Ź��", m);
        Baker b2 = new Baker("��Ź��", m);
        Baker b3 = new Baker("��Ź��", m);

        Customer c1 = new Customer("��Һ�", m);
        Customer c2 = new Customer("�ڼҺ�", m);
        Customer c3 = new Customer("���Һ�", m);

        b1.start();
        c1.start();

        b2.start();
        c2.start();

        b3.start();
        c3.start();

    }

}