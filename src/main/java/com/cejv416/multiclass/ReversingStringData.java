package com.cejv416.multiclass;

/**
 * Data class
 */
public class ReversingStringData {

    private String originalString;
    private String reverseString;

    /**
     * Default Constructor initializes the variable to an empty string
     */
    public ReversingStringData() {
        originalString = "";
        reverseString = "";
    }

    public String getOriginalString() {
        return originalString;
    }

    public void setOriginalString(String originalString) {
        this.originalString = originalString;
    }

    public String getReverseString() {
        return reverseString;
    }

    public void setReverseString(String reverseString) {
        this.reverseString = reverseString;
    }
}
