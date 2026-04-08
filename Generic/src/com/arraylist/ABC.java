package List;

import java.util.ArrayList;
import java.util.List;

public class ABC {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();

        list.add("Banana");
        list.add("Orange");
        list.add("Apple");
        list.add("Mango");
        list.add("Kiwi");

        System.out.println("My fruits:"+list);

        String index0 = list.get(0);// getting banana
        System.out.println("Index 0:"+index0);
         list.set(0,"Papaya");//changing banana to papaya

        System.out.println("upadted fruits:" +list);

        list.remove("Apple");//removing
        System.out.println("Apple is been removed:"+list);

         int sizeList =list.size();// to get size of list
        System.out.println("Size of a list:" +sizeList);

        boolean checkElement =list.isEmpty();//checking empty or not
        System.out.println("Check is empty:"+checkElement);

        boolean contain= list.contains("Apple");// contains element or not
        System.out.println(" contains apple or not:"+contain);

    }
}