package de.bytefish.fcmjava.client.utils;

public class OutParameter<E> {

    private E ref;

    public OutParameter() {
    }

    public E get() {
        return ref;
    }

    public void set(E e) {
        this.ref = e;
    }

    public String toString() {
        return ref.toString();
    }
}
