package _12_LiskovAndOCP_EX._01_Logger;

import _12_LiskovAndOCP_EX._01_Logger.implementations.Controller;

public class Main {
    public static void main(String[] args) {
        Runnable suckMe = new Controller();
        suckMe.run();
    }
}
