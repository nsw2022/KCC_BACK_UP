package com.kcc.restfulservice.myresultfulservice.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;
    private Integer user_id;
    //@ManyToOne(fetch = FetchType.LAZY)/*
//          'User' 엔티티와의 지연 로딩(LAZY) 관계 설정. 이 설정은 'Post' 엔티티를 조회할 때마다 관련 'User' 엔티티를 즉시 로드하지 않음을 의미합니다.
//           필요한 경우에만 'User' 엔티티를 로드하게 됩니다. 이는 성능 최적화에 유리하며, 불필요한 쿼리 실행을 줄일 수 있습니다.
//     */
//    @JsonIgnore // JSON 직렬화 시 'User' 정보를 무시하여 결과 JSON에 포함되지 않도록 합니다. 이는 순환 참조를 방지하고, 응답 데이터의 크기를 줄이는 데 도움이 됩니다.
   // private User user;

}
