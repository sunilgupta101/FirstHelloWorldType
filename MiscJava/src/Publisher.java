import java.util.ArrayList;
import java.util.Collection;

public class Publisher {

    private Collection<Subscriber> subscribers = new ArrayList<>();
    
    public void add(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void publish(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.receive(message);
        }
    }
}
