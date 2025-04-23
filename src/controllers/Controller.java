package controllers;

import models.Person;
import views.View;

public class Controller {
    private View view;
    private Person[] persons = new Person[10];
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;
    private int count = 0;

    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
    }

    public void start() {
        int option;
        do {
            option = view.showMenu();
            switch (option) {
                case 1: addPersons(); break;
                case 2: sortPersons(); break;
                case 3: searchPerson(); break;
            }
        } while (option != 4);
    }

    public void inputPersons() {
        persons[count++] = view.inputPerson();
    }

    public void addPersons() {
        inputPersons();
    }

    public void sortPersons() {
        int method = view.selectionSortingMethod();
        int criterioOr = view.selectionSortCriterion(); // Mover fuera del switch
    
        switch (method) {
            case 1: {
                switch (criterioOr) {
                    case 1: {
                        int criterio = view.selectionSortCriterion2();
                        switch (criterio) {
                            case 1:
                                sortingMethods.sortByNameWithBubbleAsc(persons);
                                break;
                            case 2:
                                sortingMethods.sortByNameWithBubbleDesc(persons);
                                break;
                            default:
                                System.out.println("Opción inválida");
                                return;
                        }
                        break;
                    }
                    case 2: {
                        int criterio = view.selectionSortCriterion2();
                        switch (criterio) {
                            case 1:
                                sortingMethods.sortByAgeWithBubbleAsc(persons);
                                break;
                            case 2:
                                sortingMethods.sortByAgeWithBubbleDesc(persons);
                                break;
                            default:
                                System.out.println("Opción inválida");
                                return;
                        }
                        break;
                    }
                    default:
                        System.out.println("Opción inválida");
                        return;
                }
                break;
            }
            case 2: {
                switch (criterioOr) {
                    case 1: {
                        int criterio = view.selectionSortCriterion2();
                        switch (criterio) {
                            case 1:
                                sortingMethods.sortByNameWithInsertionAsc(persons);
                                break;
                            case 2:
                                sortingMethods.sortByNameWithInsertionDesc(persons);
                                break;
                            default:
                                System.out.println("Opción inválida");
                                return;
                        }
                        break;
                    }
                    case 2: {
                        int criterio = view.selectionSortCriterion2();
                        switch (criterio) {
                            case 1:
                                sortingMethods.sortByAgeWithInsertionAsc(persons);
                                break;
                            case 2:
                                sortingMethods.sortByAgeWithInsertionDesc(persons);
                                break;
                            default:
                                System.out.println("Opción inválida");
                                return;
                        }
                        break;
                    }
                    default:
                        System.out.println("Opción inválida");
                        return;
                }
                break;
            }
            case 3: {
                switch (criterioOr) {
                    case 1: {
                        int criterio = view.selectionSortCriterion2();
                        switch (criterio) {
                            case 1:
                                sortingMethods.sortByNameWithSelectionAsc(persons);
                                break;
                            case 2:
                                sortingMethods.sortByNameWithSelectionDesc(persons);
                                break;
                            default:
                                System.out.println("Opción inválida");
                                return;
                        }
                        break;
                    }
                    case 2: {
                        int criterio = view.selectionSortCriterion2();
                        switch (criterio) {
                            case 1:
                                sortingMethods.sortByAgeWithSelectionAsc(persons);
                                break;
                            case 2:
                                sortingMethods.sortByAgeWithSelectionDesc(persons);
                                break;
                            default:
                                System.out.println("Opción inválida");
                                return;
                        }
                        break;
                    }
                    default:
                        System.out.println("Opción inválida");
                        return;
                }
                break;
            }
            default:
                System.out.println("Opción inválida");
                return;
        }
        view.displayPersons(persons);
    }

    

    public void searchPerson() {
        int criterion = view.selectionSearchCriterion();
        Person result = null;
        if (criterion == 1 && searchMethods.isSortedByName(persons)) {
            String name = view.inputName();
            result = searchMethods.binarySearchByName(persons, name);
        } else if (criterion == 2 && searchMethods.isSortedByAge(persons)) {
            int age = view.inputAge();
            result = searchMethods.binarySearchByAge(persons, age);
        } else {
            System.out.println("Criterio no valido.");
        }
        view.displaySearchResult(result);
    }
}
