package org.example;

public class Dev {

    private int age;
//    private Laptop laptop;
    private Computer comp;

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


//    public Dev(int age){
//        this.age = age;
//    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public Dev(Computer comp){
        this.comp = comp;
    }

    public Dev(){
        System.out.println("Dev constructor");
    }

    public void build(){
        System.out.println("building with the dev class");
        comp.compile();
    }
}
