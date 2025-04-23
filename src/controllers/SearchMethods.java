package controllers;

import models.Person;

public class SearchMethods {
    public Person binarySearchByAge(Person[] persons, int age) {
        int bajo = 0, alto = persons.length - 1;
        while (  bajo <= alto) {
            int central = ( bajo + alto) / 2;
            if (persons[central].getAge() == age) return persons[central];
            if (persons[central].getAge() < age) bajo = central + 1;
            else alto = central - 1;
        }
        return null;
    }

    public Person binarySearchByName(Person[] persons, String name) {
        int bajo = 0, alto = persons.length - 1;
        while (  bajo <= alto) {
            int central = ( bajo + alto) / 2;
            int cmp = persons[central].getName().compareTo(name);
            if (cmp == 0) return persons[central];
            if (cmp < 0) bajo = central + 1;
            else alto = central - 1;
        }
        return null;
    }

    public boolean isSortedByAge(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            if (persons[i].getAge() > persons[i + 1].getAge()) return false;
        }
        return true;
    }

    public boolean isSortedByName(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            if (persons[i].getName().compareTo(persons[i + 1].getName()) > 0) return false;
        }
        return true;
    }
}
