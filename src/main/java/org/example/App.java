package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 *Klasse: Flugzeug
 *Author: Martin Atanasov
 * Version: 1.0
 */
public class App {
    public static void main(String[] args) {
    System.out.println("Meine Flugzeuge");


    Flugzeug myFirstFlugzeug = new Flugzeug("Sauders Roe",579.00, 45.1);
    System.out.println(myFirstFlugzeug);

    Flugzeug mySecondFlugZeug = new Flugzeug();

    System.out.println(mySecondFlugZeug);

    List<Flugzeug> myFlugzeug = new ArrayList<>();
    myFlugzeug.add(myFirstFlugzeug);
    myFlugzeug.add(mySecondFlugZeug);

    System.out.println(myFlugzeug);
    }
}

