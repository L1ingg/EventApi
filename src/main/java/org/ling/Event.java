package org.ling;

public interface Event {
    void dispatch(Listener listener);
}
