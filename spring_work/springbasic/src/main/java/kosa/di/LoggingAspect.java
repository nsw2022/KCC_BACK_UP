package kosa.di;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

//공통관심사항
public class LoggingAspect {
   //핵심관심사항(insertService()) => 공통관심사항 함께호출(핵심관심메서드 호출 시간을 측정)
   //타이머 생성 -> 타이머 작동 -> 실제 메서드 호출 -> 타이머 종료 -> 로그 출력
   private Log log = LogFactory.getLog(getClass());
   
   //공통관심 메서드
   //언제 호출(advice : around)
   public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
      log.info("로그시작");
      StopWatch stopWatch = new StopWatch();
      
      try {
         stopWatch.start();
         
         Object obj = joinPoint.proceed();
         return obj;
      } catch (Exception e) {
         throw e;
      } finally {
         stopWatch.stop();
         log.info(joinPoint.getSignature().getName()+ "메서드 실행시"
         + stopWatch.getTotalTimeMillis());
      }
   }

}





//package kosa.di;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.springframework.util.StopWatch;
//
////공통관심사항
//public class LoggingAspect {
//	//핵심관심사항(insertService()) => 공통관심사항 함께호출(핵심관심메서드 호출 시간을 측정)
//	//타이머 생성 -> 타이머 작동 -> 실제 메소드 호출 -> 타이머 종료 -> 로그 출력
//	
//	private Log log = LogFactory.getLog(getClass());
//	
//	//공통관심 메서드
//	//언제 호출(advice : around)
//	public Object logging(ProceedingJoinPoint joinPoint) throws Throwable{
//		log.info("로그뿅");
//		StopWatch stopWatch = new StopWatch();
//		
//		try {
//			//타이머작동
//			stopWatch.start();
//			
//			//실제 메소드 호출
//			Object obj= joinPoint.proceed(); //insertService() 호출되는 것과 같음 (공통관심사항)
//		} catch (Exception e) {
//			throw e;
//		}finally {
//			stopWatch.start();
//			log.info(joinPoint.getSignature().getName()+ "메서드 실행시 : " + stopWatch.getTotalTimeMillis());
//		}
//	}
//}
