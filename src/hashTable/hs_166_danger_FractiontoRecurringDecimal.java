package hashTable;

import java.util.*;

//
// todo 得到了思路 建议背下 (本题 1/6 为 0.166666.. (余数:位置 => 1:1, 4:6, 4:6.。。))
// todo bug 1 case 1/6, 不一定是 0.(1321) 这种, 也可以是 0.1(6) 这种
// todo bug 2 case (可以先不考虑 long intmax )
public class hs_166_danger_FractiontoRecurringDecimal {
    public static void main(String[] args) {
        // todo bug case
        System.out.println(fractionToDecimal1(1,6));

        System.out.println(fractionToDecimal1(1, Integer.MAX_VALUE));

        // normal
        System.out.println(fractionToDecimal1(0,1));
        System.out.println(fractionToDecimal1(20,1));
        System.out.println(fractionToDecimal1(2,3));

    }


    public static String fractionToDecimal1(int numerator, int denominator) {
        String flag = (long) numerator * (long) denominator < 0 ? "-" : "";
        long numerator1 = Math.abs((long)numerator);
        long denominator1 = Math.abs((long)denominator);

        String res = flag, tmp = "";
        int a = (int) (numerator1 / denominator1);
        long b = numerator1 % denominator1;
        res += a;

        HashMap<Long, Integer> map = new HashMap<>(); // int, index
        while (b != 0) {
            a = (int) (b * 10 / denominator1); // 商
            if (map.containsKey(b)) {
                int end = map.get(b);
                String s1 = tmp.substring(0, end);
                String s2 = tmp.substring(end);
                return res + "." + s1 + "(" + s2 + ")";
            } else {
                map.put(b, tmp.length());
                tmp += a;
            }

            b = b * 10 % denominator1; // 余数
        }
        if (tmp.length() != 0) res = res + "." + tmp;
        return res;
    }









    public static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        if (denominator == 0) return "";
        long num = numerator, den = denominator;
        String flag = num * den < 0 ? "-" : ""; //todo bug1
        num = Math.abs(num);
        den = Math.abs(den);

        //整除
        if (num % den == 0) return flag + num / den;

        long res = num / den; // todo bug3
        long rem = num % den * 10;
        String mapStr = "";
        HashMap<Long, Integer> map = new HashMap<>();

        while(rem != 0) {
            if (map.containsKey(rem)){
                String repeatStr = mapStr.substring(map.get(rem));
                String unrepeatStr = mapStr.substring(0, map.get(rem));
                return flag + res + "." + unrepeatStr + "(" + repeatStr + ")";
            } else {
                map.put(rem, mapStr.length());
                mapStr += rem / den;
                rem = rem % den * 10;
            }
        }
        return flag + res + "." + mapStr;
    }
}
/** 题
 *
 * http:
 *


 */

/** Solution
 * 时间  空间
 *
 Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

 If the fractional part is repeating, enclose the repeating part in parentheses. // todo fractional 分数

 For example,

 Given numerator = 1, denominator = 2, return "0.5".  // todo 分子 分母
 Given numerator = 2, denominator = 1, return "2".
 Given numerator = 2, denominator = 3, return "0.(6)".


 TODO solotion

 http://blog.csdn.net/ljiabin/article/details/42025037

 数学原理, 当余数重复时, 也就意味着 余数 * 10 即下一次的被除数是重复的, 自然就进入了repeating
 1. 将 input 转为 long
 2.
 不停相除, 知道余数为0 , 或者产生余数循环
 {
    num, den 被除数 除数
    res : 存每次相除的商数
    rem : 存当次的余数 * 10, 即下次的被除数
    ans : 答案
    map: key=> rem , value=> 小数位数 ?
 }


 示例：1/13=0.076923076923076923...，当小数部分第二次出现0时，就意味着开始了循环，那么需要把076923用括号括起来，结果为0.(076923)。

 难点 怎么处理循环问题  1/7 这种
  map 存每位
 当最后一个存的不是0时, 开始比较 并 维护一个判断的index



 TODO case

 1,6
 output 0.(16)
 expected 0.1(6)
 TODO bug

 bug1
要考虑正负
 且 需要转换为long, Math.INT_MAX

 bug2

 input: 1,6
 output 0.(16)
 expected 0.1(6)


 bug3
 input: 1,-6
 output 0.1(6)
 expected -0.1(6)
 cause: 0 * -1 = 0

 */

/*
TODO tutorial


 */
