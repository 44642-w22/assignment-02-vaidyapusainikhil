package Assignment02;

import java.util.*;

public class AssignmentTwo {

	public static void main(String[] args) {

//	Problem 1
		AssignmentTwo FN = new AssignmentTwo();
		FN.ProblemOne();

//	Problem 2
		FN.ProblemTwo();

//	Problem 3
		FN.ProblemThree();

//	Problem 4
		FN.ProblemFour();

//	Problem 5
		FN.ProblemFive();

//	Problem 6
		FN.ProblemSix();

	}

//Problem One
	public void ProblemOne() {

		System.out.println("*** Problem One ***");

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Number of Strings: ");
		int n = scan.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter " + n + " Strings: ");

		// code for counting the variables

		for (int i = 0; i < n; i++) {
			String s = scan.next();
			arr[i] = s;
		}

		Map<String, Integer> res = cStrings(arr);
		System.out.print("Input (S1): [");
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			c++;
			if (c != arr.length)
				System.out.print("\"" + arr[i] + "\",");
			else
				System.out.print("\"" + arr[i] + "\"");
		}
		System.out.println("]");
		System.out.println("Output: ");
		c = 0;

		for (Map.Entry<String, Integer> entry : res.entrySet()) {
			c++;
			if (c != res.size()) {
				System.out.print(entry.getKey() + "-" + entry.getValue() + ", ");
			} else {
				System.out.print(entry.getKey() + "-" + entry.getValue());
			}
		}
	}

	// function for getting the count
	public static Map<String, Integer> cStrings(String[] input) {
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < input.length; i++) {
			map.put(input[i], map.getOrDefault(input[i], 0) + 1);
		}
		return map;
	}

//Problem Two
	public void ProblemTwo() {

		Scanner scan = new Scanner(System.in);

		System.out.println("\n");
		System.out.println("*** Problem Two ***");
		System.out.print("Enter the Number of Strings:");
		int n = scan.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter " + n + " Strings:");

		for (int i = 0; i < n; i++) {
			String s = scan.next();
			arr[i] = s;

		}

		// code for matching the first letter strings
		Map<String, String> res = concatStrings(arr);
		System.out.print("Input of (S1): [");
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			c++;
			if (c != arr.length)
				System.out.print("\"" + arr[i] + "\",");
			else
				System.out.print("\"" + arr[i] + "\"");
		}
		System.out.println("]");
		System.out.println("Output (M1): {");
		c = 0;
		for (Map.Entry<String, String> entry : res.entrySet()) {
			c++;
			if (c != res.size())
				System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"" + ",");
			else
				System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"");
		}
		System.out.print(" } ");
	}

	public static Map<String, String> concatStrings(String[] input) {
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			String s = input[i];
			map.put(s.charAt(0) + "", map.getOrDefault(s.charAt(0) + "", "") + s);
		}

		return map;
	}

//Problem Three

	public void ProblemThree() {

		Scanner scan = new Scanner(System.in);

		System.out.println("\n");
		System.out.println("*** Problem Three ***");
		System.out.print("Enter Number of ements: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " ements:- ");

		for (int i = 0; i < n; i++) {
			int e = scan.nextInt();
			arr[i] = e;

		}

		Set<Integer> res = printSequentialSet(arr);
		System.out.println("Input (A1): " + Arrays.toString(arr));
		System.out.println("Output (S): " + res);
	}

// Finding the duplicate elements
	public static Set<Integer> printSequentialSet(int[] input) {
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < input.length; i++) {
			int e = input[i];
			while (set.contains(e)) {
				e++;
			}
			set.add(e);
		}
		return set;
	}

