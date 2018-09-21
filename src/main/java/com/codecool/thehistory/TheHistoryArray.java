package com.codecool.thehistory;

import java.util.Arrays;

public class TheHistoryArray implements TheHistory {

    /**
     * This implementation should use a String array so don't change that!
     */
    private String[] wordsArray = new String[0];

    @Override
    public void add(String text) {
        String parts[] = text.split(" ");
        int a = parts.length;
        wordsArray = Arrays.copyOf(parts, a);
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        int newLength = wordsArray.length;
        for (int i=0; i < wordsArray.length; i++) {
            if (wordsArray[i].contains(wordToBeRemoved)){
                newLength--;
            }
        }
        String[] result = new String[newLength];
        int count=0;
        for (int i=0; i < wordsArray.length; i++) {
            if (!wordsArray[i].contains(wordToBeRemoved)) {
                result[count] = wordsArray[i];
                count++;
            }
        }

    }

    @Override
    public int size() {
        return wordsArray.length;
    }

    @Override
    public void clear() {
        wordsArray = new String[0];
    }

    @Override
    public void replaceOneWord(String from, String to) {
        for (int i=0; i < wordsArray.length; i++) {
            if (wordsArray[i].contains(from)) {
                wordsArray[i] = to;
            }
        }
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArray) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }
}
