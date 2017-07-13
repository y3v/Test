package test;




public class Test {

	public static void main(String[] args) {
		// Exercise 2
		/*
		 * Scanner sc = new Scanner(System.in); Height height = new Height();
		 * System.out.println("Please enter your height");
		 * height.SetHeight(Double.parseDouble(sc.next()));
		 * System.out.println("Please enter your age");
		 * height.SetAge(Integer.parseInt(sc.next()));
		 * System.out.println("Your recommended weight is: " +
		 * height.RecommendedWeight() + " kg.");
		 */

		// Exercise3
		/*
		 * Scanner sc = new Scanner(System.in); String dateString;
		 * System.out.println("Please enter your DoB"); dateString = sc.next(); int year
		 * = Integer.parseInt(dateString.substring(0,4)); int month =
		 * Integer.parseInt(dateString.substring(5,7)); int day =
		 * Integer.parseInt(dateString.substring(8,10)); Calendar DoB =
		 * Calendar.getInstance(); DoB.set(year, month, day);
		 * 
		 * System.out.println(year + "-" + month + "-" + day);
		 */

		// Exercise 7
		// Exercise 7
		String fooString = "I Love Java";
		int index;
		index = fooString.indexOf('I');
		fooString = new StringBuilder(fooString).insert(index, "foo").toString();
		index = fooString.indexOf("o", index+4);
		fooString = new StringBuilder(fooString).insert(index, "foo").toString();
		index = fooString.indexOf("o", index+3);
		fooString = new StringBuilder(fooString).insert(index, "foo").toString();
		index = fooString.indexOf("e", index+4);
		fooString = new StringBuilder(fooString).insert(index, "foo").toString();
		index = fooString.indexOf("a", index+4);
		fooString = new StringBuilder(fooString).insert(index, "foo").toString();
		index = fooString.indexOf("a", index+4);
		fooString = new StringBuilder(fooString).insert(index, "foo").toString();
		System.out.println(fooString);
		
	}

}
