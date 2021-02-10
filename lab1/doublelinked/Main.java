package ua.kpi.fict.acts.it03.asdlabs.lab1.doublelinked;

public class Main {
    public static void main(String[] args) {
        List list1 = new List();
        long tStart = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++)
        {
            list1.addLast((int) (Math.random() * (1000 - 1)) + 1);
        }
        long tEnd = System.currentTimeMillis();
        long tToDo = tEnd - tStart;
        System.out.println(tToDo + " ms");
    }
}
