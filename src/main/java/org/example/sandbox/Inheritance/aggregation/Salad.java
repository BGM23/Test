package org.example.sandbox.Inheritance.aggregation;

public class Salad {
    private String lettuce;
    private String tomatoes;
    private String peppers;
    private String croutons;

    public String getCroutons() {
        return croutons;
    }

    public void setCroutons(String croutons) {
        this.croutons = croutons;
    }

    public String getPeppers() {
        return peppers;
    }

    public void setPeppers(String peppers) {
        this.peppers = peppers;
    }

    public String getTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(String tomatoes) {
        this.tomatoes = tomatoes;
    }

    public String getLettuce() {
        return lettuce;
    }

    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }
}
