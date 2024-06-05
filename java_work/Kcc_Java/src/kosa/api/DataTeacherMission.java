package kosa.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DataTeacherMission {

   public static void main(String[] args) {
      //�Ի��Ͽ��� ���ñ��� ���� �Ⱓ�� ���Դ���.
         
      String pattern="yyyy/MM/dd";
      DateFormat df = new SimpleDateFormat(pattern);
      
      Scanner sc = new Scanner(System.in);
      System.out.print("�Է�: ");
      Date inDate=null;
         
      while(sc.hasNextLine()) {
         try {
            inDate=df.parse(sc.nextLine());
            break;
         } catch (Exception e) {
            System.out.println("�ٽ� �Է�");
         }
      }
      Calendar cal = Calendar.getInstance(); //�Ի���
      cal.setTime(inDate);//2014������ �� >> �Ի���
      Calendar today = Calendar.getInstance(); //���ó�¥
      
      long day = (today.getTimeInMillis() - cal.getTimeInMillis())/(24*60*60*1000); 
      // 24�ð� 60�� 60��
      System.out.println(day);
      //�����Ⱓ�� ����
      
      int year = (int)(day/365);
      int month = (int)(day/365)%12; //��������ϱ�
      
      System.out.println("�����Ⱓ: "+year+"�� "+month+"����");
      
      
   }//end

}