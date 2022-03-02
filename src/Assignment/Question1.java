package Assignment;

/*
Q1. You are given a phone book that consists of people's names and their phone number. 
After that you will be given some person's name as input. For each input, print the phone number of that person. 
For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number.
*/
import java.util.HashMap;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> phoneList = new HashMap<String, Integer>();

		phoneList.put("Ranbir", 223344);
		phoneList.put("Amitabh", 112233);
		phoneList.put("Akshay", 334455);
		phoneList.put("Paresh", 445566);
		phoneList.put("Ajay", 556677);
		phoneList.put("JamesB", 007);
		phoneList.put("Police", 911);

		System.out.println("Enter person's name");
		String name = sc.next();
		for (int i = 0; i < phoneList.size(); i++) {
			if (phoneList.containsKey(name)) {
				System.out.println(phoneList.get(name));
				break;
			} else if(!phoneList.containsKey(name)){
				System.out.println("Person is not found");
				break;
			}
		}

	}
}
