package DSA.twoDArray;

import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<>();
        a.add(10);a.add(20);a.add(30);
        ArrayList<Integer> b =new ArrayList<>();
        b.add(3);b.add(6);b.add(9);
        ArrayList<Integer> c =new ArrayList<>();
        c.add(5);a.add(15);a.add(25);
        ArrayList<ArrayList<Integer>> arr =new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        System.out.println(arr);
        for (int i=0;i<arr.size();i++)
        {
            for (int j =0;j<arr.get(i).size();j++)
            {
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
        for (ArrayList<Integer> i:arr)
        {
            for (int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(69);
        arr.get(arr.size()-1).add(69);
        for (ArrayList<Integer> i:arr)
        {
            for (int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
