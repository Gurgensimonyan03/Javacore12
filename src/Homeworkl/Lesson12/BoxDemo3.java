package Homeworkl.Lesson12;

public class BoxDemo3 {
    public static void main(String[] args) {
        box mybox1 = new box();
        box mybox2 =new box();
        mybox1.depth = 10;
        mybox1.height = 20;
        mybox1.width = 30;

        mybox2.depth = 3;
        mybox2.height = 6;
        mybox2.width = 12;
        mybox1.volume();

        mybox2.volume();
    }
}
