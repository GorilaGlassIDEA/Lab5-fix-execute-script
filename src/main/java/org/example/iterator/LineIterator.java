package org.example.iterator;

import java.util.Iterator;

class LineIterator implements Iterator<String> {
    private String[] textArr;
    private int count = 0;

    public LineIterator(String allLines) {
        if (allLines != null) {
            textArr = allLines.split("\n");
            //разбиваем текст по знакам перехода строки
        } else {
            textArr = new String[0];
        }
    }

    @Override
    public boolean hasNext() {
        return count < textArr.length;
    }

    @Override
    public String next() {
        String thisLine = textArr[count];
        count++;
        return thisLine;
    }
}
