package org.example.sandbox.Inheritance;

import java.awt.*;

public class Jeep {

    private Color color;
    protected Double gasMileage;
    private Double towingCapacity;

    public Double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(Double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public Double getGasMileage() {
        return gasMileage;
    }

    public void setGasMileage(Double gasMileage) {
        this.gasMileage = gasMileage;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
