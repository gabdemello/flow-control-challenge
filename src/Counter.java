import infra.InvalidParametersException;

import java.util.Timer;
import java.util.TimerTask;

public class Counter {

    private Integer parameterOne;
    private Integer parameterTwo;

    public Counter(int parameterOne, int parameterTwo){
        this.parameterOne = parameterOne;
        this.parameterTwo = parameterTwo;
    }

    public void count() throws InvalidParametersException {
        if(parameterOne > parameterTwo){
            throw new InvalidParametersException();
        }

        Timer timer = new Timer();

        var count = parameterTwo - parameterOne;

        System.out.println("Contando...");

        for (int i = 1; i <= count; i++) {

            var currentCount = i;

            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println(currentCount);
                }
            }, i * 1000);
        }
    }



}
