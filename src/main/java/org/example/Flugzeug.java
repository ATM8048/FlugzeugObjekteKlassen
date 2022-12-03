package org.example;



public class Flugzeug {
    private String model;
    private double geschwindigkeit;
    private double laenge;

    public Flugzeug(String model, double geschwindigkeit, double laenge) {
        this.model = model;
        this.geschwindigkeit = geschwindigkeit;
        this.laenge = laenge;
    }
    public Flugzeug(){
        model = "Boaing 747";
        geschwindigkeit = 917;
        this.laenge = 76.3;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public int getLaenge() {
        return (int) laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge= laenge;
    }

    @Override
    public String toString() {
        return "Flugzeug" +
                "model='" + model + '\'' +
                ", geschwindigkeit=" + geschwindigkeit +
                ", länge=" + laenge +
                '}';
    }
}
