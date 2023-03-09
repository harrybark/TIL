package me.harry.designpatterns.designpatterns.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RealUsageCase {

    public static void main(String[] args) {

        // Application Runtime Environment
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());

        // Spring Usage Sample
        // String은 싱글톤이 아니지만, 유일한 객체가 필요한 경우에는 싱글톤 Scope 내로 Bean을 생성해 사용하는 방법
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        String res1 = applicationContext.getBean("test", String.class);
        String res2 = applicationContext.getBean("test", String.class);
        System.out.println(res1 == res2);

        // 빌더, 퍼사드, 추상 팩토리 등 다른 디자인 패턴에 참조로 쓰이기도 한다.
    }
}
