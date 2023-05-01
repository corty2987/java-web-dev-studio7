package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD (String title, int storageCapacity, String discType) {
        super(title, storageCapacity, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at the rate of 400 rpm");
    }

    @Override
    public void readData() {
        System.out.println("MENU");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}