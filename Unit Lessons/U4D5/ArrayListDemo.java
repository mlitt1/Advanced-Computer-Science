// arrays are objects that represent lists of elemetns
//the size of an array cannot be changed once initialized
//if i want to expand an array, id have to ceate a new array and copy the old values
//arrays do not have mtethdos

//ArrayList class
//expandable list and has methdos
//must import the class before use
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<String>();
        // arrayLists reserve 10 empty slots in your memory
        names.add("Daniel the conquerer");
        names.add("Matthew");
        names.add("Morgan the sigma");
        names.add("Justinian");
        names.add("Tung tung tung sahur");
        names.add("Triple T");
        names.add("Jim harbaugh");
        names.add("Juan");
        names.add("Boyan");
        names.add("Charlie");
        names.add("Odafe Oweh");
        names.add("Daiyan Henley");
        names.add("Mark Cuban");
        names.add("Tralalero Tralala");
        names.add("Barbara");
        names.add("Bronny");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.get(4));
        names.add(1,"Poop");
        System.out.println(names);
        ArrayList<Integer> myFavNumbers = new ArrayList<Integer>();
        myFavNumbers.add(16);
        myFavNumbers.add(67);
        myFavNumbers.add(41);
        myFavNumbers.add(21);
        myFavNumbers.add(69);
        myFavNumbers.add(420);
        myFavNumbers.add(1, 4);
        System.out.println(myFavNumbers.set(2,3));
        // names[i] = "Lopez"
    }
}