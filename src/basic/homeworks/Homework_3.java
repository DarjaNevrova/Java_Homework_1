package basic.homeworks;

import java.util.Random;

public class Homework_3 {

    //TASK_1
    public static void main(String[] args) {

        //TASK_1
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = isWeekend && !isRain;

        System.out.println(canWalk(true, false));

        //TASK_2
        System.out.println("Я могу купить еду, это " + canBuy(true, false));

        //TASK_3
        System.out.println(workCorrect(105, 200));

        //TASK_4_*

        Random random = new Random();

        int seconds = random.nextInt(0, 28800);
        int hours = getHours(seconds);

        System.out.println("Осталось " + seconds + " секунд");
        System.out.println("Осталось " + hours + " часов");

    }

    //TASK_1
    static boolean canWalk(boolean isWeekend, boolean isRain) {
        return isWeekend && !isRain;
    }

    //TASK_2

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {

        if (isEdekaOpen || isReweOpen) {
            return true;
        } else {
            return false;
        }
    }

    //TASK_3

    public static boolean workCorrect(int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 100) {
            return true;
        } else {
            return false;
        }
    }

    //TASK_4_*

    public static int getHours(int seconds) {
        return seconds / (60 * 60);
    }
}




