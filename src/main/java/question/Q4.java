package question;

//Q4 : Write a method that checks if a String is a Palindrome. Call your method from the main method.
//
//        output : ABCBA
//        is a Palindrome, where as
//        Java
//        is not a Palidrome.
public class Q4 {
    public static void main(String[] args) {
      //  String s = "Java";
        String s = "ABCBA";
        char a [] = s.toCharArray();
        char b [] = s.toCharArray();
        for(int i=0;i<b.length/2;i++){
            char temp = b[i];
            System.out.println(b.length-i);
            b[i] = b[b.length-i-1];
            b[b.length-i-1] = temp;
        }
        System.out.println(a);
        System.out.println(b);
        if(new String(b).equals(new String(a))){
            System.out.println("is a Palindrome");
        } else {
            System.out.println("is not Palindrome");
        }
    }
}
