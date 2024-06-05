package kosa.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DataTeacherMission {

   public static void main(String[] args) {
      //입사일에서 오늘까지 얼마의 기간이 나왔는지.
         
      String pattern="yyyy/MM/dd";
      DateFormat df = new SimpleDateFormat(pattern);
      
      Scanner sc = new Scanner(System.in);
      System.out.print("입력: ");
      Date inDate=null;
         
      while(sc.hasNextLine()) {
         try {
            inDate=df.parse(sc.nextLine());
            break;
         } catch (Exception e) {
            System.out.println("다시 입력");
         }
      }
      Calendar cal = Calendar.getInstance(); //입사일
      cal.setTime(inDate);//2014년으로 감 >> 입사일
      Calendar today = Calendar.getInstance(); //오늘날짜
      
      long day = (today.getTimeInMillis() - cal.getTimeInMillis())/(24*60*60*1000); 
      // 24시간 60분 60초
      System.out.println(day);
      //재직기간을 구함
      
      int year = (int)(day/365);
      int month = (int)(day/365)%12; //내가계산하기
      
      System.out.println("재직기간: "+year+"년 "+month+"개월");
      
      
   }//end

}