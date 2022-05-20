package Homeworkl.ArrayUtil;

public class CharArrayExample {

    public static void main(String[] args) {
        char c = 'o';
        //քանի հատ c ունենկ
       int qanak = 0;
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        int quantity = 0;
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == 'c') {
                qanak++;
            }


        }
        System.out.println("c =  " + qanak);
        //մեջտեղի 2 սինվոլները։
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        int chars2length = 0;
        for (int i = 0; i < chars2.length; i++) {
            chars2length++;

        }
        int a = chars2length / 2;
        int b = chars2length / 2 - 1;
        System.out.print(chars2[a] + " ");
        System.out.println(chars2[b]);

 /*    char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};

        int point = 8;

        if (chars3[chars3.length-1]=='y'{
            System.out.println("true");
        }
*/

//չտպել պռաբելները
        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
         char space = ' ';
        for (int i = 0; i < text.length; i++) {
            if(space == text[i]);
            else System.out.print(text[i]);
        }


        }

    }


