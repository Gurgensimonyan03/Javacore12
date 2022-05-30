package Homeworkl.Lesson12;

public class boxdemo4 {
    public static void main(String[] args) {

        box mybox1 = new box();
        box mybox2 = new box();
        double vol;
        mybox1.width = 4;
        mybox1.height = 20;
        mybox1.depth = 30;

        mybox2.depth = 12;
        mybox2.height = 15;
        mybox2.width = 9;
        vol = mybox1.volume();
        System.out.println("Oбъeм = " + vol);
        vol = mybox2.volume();
        System.out.println("Oбъeм " + vol);
    }
}
