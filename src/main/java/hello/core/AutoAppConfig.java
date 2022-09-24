package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //우리는 현재 config피일이2개있다.
        //Appconfig의 충돌 방지를 위해서 해당 filter를 사용했다
)
public class AutoAppConfig {

    /*
    @Bean(name="memberMemberRepository")
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    */

}
