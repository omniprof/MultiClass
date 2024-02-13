package com.cejv416.multiclass;

import java.util.Scanner;

/**
 * Class to get input from the end user
 */
public class Input {

    private Scanner sc = null;

    /**
     * Default Constructor Initializes the Scanner object
     */
    public Input() {
        sc = new Scanner(System.in);
    }

    /**
     * Request console input of a string
     * @param rsd
     */
    public void requestStringFromUser(ReversingStringData rsd) {
        System.out.print("Please enter a string: ");
        rsd.setOriginalString(sc.nextLine());
    }
}
