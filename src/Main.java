import infra.InvalidParametersException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        var parameterOne = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        var parameterTwo = scanner.nextInt();

        Counter counter = new Counter(parameterOne, parameterTwo);

        try {
            counter.count();
        }
        catch (InvalidParametersException exception){
            System.err.println(exception);
        }

    }
}