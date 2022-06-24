package Homeworkl.lesson13;

public class StackExampleTest {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        for (int i = 0; i <10 ; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i <101 ; i++) {
            System.out.println(mystack1.pop());
        }
    }
}
