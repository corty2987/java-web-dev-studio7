package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("CD", 200, "CD");
        DVD dvd = new DVD("DVD", 400, "DVD");


        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        cd.readData();
        dvd.spinDisc();
        dvd.readData();



    }
}
