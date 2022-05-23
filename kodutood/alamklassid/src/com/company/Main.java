package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("German", "Eiter`", "Sergeevich", "04.19.2002");
        Employee e1 = new Employee(p1, 1, 1);
        Chief c1 = new Chief();
        c1.setBonus(e1, 500.0);
        e1.breakRoomAccessTimes();
        System.out.println(e1.getBonus());
    }
}
