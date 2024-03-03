package answerpackage;

// We are importing the derivepackage, we will get error because the class we are trying to use has a default access modifier.

import derivepackage.*;

public class Final {
    public static void main(String args[]) {
        Subtraction obj = new Subtraction();

        // An error will occur because we are trying to access the default method in
        // another package

        obj.SubtractTwoNumbers(34, 7);
    }
}