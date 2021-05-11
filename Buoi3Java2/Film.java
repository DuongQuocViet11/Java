package Buoi3Java2;

public class Film {
    private String name;
    private String id;

    public Film(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public static Film createFilm (String name, String id){
        return new Film(name, id);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
