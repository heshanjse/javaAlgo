package question;

//Q1 : Write a method that uses a for loop to display numbers in descending order
//        in the step of 5 starting from 100. Call your method from the main method.
//
//        output : 100 95 ... 5 0
public class Q1 {
    public static void main(String[] args) {
        for (int i= 100;i>0;i-=5){
            System.out.println(i);
        }
    }
}
