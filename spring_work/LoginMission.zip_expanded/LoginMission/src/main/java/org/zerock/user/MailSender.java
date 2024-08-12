package org.zerock.user;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.mail.internet.MimeMessage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("")
@ResponseBody
public class MailSender {
	  

/*
    if(isUser != null) {//회원가입이 되어있는, 존재하는 사용자라면
        Random r = new Random();
        int num = r.nextInt(999999); //랜덤 난수 
        
        StringBuilder sb = new StringBuilder();
        
        // DB에 저장된 email            입력받은 email
        if(isUser.getM_email().equals(vo.getM_email())) {//이메일 정보 또한 동일하다면 
    
            String setFrom = "tmddn3410@naver.com";//발신자 이메일
            String tomail = isUser.getM_email();
            String title = "[TEKA] 비밀번호 변경 인증 이메일입니다.";
            sb.append(String.format("안녕하세요 %s님\n", isUser.getM_nickname()));
            sb.append(String.format("TEKA 비밀번호 찾기(변경) 인증번호는 %d입니다.", num));
            String content = sb.toString();
            
            try {
                MimeMessage msg = mailSender.createMimeMessage();
                MimeMessageHelper msgHelper = new MimeMessageHelper(msg, true, "utf-8");
                
                msgHelper.setFrom(setFrom);
                msgHelper.setTo(tomail);
                msgHelper.setSubject(title);
                msgHelper.setText(content);
                
                //메일 전송
                mailSender.send(msg);
                
            }catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }
            
            //성공적으로 메일을 보낸 경우
            map.put("status", true);
            map.put("num", num);
            map.put("m_idx", isUser.getM_idx());
            return map;
            
        }
    }
    */
}
