package question;

//Q3 : Write a method that uses a do while loop. This method would reverse a
//        String. Call your method from the main method.
//
//        output : Java
//        should become
//        avaJ
public class Q3 {
    public static void main(String[] args) {
        String s = "Java";
        char a [] = s.toCharArray();
        char b [] = s.toCharArray();
        for(int i=0;i<a.length/2;i++){
            char temp = a[i];
            System.out.println(i);
            System.out.println(a.length-i);
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }
        System.out.println(a);
//        if(b.toString().equals(a.toString())){
//            System.out.println("");
//        } else {
//
//        }
    }
}
