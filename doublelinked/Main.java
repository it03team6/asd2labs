package ua.kpi.fict.acts.it03.asdlabs.lab1.doublelinked;

public class Main {
    public static void main(String[] args) {
        List list = new List();

        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addByIdx(4,2);
        list.replaceLast(228);
        list.print();
        System.out.println(list.getSum());
        list.replaceAt(2,322);
        list.print();
        int a = list.indexOf(322);
        System.out.println(a);

    }
}
