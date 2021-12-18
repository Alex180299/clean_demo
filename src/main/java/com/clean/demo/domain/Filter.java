package com.clean.demo.domain;

public class Filter {
    private final String compareText;

    public Filter(String compareText) {
        this.compareText = compareText;
    }

    public boolean isValid(String text) {
        return compareText.equals(text);
    }
}
