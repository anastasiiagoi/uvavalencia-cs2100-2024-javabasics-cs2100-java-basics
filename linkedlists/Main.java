package linkedlists;

public class Main {
    
    public static void main(String[] args) {
        // Sample usage
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        System.out.println("Initial list: " + list);
        
        list.remove("Banana");
        System.out.println("After removing 'Banana': " + list);
        
        System.out.println("Does the list contain 'Cherry'? " + list.contains("Cherry"));
        System.out.println("Does the list contain 'Orange'? " + list.contains("Orange"));
        System.out.println("Size of the list: " + list.size());


    
    }
}


// Linear Cost  
public static void printList(List<String> list) {
    for (String item : list) {
        System.out.println(item);
    }
}

// Constant Cost   
public static void printElement(String element) {
    System.out.println(element);
}