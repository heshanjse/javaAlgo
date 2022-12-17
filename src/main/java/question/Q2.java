package question;

//Q2 : Write a method that uses a while loop. This method would replace every
//        vowel in the String with X. Call your method from the main method.
//
//        output : Java is Fun
//        should become
//        JXvX Xs FXn
public class Q2 {
    public static void main(String[] args) {
        String s = "Java is Fun";
        char[] a = s.toCharArray();
        for(int i=0; i<a.length;i++){
           if( "A".equalsIgnoreCase(String.valueOf(a[i])) || "E".equalsIgnoreCase(a[i]+"") || "I".equalsIgnoreCase(a[i]+"") || "O".equalsIgnoreCase(a[i]+"") || "U".equalsIgnoreCase(a[i]+"")){
               a[i] ='X';
           }
        }
        System.out.println(a);

    }
}
