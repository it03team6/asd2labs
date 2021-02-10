package ua.kpi.fict.acts.it03.asdlabs.lab1.arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList list1 = new MyArrayList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(4);
        list1.addLast(132);
        list1.addLast(1488);

        list1.print();

        list1.removeFirst();

        list1.print();

        list1.removeLast();

        list1.print();
    }
}
