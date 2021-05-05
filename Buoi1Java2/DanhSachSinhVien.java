package Buoi1Java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class DanhSachSinhVien {
    public static void main(String[] args) {
        List<String> danhsach = new ArrayList<>();
        danhsach.add("Duong Quoc Viet");
        danhsach.add("Nguyen Van A");
        danhsach.add("Nguyen Van B");
        danhsach.add("Dinh Van C");
        danhsach.add("Nguyen Thi D");
        danhsach.add("Duong Thi E");
        System.out.println(danhsach);
        danhsach.add(4, "Do Thi H");

        System.out.println("Danh sach sau khi them la: ");
        danhsach.forEach(ds ->{
            System.out.println(ds);
        });

        danhsach.remove(3);
        danhsach.remove(4);
        System.out.println("Danh sach sau khi xoa la: ");
        Iterator<String> dsIterator = danhsach.iterator();
        while(dsIterator.hasNext()){
            String ds = dsIterator.next();
            System.out.println(ds);
        }

        danhsach.set(3, "Nguyen Tien Thanh");
        danhsach.set(4, "Dinh Ba Cuong");
        System.out.println("Danh sach sau khi sua la: ");
        ListIterator<String> dsListIterator = danhsach.listIterator(danhsach.size());
        while (dsListIterator.hasPrevious()){
            String ds = dsListIterator.previous();
            System.out.println(ds);
        }

        System.out.println("Danh sach la: ");
        for (String ds: danhsach){
            System.out.println(ds);
        }

        System.out.println("Danh sach su dung for voi index");
        for (int i=0; i < danhsach.size(); i++){
            System.out.println(danhsach.get(i));
        }
    }
}
