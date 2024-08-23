package com.kcc.security1.oauth;

import com.kcc.security1.auth.PrincipalDetail;
import com.kcc.security1.model.User;
import com.kcc.security1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
public class PrincipalOauth2UserService extends DefaultOAuth2UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        //System.out.println("userRequest"+userRequest);
//        System.out.println("getRegistrationId()"+userRequest.getClientRegistration().getRegistrationId());
//        System.out.println();
//        System.out.println("getClientRegistation: " + userRequest.getClientRegistration());
//        System.out.println();
//        System.out.println("getAccessToken: " + userRequest.getAccessToken());
//        System.out.println();
//        System.out.println(super.loadUser(userRequest).getAttributes());
        OAuth2User oAuth2User = super.loadUser(userRequest);
        System.out.println("getAttributes" + oAuth2User.getAttributes());
        // 구글 로그인 버튼 클릭 -> 구글 ㄹ그인 창 -> 고글 로그인 필요  -> ACCESS TOKEN  요청
        // userRequest 정보 -> loadUser 함수호출 -> 구글로부터 프로필 추출 ->  회원 가입 OAuth2USer -> Authentication

        String provider = userRequest.getClientRegistration().getRegistrationId();//google
        String providerId = oAuth2User.getAttribute("sub");
        String username =provider + "_" + providerId;
        String email = oAuth2User.getAttribute("email");
        String role= "ROLE_USER";

        User userEntity = userRepository.findByUsername(username);
        if (userEntity == null) {
            // 회원가입
            userEntity =  User.builder()
                    .username(username)
                    .password("1234")
                    .email(email)
                    .role(role)
                    .provider(provider)
                    .providerId(providerId)
                    .build();

            userRepository.save(userEntity);
        }

        return new PrincipalDetail(userEntity, oAuth2User.getAttributes());
    }
}
