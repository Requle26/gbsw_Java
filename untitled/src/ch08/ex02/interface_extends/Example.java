package ch08.ex02.interface_extends;

public class Example {
    static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodC();
        System.out.println();
    }
}
