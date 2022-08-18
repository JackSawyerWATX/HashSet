import java.util.*;

public class Main {

    public static void main(String args[]) {

        // creating a HashSet that can hold Integer objects
        HashSet<Integer> hashSet = new HashSet<>();

        // adding to the set
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(9);
        hashSet.add(0);

        System.out.println();

        //Number of integers in the hash set
        System.out.println("The size of the set is: " + hashSet.size());

        // printing out the set
        System.out.println(hashSet);

        // removing a value from the set
        hashSet.remove(1);
        hashSet.remove(3);
        hashSet.remove(5);
        hashSet.remove(7);
        hashSet.remove(9);

        System.out.print("    Here is the Hash Set on one line: ");
        //loop through the set
        for(Integer HashSet: hashSet){
            System.out.print(HashSet);
        }

        System.out.println();
        //Number of integers in the hash set
        System.out.println("Now the size of the set is: " + hashSet.size());

        // printing out the set
        System.out.println(hashSet);
    }
}