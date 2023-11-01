package Laba3;

import java.util.ArrayList;
import java.util.List;

public class Laba3 {
    public static void var7(){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            numbers.add(i);
        }
        while (numbers.size() > 1){
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < numbers.size() - 1; i+=2){
                temp.add(numbers.get(i) + numbers.get(i+1));
            }
            if (numbers.size() % 2 == 1){
                temp.add(numbers.get(numbers.size() - 1));
            }
            numbers = temp;

        }
        System.out.println(numbers);
    }
}
