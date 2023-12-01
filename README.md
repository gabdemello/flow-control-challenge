# Flow Control - Challenge
</br>

Let's put into practice all the content presented in the Flow Control module by coding the following scenario.
</br>

The system should receive two parameters via the terminal, representing two integers. With these two numbers, you should determine the number of iterations (`for`) and print on the console (`System.out.print`) the incremented numbers, for example:

- If you input the numbers 12 and 30, we'll have a loop (`for`) with 18 occurrences to print the numbers, for instance: "Printing number 1", "Printing number 2," and so on.
- If the first parameter is GREATER than the second parameter, you should throw a custom exception called `ParametrosInvalidosException` with the following message: "The second parameter must be greater than the first."
</br>

## Challenge Steps:

1. Create the project `FlowControlChallenge`.
2. Within the project, create the class `Counter.java` to perform all the coding for our program.
3. Within the project, create the class `ParametrosInvalidosException` that will represent the business exception in the system.
</br>

Here is an outline of the code to guide development:

```java
public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter the first parameter");
        int parameterOne = terminal.nextInt();
        System.out.println("Enter the second parameter");
        int parameterTwo = terminal.nextInt();
        
        try {
            // Calling the method containing the counting logic
            count(parameterOne, parameterTwo);
        } catch (ParametrosInvalidosException exception) {
            // Print the message: The second parameter must be greater than the first
            System.out.println(exception.getMessage());
        }
    }
    
    static void count(int parameterOne, int parameterTwo ) throws ParametrosInvalidosException {
        // Validate if parameterOne is GREATER than parameterTwo and throw the exception
        if (parameterOne > parameterTwo) {
            throw new ParametrosInvalidosException("The second parameter must be greater than the first");
        }
        
        int count = parameterTwo - parameterOne;
        // Perform the for loop to print the numbers based on the count variable
        for (int i = 1; i <= count; i++) {
            System.out.println("Printing number " + i);
        }
    }
}
