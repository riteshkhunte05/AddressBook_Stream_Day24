package addressBookStream_Day24;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Add_Book {
	private static List<Add_Book_Main> addressBooks = new LinkedList<Add_Book_Main>();
	private static String[] addressBookName = new String[10];
	private static int numOfBooks = 0;

	private boolean checkName(String name) {
		for (int i = 0; i <addressBooks.size(); i++) {
			if (addressBookName[i].equals(name))
				return true;
		}
		return false;
	}

	private static void addressMenu(Add_Book_Main addressBook) {
		try (Scanner sc = new Scanner(System.in)) {
			int option = 0;
			boolean exit = true;
			while (exit) {
				System.out.println(
						"Select option 1: add user.  2: edit existing user.  3: display all users 4:Delete contact. 5:Switch Address Book");
				option = sc.nextInt();
				switch (option) {
				case 1:
					System.out.println("added");
					addressBook.addContacts();
					break;
				case 2:
					System.out.println("Enter the first name to edit");
					addressBook.edit();
					break;
				case 3:
					System.out.println("display");
					addressBook.display();
					break;
				case 4:
					System.out.println("Enter name");
					addressBook.delete();
					break;
				default:
					exit = false;

				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to address book program");
		Scanner sc = new Scanner(System.in);

		Add_Book_Main currentBook;
		int choice = 0;
		boolean exit1 = true;
		while (exit1) {
			System.out.println("Select option 1:Add address Book 2:open Address Book 4:Display 5:exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the address book name");
				String name = sc.next();
				currentBook = new Add_Book_Main();
				addressBooks.add(currentBook);
				addressBookName[numOfBooks] = name;
				numOfBooks++;
				break;
			case 2:
				System.out.println("The Address books available :");
				for (int i = 0; i < numOfBooks; i++) {
					System.out.println(addressBookName[i]);
				}
				System.out.println("Enter the address book name");
				String bookName = sc.next();
				int i = 0;
				for (i = 0; i < numOfBooks; i++) {
					if (addressBookName[i].equals(bookName))
						break;
				}

				if (i == numOfBooks) {
					System.out.println("name Not Found");
					break;
				}
				currentBook = addressBooks.get(i);
				addressMenu(currentBook);
				break;
			case 4:
				printAdressBooks();
			default:
				exit1 = false;
			}
		}
		sc.close();
	}

	private static void printAdressBooks() {
		for (String adressBooksDisplay : addressBookName) {
			System.out.println(adressBooksDisplay);
		}
	}
}