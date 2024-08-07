import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);

         System.out.println(list);

        int element= list.get(3);
        System.out.println(element);

          list.remove(1);

          System.out.println(list);


          list.set(2,10);
          System.out.println(list);

    System.out.println(list.contains(1));
    System.out.println(list.contains(11));

    list.add(2,13);
    System.out.println(list);


    }
    
}
