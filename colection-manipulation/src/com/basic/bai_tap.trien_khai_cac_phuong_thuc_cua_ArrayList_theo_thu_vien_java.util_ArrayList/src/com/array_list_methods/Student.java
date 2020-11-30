package com.basic.bai_tap.trien_khai_cac_phuong_thuc_cua_ArrayList_theo_thu_vien_java.util_ArrayList.src.com.array_list_methods;

public class Student {
    private int id = 0;
    private String name = "";

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void Introduce() {
        System.out.println("My name is " + name + " and my ID is " + id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
