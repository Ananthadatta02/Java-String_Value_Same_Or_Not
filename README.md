
# String Value Same or Not

## Description
This Java program compares two user-input strings and swaps them if they are not the same. It then prints the values of both strings. The program demonstrates basic string comparison using the `equals()` method and shows how to swap string values using a temporary variable.

## Features
- Takes two string inputs from the user.
- Compares the two strings using `.equals()` method.
- Swaps the values of the strings if they are not equal.
- Prints the final values of both strings.

## Code Explanation

```
package test_27_03_25;

import java.util.Scanner;

public class StringValueSameOrNot 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First String");
        String st1 = s.next();
        System.out.println("Enter the Second String");
        String st2 = s.next();
        
        // Check if the strings are not equal
        if(!(st1.equals(st2)))
        {
            // Swap the string values
            String temp = st1;
            st1 = st2;
            st2 = temp;
        }

        // Print the final values
        System.out.println(st1);
        System.out.println(st2);
    }
}
```

### Step-by-Step Breakdown
1. **Import Scanner Class**: Required for taking input from the user.
2. **Create Scanner Object**: `Scanner s = new Scanner(System.in);` initializes the scanner to read input.
3. **Read Two Strings**: The user is prompted to input two strings which are stored in `st1` and `st2`.
4. **Compare Strings**: The program checks if the strings are not equal using `!(st1.equals(st2))`.
5. **Swap Values (if needed)**: If the strings differ, it uses a temporary variable `temp` to swap the values of `st1` and `st2`.
6. **Print Results**: Finally, the (possibly swapped) values of the strings are printed.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-String_Value_Same_Or_Not.git
```
