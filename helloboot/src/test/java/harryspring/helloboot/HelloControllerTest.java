package harryspring.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class HelloControllerTest {

    @Test
    public void helloControllerTest() throws Exception {
        // given
        HelloController helloController = new HelloController(name -> name );
        // when
        String ret = helloController.hello("Test");
        // then
        assertThat(ret).isEqualTo("Test");
    }

    @Test
    public void failHelloController() throws Exception {
        // given
        HelloController helloController = new HelloController(name -> name );

        assertThatThrownBy(() -> {
            String ret = helloController.hello(null);
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> {
            String ret = helloController.hello("");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
