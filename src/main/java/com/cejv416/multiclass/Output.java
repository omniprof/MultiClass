package com.cejv416.multiclass;

/**
 * Class that outputs the result
 */
public class Output {

    /**
     * Show the original string and the reversed version of the string
     *
     * @param rsd
     */
    public void display(ReversingStringData rsd) {
        System.out.println("The string '" + rsd.getOriginalString() + "'");
        System.out.println("when reversed becomes '" + rsd.getReverseString() + "'");
    }
}
