package com.cejv416.multiclass;

/**
 * Example of using multiple classes
 */
public class MultipleClassApp {

    private Input in = null;
    private Process pro = null;
    private Output out = null;
    private ReversingStringData rsd = null;

    /**
     * Default Constructor Initializes all instance objects
     */
    public MultipleClassApp() {
        // Instantiate the objects that this class will use
        rsd = new ReversingStringData();
        in = new Input();
        pro = new Process();
        out = new Output();
    }

    /**
     * Send message to the objects to perform the task of reversing a string
     */
    public void perform() {
        // Get input
        in.requestStringFromUser(rsd);
        // Process the data
        pro.reverse(rsd);
        // Display the result
        out.display(rsd);
    }

    /**
     * Where it begins
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MultipleClassApp mca = new MultipleClassApp();
        mca.perform();
        System.exit(0);
    }
}
