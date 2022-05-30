package Homeworkl.Lesson12;

public class boxdemo5 {
    public static void main(String[] args) {

    box mybox1 = new box();
    box mybox2 = new box();
    double vol;
    mybox1.setDim(10,20,3);
    mybox2.setDim(2,14,9);
    vol = mybox1.volume();
        System.out.println(vol);
    vol = mybox2.volume();
        System.out.println(vol);
}
}
