package org.ling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EventBus {
    private final List<Listener> listeners = Collections.synchronizedList(new ArrayList<>());

    public void register(Listener listener) {
        listeners.add(listener);
    }

    public void post(Event event) {
        for (Listener listener : listeners) {
            event.dispatch(listener);
        }
    }
}
