/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author Ghauri
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

class Task1 {

    public int wordCounter(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i > 0) && (s.charAt(i) != ' ') && (s.charAt(i - 1) == ' ') || ((s.charAt(0) != ' ') && (i == 0))) {
                count++;
            }
        }

        System.out.println("Number of Words       : " + count);
        return count;
    }

    public int vowelCounter(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                count++;
            }
        }
        System.out.println("Number of vowels      : " + count);

        return count;
    }

    public int puncCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ',' || s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '-' || s.charAt(i) == '?' || s.charAt(i) == ':') {
                count++;
            }
        }
        System.out.println("Number of puntuations : " + count);
        return count;
    }

    public static Boolean FindString(String Sub){
        Boolean flag=false;
        if(Sub.contains("the")){
            flag=true;
         System.out.println("Your String contain String the");   
        }
        else{
            System.out.println("Your String donot contain the");
        }    
        return flag;
    }  
}
class Task2 {

    String dispVeritcal(String Data) {
        System.out.println("Vertical String: ");

        for (int i = 0; i < Data.length(); i++) {
            System.out.println(Data.charAt(i));
        }
        return Data;
    }

}

class Task3 {

    String removeInteger(String s) {
        String replace = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                replace = replace + s.charAt(i);
            }
        }
        System.out.println("String after removing integer: " + replace);
        return replace;
    }

    String ridMultpleSpace(String s) {
        String data = s.replaceAll("\\s+", " ");
        System.out.println("Replaced Spacing : " + data);
        return data;
    }

    String Encryption(String s) {
        int a;
        char b;
        String c = "";
        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            a = a - (10 * 5);
            b = (char) a;
            c = c + b;
        }
        System.out.println("Ecryption: " + c);
        return c;
    }

}

class MyString extends Task1 {

    //Task1: to count spaces
    int countSpaces(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Number of spaces: " + count);
        return count;
    }

    //Task2: To add two binary Strings
    String CompareStr(String a, String b) {
        if (a.length() > b.length()) {
            System.out.println("String 1 is greater than String 2");
        }
        if (a.length() < b.length()) {
            System.out.println("String 1 is smaller than String 2");
        }

        if (a.length() == b.length()) {
            System.out.println("String 1 is equal to String 2");
        }
        return "";
    }

    //Task3: Converting String into Upper & Lower case
    void StrConverter(String s) {
        System.out.println("String in Lower Case: " + s.toLowerCase());
        System.out.println("String in Upper Case: " + s.toUpperCase());
    }

    //Task4: Duplicate Characters
    void DuplicateStr(String s) {

        int count = 0;
        char[] arr = s.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j]);
                    count++;
                }
            }
        }
    }
   void FindSubString(String s,String a){
       if(s.contains(a)){
           System.out.println("Your String 1 have" + a+ "String");
       }
       else{
           System.out.println("Your program donot contain"+ a +"String");
       }
   }
   void  EqualSting(String a, String B){
     if(a.equals(B)) {
         System.out.println("Your "+ a + " is equal to " +B );
     } 
     else
     {
         System.out.println("Your string 1 isnot equal to string 2");
     }
   }
   void EmptyString(String A){
       if(A.isEmpty()){
           System.out.println("Your String is empty");
       }
       else{
            System.out.println("YOur String is not empty");
       }
   }
}
public class Week9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int decide;
        do {
            System.out.println("1.Task 1\n2.Task 2\n3.Task 3\n4.Task 4\n5.Exit\nchoose yout input:");
            Scanner in = new Scanner(System.in);
            decide = in.nextInt();
            switch (decide) {

                case 1:
                    String s;
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter our string: ");
                    s = input.nextLine();
                    Task1 a = new Task1();
                    a.wordCounter(s);
                    a.vowelCounter(s);
                    a.puncCount(s);
                    a. FindString(s);
                    break;
                case 2:
                    Scanner input1 = new Scanner(System.in);
                    String s2;
                    System.out.print("**Vertical String**");
                    System.out.print("Enter your string: ");
                    s2 = input1.nextLine();
                    Task2 b = new Task2();
                    b.dispVeritcal(s2);

                    break;
                case 3:
                    do {
                        System.out.println("1.Remove Integer\n2.Remove Multiple Spaces\n3.Encyptor \n4.Exit\nchoose yout input:");
                        int decider;
                        Task3 c = new Task3();

                        decider = in.nextInt();
                        Scanner input2 = new Scanner(System.in);
                        switch (decider) {
                            case 1:
                                String x;
                                System.out.print("Enter your string: ");
                                x = input2.nextLine();
                                c.removeInteger(x);
                                break;
                            case 2:
                                String y;
                                System.out.print("Enter your string: ");
                                y = input2.nextLine();
                                c.ridMultpleSpace(y);
                                break;
                            case 3:
                                String z;
                                System.out.print("Enter your string: ");
                                z = input2.nextLine();
                                c.Encryption(z);
                                break;
                            case 4:
                                System.out.print("\nExited!! \n\n");

                                break;

                        }
                    } while (decide != 4);

                    break;
                case 4:
                    int decide2;
                    do {
                        System.out.println("1.Count Spaces\n2.Compare Strings\n3.Case Converter \n4.Duplicate Characters"
                                + "\n5.FingAnother String \n6.EqualStrig \n7. Empty String\n8.EXIT \nchoose yout input:");

                        Scanner input3 = new Scanner(System.in);
                        decide2 = in.nextInt();
                        MyString d = new MyString();

                        switch (decide2) {
                            case 1:
                                String a1;
                                System.out.print("Input String: ");
                                a1 = input3.nextLine();
                                d.countSpaces(a1);

                                break;
                            case 2:
                                String A,
                                 B;
                                System.out.print("First String: ");
                                A = input3.nextLine();
                                System.out.print("Second String: ");
                                B = input3.nextLine();
                                d.CompareStr(A, B);

                                break;
                            case 3:
                                String C;
                                System.out.print("Input String: ");
                                C = input3.nextLine();
                                d.StrConverter(C);
                                break;
                            case 4:
                                String D;
                                System.out.print("Input String: ");
                                D = input3.nextLine();
                                d.DuplicateStr(D);
                                System.out.print("\n");
                                break;
                            case 5:
                                String E;
                                String F;
                                System.out.println("Input String 1");
                                E=input3.nextLine();
                                System.out.println("Input String 2");
                                F=input3.nextLine();
                                d.FindSubString(E , F);
                                System.out.println("\n");
                                break;
                            case 6:
                                String G;
                                String H;
                                   System.out.println("enter your String 1:");
                                   G=input3.nextLine();
                                   System.out.println("Enter your String 2:");
                                   H=input3.nextLine();
                                   d.EqualSting(G, H);
                                   System.out.println("\n");
                                   break;
                            case 7:
                                String I;
                                System.out.println("Enter Your String :");
                                I=input3.nextLine();
                                d.EmptyString(I);
                                System.out.println("\n");
                                break;
                            case 8:
                                System.out.println("\nExit Program\n\n");
                                break;
                            default:
                                System.out.println("Invalid Input");
                                break;
                        }

                    } while (decide2 != 8);
                    break;
                case 5:
                    System.out.println("Program Closed!");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;

            }

        } while (decide != 5);

    }

}
