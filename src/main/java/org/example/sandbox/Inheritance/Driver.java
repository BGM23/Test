package org.example.sandbox.Inheritance;

public class Driver {

    public static void main(String[] args) {

        Jeep jeep = new Jeep();

        jeep.setGasMileage(12.0);
        Wrangler.setGasMileage(13.0);

        System.out.println(jeep.getGasMileage());

        System.out.println(Wrangler.getGasMileage());


    }
}
