package Homeworkl.lesson13;

public class ArrayUtil2 {
   public int max(int[]array){
       int max = array[0];
    for (int i = 0; i < array.length; i++) {
        if (array[i] > max)
            max = array[i];
    }
    return max;}

int min (int[]array){
    int min = array[0];
    for (int i = 0; i < array.length; i++) {
        if (array[i] < min)
            min = array[i];

    }
    return min;
}
}
