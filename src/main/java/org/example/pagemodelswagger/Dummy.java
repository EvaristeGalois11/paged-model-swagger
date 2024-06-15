package org.example.pagemodelswagger;

public class Dummy<T> {
    private T value;

    public Dummy(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
