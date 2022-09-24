package hello.core.scan.Filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) //type은 클래스 레벨에 적용된다
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}
