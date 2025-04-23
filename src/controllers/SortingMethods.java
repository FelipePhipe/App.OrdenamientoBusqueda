package controllers;

import models.Person;

public class SortingMethods {


    public void sortByNameWithBubbleAsc(Person[] persons) {
        boolean swapped;
        for (int i = 0; i < persons.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j] != null && persons[j + 1] != null && 
                    persons[j].getName().compareToIgnoreCase(persons[j + 1].getName()) > 0) {
                    
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped==false) break;
        }
    }


    public void sortByNameWithBubbleDesc(Person[] persons) {
        boolean swapped;
        for (int i = 0; i < persons.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j] != null && persons[j + 1] != null && 
                    persons[j].getName().compareToIgnoreCase(persons[j + 1].getName()) < 0) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped==false) break;
        }
    }

    public void sortByAgeWithBubbleAsc(Person[] persons) {
        boolean swapped;
        for (int i = 0; i < persons.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j] != null && persons[j + 1] != null && 
                    persons[j].getAge() > persons[j + 1].getAge()) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped==false) break;
        }
    }

public void sortByAgeWithBubbleDesc(Person[] persons) {
    boolean swapped;
    for (int i = 0; i < persons.length - 1; i++) {
        swapped = false;
        for (int j = 0; j < persons.length - 1 - i; j++) {
            if (persons[j] != null && persons[j + 1] != null && 
                persons[j].getAge() < persons[j + 1].getAge()) {
                
                Person temp = persons[j];
                persons[j] = persons[j + 1];
                persons[j + 1] = temp;
                swapped = true;
            }
        }

        if (swapped==false) break;
    }
}


public void sortByNameWithSelectionAsc(Person[] persons) {
    for (int i = 0; i < persons.length - 1; i++) {
        int minInd = i;
        for (int j = i + 1; j < persons.length; j++) {
            if (persons[j] != null && persons[minInd] != null && 
                persons[j].getName().compareTo(persons[minInd].getName()) < 0) {
                minInd = j;
            }
        }
        Person temp = persons[i];
        persons[i] = persons[minInd];
        persons[minInd] = temp;
    }
}


public void sortByNameWithSelectionDesc(Person[] persons) {
    for (int i = 0; i < persons.length - 1; i++) {
        int maxInd = i;
        for (int j = i + 1; j < persons.length; j++) {
            if (persons[j] != null && persons[maxInd] != null && 
                persons[j].getName().compareTo(persons[maxInd].getName()) > 0) {
                maxInd = j;
            }
        }
        Person temp = persons[i];
        persons[i] = persons[maxInd];
        persons[maxInd] = temp;
    }
}


public void sortByAgeWithSelectionAsc(Person[] persons) {
    for (int i = 0; i < persons.length - 1; i++) {
        int minInd = i;
        for (int j = i + 1; j < persons.length; j++) {
            if (persons[j] != null && persons[minInd] != null && 
                persons[j].getAge() < persons[minInd].getAge()) {
                minInd = j;
            }
        }
        Person temp = persons[i];
        persons[i] = persons[minInd];
        persons[minInd] = temp;
    }
}


public void sortByAgeWithSelectionDesc(Person[] persons) {
    for (int i = 0; i < persons.length - 1; i++) {
        int maxInd = i;
        for (int j = i + 1; j < persons.length; j++) {
            if (persons[j] != null && persons[maxInd] != null && 
                persons[j].getAge() > persons[maxInd].getAge()) {
                maxInd = j;
            }
        }
        Person temp = persons[i];
        persons[i] = persons[maxInd];
        persons[maxInd] = temp;
    }
}


public void sortByNameWithInsertionAsc(Person[] persons) {
    for (int i = 1; i < persons.length; i++) {
        Person key = persons[i];
        if (key == null) continue;
        int j = i - 1;
        while (j >= 0 && persons[j] != null && 
               persons[j].getName().compareTo(key.getName()) > 0) {
            persons[j + 1] = persons[j];
            j--;
        }
        persons[j + 1] = key;
    }
}


public void sortByNameWithInsertionDesc(Person[] persons) {
    for (int i = 1; i < persons.length; i++) {
        Person key = persons[i];
        if (key == null) continue;
        int j = i - 1;
        while (j >= 0 && persons[j] != null && 
               persons[j].getName().compareTo(key.getName()) < 0) {
            persons[j + 1] = persons[j];
            j--;
        }
        persons[j + 1] = key;
    }
}


public void sortByAgeWithInsertionAsc(Person[] persons) {
    for (int i = 1; i < persons.length; i++) {
        Person key = persons[i];
        if (key == null) continue;
        int j = i - 1;
        while (j >= 0 && persons[j] != null && 
               persons[j].getAge() > key.getAge()) {
            persons[j + 1] = persons[j];
            j--;
        }
        persons[j + 1] = key;
    }
}


public void sortByAgeWithInsertionDesc(Person[] persons) {
    for (int i = 1; i < persons.length; i++) {
        Person key = persons[i];
        if (key == null) continue;
        int j = i - 1;
        while (j >= 0 && persons[j] != null && 
               persons[j].getAge() < key.getAge()) {
            persons[j + 1] = persons[j];
            j--;
        }
        persons[j + 1] = key;
    }
}
    
}
