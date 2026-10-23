package Sets;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetExec {
    public static void printHashSet(Set<Integer> hs){
        for(int ele : hs){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void printTreeSet(Set<Integer> ts){
        for(int ele : ts){
            System.out.print(ele + " ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        Set<Integer> hs = new HashSet<>();
        Set<Integer> ts = new TreeSet<>();

        hs.add(1);
        hs.add(13);
        hs.add(2);

        ts.add(3);
        ts.add(1);
        ts.add(2);

        System.out.println("Printing the HashSet :- ");
        printHashSet(hs);

        System.out.println("Prinitng the TreeSet :- ");
        printTreeSet(ts);
    }
}
