import java.util.*;
public class secondLargest
{
public static void main(String args[]) 
{
System.out.println("PROGRAM FOR FINDING THE SECOND HIGHEST NUMBER IN AN ARRAY");
System.out.println("\nENTER THE SIZE OF THE ARRAY");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
for (int i = 0; i< n; i++) 
{
arr[i] = sc.nextInt();
}
int secondLargest = findSecondLargest(arr);
System.out.println("The Second Highest Number is "+ secondLargest);
}
static int findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}


