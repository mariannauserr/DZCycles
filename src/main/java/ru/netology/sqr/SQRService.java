
package ru.netology.sqr;

public class SQRService {
    public int calculate(int min, int max) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            int i2 = i * i;
            //System.out.println("Число: " + i + " Квадрат: " + i2);
            if (i2 >= min && i2 <= max) {
                // System.out.println("Число: " + i + " Квадрат: " + i2);
                count++;
                return count;
            }
        }
        return count;
    }
}

