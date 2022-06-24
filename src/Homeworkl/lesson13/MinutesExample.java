package Homeworkl.lesson13;

public class MinutesExample {
    long convert(int minutes) {
        return minutes * 60;
    }

    int calcage(int years) {
        return years * 365;
    }

    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else
            return false;
    }
    boolean lessThanOrEqualToZero(int number){
        if (number<1)
            return true;
        else
        return false;
    }
    boolean reverseboolean(boolean value){
        return !value;
    }
    int maxlength (int[]array,int [] array2){
        if (array.length> array2.length)
            return array.length;
        else
            return array2.length;
    }
}
