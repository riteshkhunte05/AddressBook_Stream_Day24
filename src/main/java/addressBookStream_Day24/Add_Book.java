package addressBookStream_Day24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Add_Book {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Welcome to Address Book System");
        Map<String, Add_Book_Main> map = new HashMap<>();
        System.out.println("Enter Number of address book you want to add");
        Integer count = scan.nextInt();
        Integer i = 0;
        while (i < count) {
            System.out.println("Enter  book name");
            String bookName = scan.next();
            Add_Book_Main addressBook = new Add_Book_Main();
            addressBook.operation();
            map.put(bookName, addressBook);
            i++;
        }
        System.out.println(map);
    }}  