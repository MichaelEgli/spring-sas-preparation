package ch.eglim.spring.jms;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.TextMessage;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.jms.core.JmsTemplate;
import org.testcontainers.activemq.ActiveMQContainer;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.utility.DockerImageName;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
public class TestContainersActiveMqTests {

/*    private final static Logger LOGGER = LoggerFactory.getLogger(TestContainersActiveMqTests.class);
    private static final int ACTIVEMQ_PORT = 61616;
    private static final String TCP_FORMAT = "tcp://%s:%d";
    private static final String BROKER_URL_FORMAT = "activemq.broker-url=%s";

    @Container
    public static GenericContainer<?> activeMqContainer
            = new GenericContainer<>(DockerImageName.parse("rmohr/activemq:5.14.3")).withExposedPorts(ACTIVEMQ_PORT);*/

    @Autowired
    private MessageSender messageSender;

    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    private ActiveMQContainer activemqContainer;

    @Test
    public void whenSendingMessage_thenCorrectQueueAndMessageText() throws JMSException {

        String brokerUrl = activemqContainer.getBrokerUrl();
        System.out.println("brokerUrl: " + brokerUrl);


        String queueName = "queue-2";
        String messageText = "Hallo vom Sender";

        messageSender.sendTextMessage(queueName, messageText);

        Message sentMessage = jmsTemplate.receive(queueName);
        Assertions.assertThat(sentMessage).isInstanceOf(TextMessage.class);

        assertEquals(messageText, ((TextMessage) sentMessage).getText());

    }
}