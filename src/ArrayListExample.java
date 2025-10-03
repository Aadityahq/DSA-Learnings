import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample
{
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//
//        System.out.println(list);
        // list.set(2, 8);



        ArrayList<ArrayList<Integer>> list2 = new  ArrayList<>();

        for(int i = 0; i < 3; i++)
        {
            list2.add(new ArrayList<>());
        }

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                list2.get(i).add(j);
            }
             
        }

        System.out.println(list2);
    }
}
