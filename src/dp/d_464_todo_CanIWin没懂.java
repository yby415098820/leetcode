package dp;

public class d_464_todo_CanIWin没懂 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        //System.out.println(a_18_4Sum.fourSum(nums, 0));
        for (int i = 3; i < 1000; i++) {
            System.out.println(canIWin(3, i));
        }

    }


    public static boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        boolean[] dp = new boolean[desiredTotal + 1];
        for (int i = 1; i < dp.length; i++) {
            if (i <= maxChoosableInteger) dp[i] = true;
            else {
                boolean res = false;
                for (int j = 1; j <= maxChoosableInteger; j++) {
                    res |= !dp[i - j];
                }
                dp[i] = res;
            }
        }
        return dp[desiredTotal];
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
 *
 *
 参考网站

 TODO solotion
 ######s1######
 --performance
 time:
 space:

 --data structure

 --steps



 ######s2######
 --performance
 time:
 space:

 --data structure

 --steps

 ######sFinal######

 TODO case

 TODO bug

 bug1
 bug2
 bug3
 */

/*
TODO tutorial
 dp指代 , 一共分2种情况
  1、dp[n]代表着最优解解 和
  2、max{dp[1],,,dp[n]} 为最优解 其中dp[i] 代表着end with x[i] 时的解

 dp解空间, 大概也分2种
  1、 dp = max{dp[n-1], dp[n-2]}
  2、 dp = max {
        dp[j1]
        dp[j2]    // under some condition
        ....
  }

 */
