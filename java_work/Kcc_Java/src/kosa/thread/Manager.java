package kosa.thread;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<String> list = new ArrayList<String>();//������(3��)

    //�����忡 ���� �߰�
    public synchronized void push(String threadName, String bread) {
        while (list.size() > 3) {
            try {
                System.out.println(threadName + " ������");
                this.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        list.add(bread);
        System.out.println(threadName + " : " + bread + " ����");
        this.notify();
    }

    //�����忡�� ���� ����
    public synchronized void pop(String threadName) {
        while (list.size() == 0) {
            try {
                System.out.println(threadName + " ������");
                this.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("������ ������: " + list.size());
        String bread = list.remove(list.size() - 1);
        System.out.println(threadName + " : " + bread + " ����");
        this.notify();
    }

}