//Problem Four
	public void ProblemFour() {

		Scanner scan = new Scanner(System.in);

		System.out.println("\n");
		System.out.println("*** Problem Four ***");
		System.out.print("Enter the  number of Strings: ");
		int n = scan.nextInt();
		ArrayList<String> input = new ArrayList<>();
		System.out.println("Enter " + n + " Elements:");

		for (int i = 0; i < n; i++) {
			String ele = scan.next();
			input.add(ele);

		}

		ArrayList<String> res = removeDuplicateChars(input);
		System.out.print("Input of (A1): [");
		int c = 0;
		for (int i = 0; i < input.size(); i++) {
			c++;
			if (c != input.size())
				System.out.print("\"" + input.get(i) + "\",");
			else
				System.out.print("\"" + input.get(i) + "\"");
		}
		System.out.println("]");

		System.out.println("Output (A2): [");
		c = 0;
		for (int i = 0; i < res.size(); i++) {
			c++;
			if (c != res.size())
				System.out.print("\"" + res.get(i) + "\",");
			else
				System.out.print("\"" + res.get(i) + "\"");
		}
		System.out.println("]");

	}

	// Code for Clubbing the similar letters
	public static ArrayList<String> removeDuplicateChars(ArrayList<String> input) {
		ArrayList<String> res = new ArrayList<>();
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < input.size(); i++) {
			String s = input.get(i);
			StringBuilder sb = new StringBuilder();
			for (char c : s.toCharArray()) {
				if (!set.contains(c)) {
					sb.append(c);
					set.add(c);
				}
			}
			res.add(sb.toString());

			set.clear();
		}
		return res;
	}

//Problem Five
	public void ProblemFive() {

		Scanner scan = new Scanner(System.in);

		System.out.println("\n");
		System.out.println(" *** Problem Five ***");
		System.out.print("Enter  the Number of Strings: ");
		int n = scan.nextInt();
		ArrayList<String> input = new ArrayList<>();
		System.out.println("Enter " + n + " elements: ");

		for (int i = 0; i < n; i++) {
			String e = scan.next();
			input.add(e);

		}

		// code for taking the first and last letters
		Map<String, String> res = firstLastCharMap(input);
		System.out.print("Input: [");
		int c = 0;
		for (int i = 0; i < input.size(); i++) {
			c++;
			if (c != input.size())
				System.out.print("\"" + input.get(i) + "\",");
			else
				System.out.print("\"" + input.get(i) + "\"");
		}
		System.out.println("]");

		System.out.println("Output: {");
		c = 0;
		for (Map.Entry<String, String> entry : res.entrySet()) {
			c++;
			if (c != res.size())
				System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"" + ",");
			else
				System.out.print("\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"");

		}
		System.out.print("}");
	}

	public static Map<String, String> firstLastCharMap(ArrayList<String> input) {
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < input.size(); i++) {
			char firstChar = input.get(i).charAt(0);
			char lastChar = input.get(i).charAt(input.get(i).length() - 1);
			map.put(firstChar + " ", lastChar + "");
		}
		return map;
	}

//Problem 6
	public void ProblemSix() {

		Scanner scan = new Scanner(System.in);

		System.out.println("\n");
		System.out.println("*** Problem Six ****");
		System.out.print("Enter  the Number of Strings: ");
		int n = scan.nextInt();
		ArrayList<String> input = new ArrayList<>();
		System.out.println("Enter the  " + n + " ements:- ");

		for (int i = 0; i < n; i++) {
			String e = scan.next();
			input.add(e);

		}

		Map<String, Boolean> res = setBooleanMap(input);
		System.out.print("Input (S1): [");
		int c = 0;
		for (int i = 0; i < input.size(); i++) {
			c++;
			if (c != input.size())
				System.out.print("\"" + input.get(i) + "\",");
			else
				System.out.print("\"" + input.get(i) + "\"");
		}
		System.out.println("]");

		System.out.println("Output (M1): {");
		c = 0;
		for (Map.Entry<String, Boolean> entry : res.entrySet()) {
			c++;
			if (c != res.size())
				System.out.print("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + ", ");
			else
				System.out.print("\"" + entry.getKey() + "\"" + ":" + entry.getValue());
		}
		System.out.print("}");
	}

	public static Map<String, Boolean> setBooleanMap(ArrayList<String> input) {

		Map<String, Boolean> map = new HashMap<>();
		for (int i = 0; i < input.size(); i++) {
			if (map.containsKey(input.get(i))) {
				map.put(input.get(i), true);
			} else {
				map.put(input.get(i), false);
			}
		}
		return map;
	}
}