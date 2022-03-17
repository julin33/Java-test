package commonclass.stringclass;


/*
 已知String str = "this is a text";
1. 将str中的单词单独或取出来
2. 将str中的text替换为practice
3. 在text前面插入一个easy
4. 将每个单词的首字母改为大写
 */
public class Demo2 {
    public static void main(String[] args) {
        String str = "this is a text";
        //1.
        String[] arr = str.split(" ");
        for (String string:arr) {
            System.out.println(string);
        }
        //2.
        System.out.println(str.replace("text","practice"));
        //3.
        System.out.println(str.replace("text","easy text"));
        //4.


        for (int i = 0; i < arr.length; i++) {

            char first = arr[i].charAt(0);
            char firstUpper = Character.toUpperCase(first);
            System.out.println(arr[i].replace(first, firstUpper));
        }



    }
}
