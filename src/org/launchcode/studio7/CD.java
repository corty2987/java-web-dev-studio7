package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String title, int storageCapacity, String discType) {
        super(title, storageCapacity, discType);

    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at the rate of 200 rpm");
    }

    @Override
    public void readData() {
        System.out.println("Pick a song!");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
