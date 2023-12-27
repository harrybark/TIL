package harryspring.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.assertj.core.api.Assertions.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Test
@interface UnitTest {

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@UnitTest
@interface FastUnitTest {

}

public class HelloServiceTest {

    @Test
    //@FastUnitTest
    public void helloServiceTest() throws Exception {
        // given
        SimpleHelloService helloService = new SimpleHelloService();

        // when
        String ret = helloService.sayHello("Test");
        // then
        assertThat(ret).isEqualTo("Hello Test");
    }

    @Test
    public void helloDecorator() throws Exception {
        // given
        HelloDecorator helloDecorator = new HelloDecorator(name -> name);

        // when
        String ret = helloDecorator.sayHello("Test");
        // then
        assertThat(ret).isEqualTo("* Test *");

    }
}
