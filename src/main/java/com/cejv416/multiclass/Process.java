package com.cejv416.multiclass;

/**
 * Class that performs the processing of data
 */
public class Process {

    /**
     * Reverse the parameter and store it the reverseString instance variable
     *
     * @param rsd
     */
    public void reverse(ReversingStringData rsd) {
        StringBuilder sb = new StringBuilder(rsd.getOriginalString());
        sb.reverse();
        rsd.setReverseString(sb.toString());
    }
}
