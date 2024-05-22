import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int sentinel = -1;
        int sentinel2 = -1;
        String keyword;

        while  ((sentinel == -1) || (sentinel2 == -1))
        {

            System.out.print("Input a string that contains the given keywords. > ");
            keyword = input.nextLine();
            sentinel = keyword.toLowerCase().indexOf("cat");
            sentinel2 = keyword.toLowerCase().indexOf("dog");
            if (sentinel == -1)
            {
                System.out.println("Cat is not in this string");
            }
            if (sentinel2 == -1)
            {
                System.out.println("Dog is not in this string");
            }

        }
        System.out.println("Good Job!");
        input.close();
    }
}
