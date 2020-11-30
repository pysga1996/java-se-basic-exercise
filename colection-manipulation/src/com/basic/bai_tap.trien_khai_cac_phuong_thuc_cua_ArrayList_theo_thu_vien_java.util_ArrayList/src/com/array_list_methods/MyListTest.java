package com.basic.bai_tap.trien_khai_cac_phuong_thuc_cua_ArrayList_theo_thu_vien_java.util_ArrayList.src.com.array_list_methods;

public class MyListTest {
    public static void main(String[] args) {
        Student John = new Student(501,"John");
        Student Peter = new Student(635,"Peter");
        Student Camille = new Student(824,"Camille");
        Student Bob = new Student(113,"Bob");
        Student Serena = new Student(297,"Serena");
        Student Jason = new Student(763,"Jason");
        Student Tommy = new Student(454,"Tommy");
        Student Edna = new Student(381,"Edna");
        MyList<Student> class_list = new MyList<Student>(20);
        System.out.println("Add 8 students to list");
        class_list.add(1,John);
        class_list.add(2,Peter);
        class_list.add(3,Camille);
        class_list.add(4,Bob);
        class_list.add(5,Serena);
        class_list.add(6,Jason);
        class_list.add(7,Tommy);
        class_list.add(8,Edna);
        for (int i = 1; i <= class_list.size(); i++) {
            System.out.println(class_list.get(i));
        }
        System.out.println("Check size of list");
        System.out.println(class_list.size());
        System.out.println("Remove Serena from list");
        class_list.remove(5);
        for (int i = 1; i <= class_list.size(); i++) {
            System.out.println(class_list.get(i));
        }
        System.out.println("Check Serena's appearance in list");
        System.out.println(class_list.contains(Serena));
        System.out.println("Check order of Peter in list");
        System.out.println(class_list.indexOf(Peter));
    }
}
