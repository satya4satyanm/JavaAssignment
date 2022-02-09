import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);
    //function to checkPalindrome
    public Boolean checkPalindrome(int i)  {
        int sum = 0;
        int temp = i;
        while(temp>0) {
            sum = sum*10 + temp%10;
            temp = temp/10;
        }
        System.out.println(sum + " " + i);
        if(sum==i) {
            return true;
        } else {
            return false;
        }
    }
    //function to printPattern
    public String printPattern(int i) {
        String s = "";
        for(int p=i; p>0; p--) {
            for(int q=p; q>0; q--) {
                s=s+"*";
            }
            if(p==1) break;
            s=s+"\n";
        }
        return s;
    }
    //function to check no is prime or not
    public Boolean checkPrimeNumber(int i) {
        int divisor = (int) Math.ceil(i/2);
        for(int j=2; j<divisor; j++) {
            if(i%j==0) return false;
        }
        return true;
    }
    // function to print Fibonacci Series
    public String printFibonacciSeries(int i) {
        //initialize the first and second value as 0,1 respectively.
        int first = 0, second = 1;

        String s = ""+first;
        if(i==1) return s;
        s = s+" "+ second;
        if(i==2) return s;

        for(int p=2; p<i; p++) {
            int next = first+second;
            s = s+" "+next;
            first=second;
            second=next;
        }
        return s;
    }
    //main method which contains switch and do while loop
    public static void main(String[] args) {
        Main obj = new Main();
        int choice;
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();
            choice = sc.nextInt();
            System.out.println("Enter the number : ");
            num = sc.nextInt();

            switch (choice) {
                case 0:
                    choice = 0;
                    break;
                case 1: {
                    System.out.println(obj.checkPalindrome(num));
                }
                break;
                case 2: {
                    System.out.println(obj.printPattern(num));
                }
                break;
                case 3: {
                    System.out.println(obj.checkPrimeNumber(num));
                }
                break;
                case 4: {
                    System.out.println(obj.printFibonacciSeries(num));
                }
                break;
                default:
                    System.out.println("Invalid choice. Enter a valid no.\n");
            }
        } while (choice != 0);
        System.out.println("Exited Successfully!!!");
        sc.close();
    }
}