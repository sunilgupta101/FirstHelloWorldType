import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.jmock.Expectations;
import org.jmock.Mockery;

@RunWith(JMock.class)
public class PublisherTest {
    Mockery context = new JUnit4Mockery();
    
    @Test 
    public void oneSubscriberReceivesAMessage() {
        // set up
        final Subscriber subscriber = context.mock(Subscriber.class);

        Publisher publisher = new Publisher();
        publisher.add(subscriber);
        
        final String message = "message";

        Expectations e = new Expectations() {
            {
            oneOf (subscriber).receive(message);
            }
            };

        // expectations
        context.checking(e);

        // execute
        publisher.publish(message);
    }
}
