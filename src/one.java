import java.util.Scanner;

public class one {
    public static void main(String[] args) {
      int elements [] = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            elements[i] = scan.nextInt();
        }
        int dec = 1;
        int sum = 0;
        for(int i = 0; i<5; i++){
            sum += elements[i];
            dec *= elements[i];
        }
        System.out.println(sum);
        System.out.println(sum/5);
        System.out.println(dec);
    }
}
