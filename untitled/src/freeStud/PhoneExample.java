package freeStud;

import freeStud.SmartPhone;

public class PhoneExample {
    static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.name);

        SmartPhone sp = new SmartPhone();
        System.out.println(sp.attack());
        System.out.println(p.attack());
        Phone p2 = new SmartPhone();
        System.out.println(p2.attack());
    }
}
