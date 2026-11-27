
// import java.util.Scanner;

// class StudentNameManagement {

//     String names[] = {"Rahul", "Priya", "Aman", "Neha", "Rohit"};

//     void showName(int index) {
//         try {
//             System.out.println("Student Name: " + names[index]);
//         }
//         catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Invalid Index!");
//         }
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         StudentNameManagement obj = new StudentNameManagement();

//         System.out.print("Enter index: ");
//         int index = sc.nextInt();

//         obj.showName(index);
//     }
// }


// check voter eligibility through using throw
import java.util.Scanner;

class Voter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new ArithmeticException("Not eligible for voting!");
            }
            else {
                System.out.println("You are eligible for voting.");
            }
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
