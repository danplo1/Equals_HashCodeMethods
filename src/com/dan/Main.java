package com.dan;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Daniel_D'AGE on 03.02.2019.
 */
public class Main {
    public static void main(String[] args) {

        Map<Person, String> citiesPerPerson = new HashMap<>();

        Person tomek = new Person("Tomek", 35);
        Person rafal = new Person("Rafał", 32);
        Person agata = new Person("Agata", 28);


        citiesPerPerson.put(tomek, "Wrocław");
        citiesPerPerson.put(rafal, "Lublin");
        citiesPerPerson.put(agata, "Gdynia");


        System.out.println(citiesPerPerson.get(tomek) + " " + citiesPerPerson.get(rafal) + " "
                + citiesPerPerson.get(agata));

      

    }
}
