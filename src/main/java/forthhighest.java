// Input- {1, 5, 2, 3, 100, 7, 9, 8}
// Output - 7

// Input - {15, 33, 17, 19, 21, 5}
// Output - 17

public class forthhighest {
    public static void main(String[] args) {
        int a [] = {1,5,2,3,100,7,9,8};
        int temp =0;
        for(int i=0;i<a.length; i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[a.length - 4]);

    }

}
