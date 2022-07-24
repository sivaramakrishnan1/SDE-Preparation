import java.util.*;

public class s2p3 {
    public static void main(String[] args) {
        s2p3 obj = new s2p3();

        Scanner s = new Scanner(System.in);

        int limit = s.nextInt();
        obj.printPoosibilities(limit);

        s.close();
    }

    public void printPoosibilities(int limit)
    {
        List<String> list = new ArrayList<String>();

        list.add("3");
        list.add("4");
        String s = " ";
        int index=0;

        for(int i=0 ; i<limit ; i++)
        {
            s = "3" + (String) list.get(index);
            list.add(s);
            s = "4" + (String) list.get(index++);
            list.add(s);
        }
        for(String one : list)
            System.out.println(one);
        // ! Prints everything
        // System.out.println(list);
    }
}
