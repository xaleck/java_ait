import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;

class App {
    
    public static void main(String[] args) {
        // arrayStatistics();
        palindromChecker();

    }
    public static void arrayStatistics(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array");
        String input = scan.nextLine();
        String[] arr = input.split(" ");
        int sum =0;
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        for(String x:arr){
            int el = Integer.parseInt(x);
            sum += el ;
            if(el < min){   
                min = el;
            } else if (el > max){
                max = el;
            }
        }
        System.out.println("Sum of arr: " +sum);
        System.out.println("Array average: " +(sum / arr.length));
        System.out.println("Max element is:" + max + "Min element is: " + min);
        System.out.println(arr);
        

    }
    public static boolean palindromChecker(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string");
        String input = scan.nextLine();
        char[] arr = input.toCharArray();
        for(int i =0; i<arr.length ; i++ ){
            if (arr[i] == arr[arr.length - i - 1]){
                continue;
            } else {
                System.out.println("Not a pallindrome");
                return false;

            }
        }
        System.out.println("Is a pallindrome");
        return true;
    }
}