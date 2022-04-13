package co.com.ajac.infrastructure.events;

import co.com.ajac.base.events.Event;
import co.com.ajac.base.events.Publisher;
import io.vavr.collection.List;

public class EventPublisher implements Publisher {
    @Override
    public List<Event> publish(List<Event> list) {
        return list;
    }
}
