package Buoi3Java2;

import Buoi2Java2.Contact;

import java.util.Scanner;

public class Main {
    private static  Scanner scanner = new Scanner(System.in);
    private static FilmList filmList = new FilmList("Film");

    public static void main(String[] args) {
        boolean quit = false;
        startFilm();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show avaiable actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    filmList.printFilm();
                    break;
                case 2:
                    addNewFilm();
                    break;
                case 3:
                    updateFilm();
                    break;
                case 4:
                    removeFilm();
                    break;
                case 5:
                    queryFilm();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }
        private static void addNewFilm(){
            System.out.println("Enter new film name: ");
            String name = scanner.nextLine();
            System.out.println("Enter id: ");
            String id = scanner.nextLine();
            Film newFilm = Film.createFilm(name, id);
            if (filmList.addNewFilm(newFilm)){
                System.out.println("New film added: name = " + name +
                        ", id = " + id);
            }else {
                System.out.println("Cannot add, " + name + " already on file");
            }
        }

        private static void updateFilm(){
            System.out.println("Enter existing film name: ");
            String name = scanner.nextLine();
            Film existingFilmRecord = filmList.queryFilm(name);
            if (existingFilmRecord == null){
                System.out.println("Film not found.");
                return;
            }
            System.out.println("Enter new film name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new film id: ");
            String newid = scanner.nextLine();
            Film newFilm = Film.createFilm(newName, newid);
            if (filmList.updateFilm(existingFilmRecord, newFilm)){
                System.out.println("Successfully updated record");
            }else {
                System.out.println("Error updating record.");
            }
        }

        private static void removeFilm(){
            System.out.println("Enter existing film name:");
            String name = scanner.nextLine();
            Film exstingFilmRecord = filmList.queryFilm(name);
            if(exstingFilmRecord == null){
                System.out.println("Film not found.");
                return;
            }
            if (filmList.removeFilm(exstingFilmRecord)){
                System.out.println("Successfully deleted");
            }else {
                System.out.println("Error deleting film");
            }
        }

        private static void queryFilm(){
            System.out.println("Enter existing film name: ");
            String name = scanner.nextLine();
            Film existingFilmRecord = filmList.queryFilm(name);
            if (existingFilmRecord ==null){
                System.out.println("Film not found.");
                return;
            }
            System.out.println("Name: " + existingFilmRecord.getName()
                    +" ID is " + existingFilmRecord.getId());
        }

        private static void startFilm(){
            System.out.println("Starting film...");
        }

        private static void printActions(){
            System.out.println("\nAvaiable actions:\npress");
            System.out.println("0 - to shutdown\n"
                    +"1 - to print films\n"
                    +"2 - to add a new film\n"
                    +"3 - to update existing an exitsting film\n"
                    +"4 - to remove an existing film\n"
                    +"5 - query if an existing contact film\n"
                    +"6 - to print a list of avaiable actions.");
            System.out.println("Choose your action: ");
        }

}

