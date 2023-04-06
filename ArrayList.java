// Java : The Array List Class
// we can store objects in an array but once a array is created its size fixed. Java provides
// the ArrayList class that can be used to store an unlimited number of objects.


public class ArrayList {
    public static void main(String args []){
        // it creates an ArrayList using its no-arg constructor.
        java.util.ArrayList cities = new java.util.ArrayList();
        // add method adds any instance of Object into the list. Since String is a subclass of Object, strings
        // can be added to the list. The add method adds an object to the end of list.
        cities.add("London");
        cities.add("Paris");
        cities.add("Toronto");
        cities.add("Hong Kong");
        cities.add("Singapore");

        System.out.println("Cities are : "+cities.toString());
        System.out.println("Size of cities List is : "+cities.size());
        System.out.println("Is Toronto in the list? : "+cities.contains("Toronto"));
        System.out.println("Is empty list? : "+cities.isEmpty());
        System.out.println("Index of Hong Kong is : "+cities.indexOf("Hong Kong"));
        System.out.println("add at index 3 ");
        cities.add(3, "Noida");
        cities.remove(1);
        cities.remove("Singapore");
        System.out.println(cities.toString());

        for(int i = cities.size()-1; i >= 0; i--){
            System.out.print(cities.get(i)+", ");
        }
        System.out.println();

        cities.set(3, "Delhi");
        cities.set(0, "Delhi");
        System.out.println("Last index of Delhi in list is : "+cities.lastIndexOf("Delhi"));
        System.out.println(cities.toString());
    }
}