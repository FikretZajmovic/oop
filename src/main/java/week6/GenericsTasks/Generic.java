package week6.GenericsTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Generic <N>{
    private N value;
    public Generic()
    {
        this.value = value;
    }
    public <N extends Number> void sumEvenOdd(List<N> numbers)
    {
        double evenSum = 0;
        double oddSum = 0;
        for(N number : numbers)
        {
            if(number.doubleValue() % 2 == 0)
            {
                evenSum += number.doubleValue();
            }
            else {
                oddSum += number.doubleValue();
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
    public <N> List<N> newList(List<N> list)
    {
        List<N> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }
}
