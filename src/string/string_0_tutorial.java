package string;

public class string_0_tutorial {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));

        String s = "a,b,c,d,e,f,g";

        //upper
        System.out.println(s.toUpperCase());
        System.out.println("lower: " + 'a' + "upper" + Character.toUpperCase('a'));

        // todo convert string to int
        String ints = "123";
        System.out.println("string => int:  " + Integer.parseInt(ints));

        //todo string to char array
        char[] chars = s.toCharArray();

        //todo string substring
        System.out.println("substring from 0 to 1: " + s.substring(0,2));
    }
}


/** Solution

TODO tutorial

 todo string 转 char array


 todo #数字转char
 char c = (char)('A' + 1); todo A => B


 todo 分割字符串
 String[] strs = path.split("/"); //
 tag: string_71_
 case: "/a"
 output : {"", "a"} // alert!! 会有""的存在

 split : "." "*" "|" , String[] v1s = version1.split("\\.");
 split : "\" , String[] v1s = version1.split("\\\\");


 todo trim
 去除两边空格

 todo int convert to string
 int res = Integer.parseInt("-1")

 todo string reverse
 case string_344_reverseString
 s = new StringBuffer(s).toString();
todo String 是不可改变指定字符的!!!

 todo。。

 */


