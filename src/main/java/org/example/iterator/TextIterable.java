package org.example.iterator;

import java.util.Iterator;

public class TextIterable implements Iterable<String> {
    private LineIterator iterator;

    public TextIterable(String text) {
        if (text != null) {
            text = text.strip();
            iterator = new LineIterator(text);

        }
    }

    @Override
    public Iterator<String> iterator() {
        return iterator;
    }
}