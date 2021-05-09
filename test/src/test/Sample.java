package test;
class Reversing { 
	 static String rev = " ";

	 public static void main(String[] args) {
	  String str = "Welcome to  Java";
	  String output = reverse(str);
	  System.out.println(" rev string  is " + str);
	  System.out.println(output);
 }

	 public static String reverse(String str) {

	  StringBuilder sb = new StringBuilder();
	  String[] words = str.split(rev);
	  

	  for (String word : words) {
	   
	   StringBuilder sb1 = new StringBuilder();
	   for (int i = word.length() - 1; i >= 0; i--) {
	    sb1.append(word.charAt(i));
	   }

	   sb.append(sb1).append(rev);
	  }

	  String str1 = sb.toString();

	  return str1;
	 }
}
