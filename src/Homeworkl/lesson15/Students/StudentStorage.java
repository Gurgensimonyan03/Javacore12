package Homeworkl.lesson15.Students;

public class StudentStorage {
  private   Student[] array = new Student[10];
  private   int size = 0;
   public void add (Student student){
        if(size == array.length){
            increaseArray();
        }
        array[size++] = student;
    }

    private void increaseArray() {
        Student[]temp = new Student[array.length+10];
        for (int i = 0; i < size; i++) {
            temp[i]= array[i];
        }
        array = temp;

    }
    public int getsize(){
        return size;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }

    }
}
