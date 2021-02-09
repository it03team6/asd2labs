package ua.kpi.fict.acts.it03.asdlabs.lab1.singlelinked;

public class Main {
    public static void main(String[] args) {
        List list1 = new List();
        long tStart = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++)
        {
            list1.addBack((int) (Math.random() * (1000 - 1)) + 1);
        }
        long tEnd = System.currentTimeMillis();
        long tToDo = tEnd - tStart;
        System.out.println(tToDo + " ms");
/*        list1.addBack(1);
        list1.addBack(2);
        list1.addBack(3);
        list1.addFront(6);
        list1.addAt(2,322);


        list1.printList();
        System.out.println("############");

//        list1.delEl(6);
//        list1.delEl(5);
//        list1.delEl(2);

        list1.printList();
        System.out.println("###");

        //list1.delLast();
        int forPrint = list1.indexOf(322);
        System.out.println(forPrint);
        list1.printList();

        System.out.println("##");

        list1.printList();
        list1.replaceAt(2, 1488);
        list1.printList();
        System.out.println("###");
        int sum = list1.sumOfList();
        System.out.println(sum);*/
    }
}
