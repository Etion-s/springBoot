package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
        //AppConfig appConfig = new AppConfig();
        //MemberService memberService = appConfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);//Appconfig에 있는 설정 정보를 가지고 spring이 컨테이너에 연결하고 관리해준다
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);//appconfig의 이름과 동일해야한다

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("새멤버:"+member.getName());
        System.out.println("찾은멤버:"+findMember.getName());


    }
}
