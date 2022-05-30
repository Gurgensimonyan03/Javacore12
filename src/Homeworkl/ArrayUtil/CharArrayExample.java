package Homeworkl.ArrayUtil;

public class CharArrayExample {

    public static void main(String[] args) {
        char c = 'o';
        //քանի հատ c ունենկ
        int count = 0;
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        int quantity = 0;
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == c) {
                count++;
            }


        }
        System.out.println("c =  " + count);
        //մեջտեղի 2 սինվոլները։
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        int chars2length = 0;

       // int a = chars2.length / 2;
        int b = chars2.length / 2 - 1;
       // System.out.print(chars2[a] + " ");
        System.out.println(chars2[b]);

    char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
char a =chars3[chars3.length-1];

        //if (){
          //  System.out.println("true");
        //}


//չտպել պռաբելները
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char space = ' ';
        for (int i = 0; i < text.length; i++) {
            if (space == text[i]) ;
            else System.out.print(text[i]);
        }


    }

}


