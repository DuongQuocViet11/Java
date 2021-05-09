package Buoi2Java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieList {
    public static void main(String[] args) {
        int i = 0;
        List<String> movie = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        movie.add("Naked Gun");
        movie.add("Like Mike");
        movie.add("Slam Dunk");
        movie.add("Kuroko no Basket");
        movie.add("Iron Man 3");
        do {
            System.out.println("--------------------------------");
            System.out.println("1. Them ten phim");
            System.out.println("2. Chinh sua ten phim");
            System.out.println("3. Xoa phim.");
            System.out.println("4. Tim kiem phim.");
            System.out.println("5. In ra danh sach tat ca cac phim.");
            System.out.println("6. Ket Thuc");
            System.out.println("-------------------------------");
            System.out.println("Chon: ");
            i = Integer.parseInt(scan.nextLine());
            switch (i){
                case 1:
                    System.out.println("Nhap ten phim: ");
                    String film = scan.nextLine();
                    movie.add(film);
                    System.out.println("Phim "+ film + " da duoc them vao: "+ (movie.indexOf(film)+1));
                case 2:
                    System.out.println("Mời bạn chọn vị trí muốn sửa:");
                    int v = Integer.parseInt(scan.nextLine());
                    System.out.println("Nhập tên phim mới:");
                    String n = scan.nextLine();
                   movie.set(v,n);
                    System.out.println("Tên phim đã được sủa thành:");
                    System.out.println(v+"."+movie.get(v));
                    break;
                case 3:
                    System.out.println("Nhập vị trí phim muốn xoá:");
                    int x = Integer.parseInt(scan.nextLine());
                    movie.remove(x);
                    System.out.println("phim đã được xoá.");
                    break;
                case 4:
                    System.out.println("Nhập tên phim muốn tìm:");
                    String t = scan.nextLine();
                    System.out.println("Vị trí của phim: "+ t + "là: "+ (movie.indexOf(t)+1));
                    break;
                case 5:
                    for (int y=0;y<movie.size();y++){
                        System.out.println(y+"."+movie.get(y));

                    }
                    break;
            }
        }while (i<6);
    }
}
