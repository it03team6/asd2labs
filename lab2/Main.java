package ua.kpi.fict.acts.it03.asdlabs.lab2;

public class Main {
    public static void main(String[] args) {
        BinSearchTree bst = new BinSearchTree();
        long start = System.nanoTime();
        bst.add(500);
        for(int i = 0; i<1000 ;i++ )
        {
            bst.add(i);
        }
        long end = System.nanoTime();
        System.out.println("Adding 1k: " + (end - start) +" ns");

        System.out.println("#####");

        start = System.nanoTime();
        for(int i = 0; i<1000 ;i++ )
        {
            bst.delete(i);
        }
        end = System.nanoTime();
        System.out.println("Deleting 1k: " + (end - start) +" ns");

        System.out.println("#####");

        bst.add(500);
        for(int i = 0; i<1000 ;i++ )
        {
            bst.add(i);
        }

        start = System.nanoTime();
        for(int i = 0; i<1000 ;i++ )
        {
            bst.isExist(i);
        }
        end = System.nanoTime();
        System.out.println("Existing test: " + (end-start) + " ns");

        System.out.println("#####");

        start = System.nanoTime();
        for(int i = 1000; i<2000 ;i++ )
        {
            bst.isExist(i);
        }
        end = System.nanoTime();
        System.out.println("Existing test(elements which not exist): " + (end-start) + " ns");

        System.out.println("#####");

        start = System.nanoTime();
        bst.getSum();
        end = System.nanoTime();
        System.out.println("Sum of tree elements: " + (end-start) + " ns");
    }
}
