package Buoi3Java2;

import Buoi2Java2.Contact;

import java.util.ArrayList;

public class FilmList {
    private String myFavorFilm;
    private ArrayList<Film> myFilms;

    public FilmList(String myFavorFilm){
        this.myFavorFilm = myFavorFilm;
        this.myFilms = new ArrayList<Film>();
    }

    public boolean addNewFilm(Film film){
        if(findFilm(film.getName()) >= 0){
            System.out.println("Film is already on file");
            return false;
        }
       myFilms.add(film);
        return true;
    }

    public boolean updateFilm(Film oldFilm, Film newFilm){
        int foundPosition = findFilm(oldFilm);
        if(foundPosition < 0){
            System.out.println(oldFilm.getName() + ", was not found.");
            return false;
        }
        this.myFilms.set(foundPosition, newFilm);
        System.out.println(newFilm.getName() + ", was replaced with " + newFilm.getName());
        return true;
    }

    public boolean removeFilm(Film film){
        int foundPosition = findFilm(film);
        if (foundPosition < 0){
            System.out.println(film.getName() + ", was not found");
            return false;
        }
        this.myFilms.remove(foundPosition);
        System.out.println(film.getName() + ", was deleted.");
        return true;
    }

    private int findFilm(Film film){
        return this.myFilms.indexOf(film);
    }

    private int findFilm(String filmName){
        for (int i = 0; i<this.myFilms.size(); i++){
            Film film = this.myFilms.get(i);
            if (film.getName().equals(filmName)){
                return i;
            }
        }
        return -1;
    }

    public String queryFilm(Film film){
        if (findFilm(film) >= 0){
            return film.getName();
        }
        return null;
    }

    public Film queryFilm (String name){
        int position = findFilm(name);
        if (position >= 0){
            return this.myFilms.get(position);
        }
        return null;
    }

    public void printFilm(){
        System.out.println("Film List " + myFavorFilm);
        for (int i = 0; i < this.myFilms.size(); i++){
            System.out.println((i+1)+"."+
                    this.myFilms.get(i).getName() + " - " +
                    this.myFilms.get(i).getId());
        }
    }
}
