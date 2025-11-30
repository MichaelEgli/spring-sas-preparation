package ch.eglim.spring.jms;

import jakarta.jms.JMSException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.utility.DockerImageName;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
public class TestContainersActiveMqTests {

    @Container
    public static GenericContainer<?> activeMqContainer
            = new GenericContainer<>(DockerImageName.parse("rmohr/activemq:5.14.3")).withExposedPorts(61616);

    @Test
    public void test() throws JMSException {
    }
}