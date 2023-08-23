package me.kimseokyoung.springbootdeveloper.config.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties("jwt") // 자바 클래스에 properties 값을 가져와서 서용하는 annotation
public class JwtProperties {
    private String issuer;
    private String secretKey;
}
