package linked_list.learningLL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL(); 
        list.insertATfirst(5);
        list.insertATfirst(4);
        list.insertATfirst(4);
        list.insertATfirst(69);
        list.insertATfirst(1);
        list.insertATfirst(2);
        list.insertATfirst(1);
        list.insertATfirst(3);


        list.insertATlast(69);
        list.insertATlast(10);

        list.insertATposition(15, 3);
        list.display();
        System.out.println(" \n");
        System.out.println(list.deleteATfirst());
        list.display();
        System.out.println(" \n");
        System.out.println(list.deleteATlast());
        list.display();
        System.out.println(" \n");
        System.out.println(list.deleteATposition(3));
        list.display();
        System.out.println("");
        list.insertUsingRecursion(25, 1);
        list.insertUsingRecursion(100, 2);
        list.display();

        // remove duplicate from the list using no extra space
        list.removeDuplicateValues();

         System.out.println("\nremoved duplicate with no extra space");
        list.display();

        // remove duplicate from the list using extra space
        list.insertATfirst(25);
       // list.insertATfirst(77);
        list.removeDuplicate(list);
        System.out.println("\nremoved duplicate with extra space");
        list.display();
        System.out.println("\nMiddle of list =>");
        System.out.println(list.middleNode());
    
    
        
    
    }

}
