package com.huangjw.javaSE;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author HuangJw
 * @ClassName: com.huangjw.javaSE.TestForJDK
 * @Description: TODD
 * @create 2022-01-03 22:08
 * @Version 1.0
 **/
public class TestForJDK {

    /**
     * 功能描述: 测试基础
     *
     * @param args
     * @return
     * @Author HuangJw
     * @date 2022/1/3 22:18
     */
    public static void main(String[] args) {
        String s = "你好，12342";
        String s1 = s.substring(0, 2);
        String s2 = s.substring(0, 3);
        System.out.println(s1);
        System.out.println(s2);

        /*************三元运算符*************/
        int a = 10;
        int b = 99; // 解读
        // 1.a>b 为 false
        // 2. 返回 b--, 先返回 b 的值,然后在 b-1
        // 3. 返回的结果是 99
        // 4. ++a跟a--的区别：++a是先将a进行+1处理再输出，a++是先输出再将a进行+1处理
        int result = a > b ? a++ : b--;  //一定是先返回变量，再对变量进行++，或者--
        System.out.println("result=" + result);
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        result = a > b ? ++a : --b;  //一定是先++或者--，再返回变量
        System.out.println("result=" + result);
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        boolean x =true;
        boolean y = false;
        short z = 46;
        if (z++ == 46 && (y = true)){
            z++;
        }
        if ((x=false) && (++z == 49)){
            z++;
        }
        System.out.println("z="+z);

        /*************键盘输入*************/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = scanner.next();//接收用户输入字符串
        System.out.println("请输入年龄");
        int age = scanner.nextInt(); //接收用户输入 int
        System.out.println("请输入薪水");
        double sal = scanner.nextDouble(); //接收用户输入 double
        System.out.println("人的信息如下:");
        System.out.println("名字=" + name
                + " 年龄=" + age + " 薪水=" + sal);

    }
}
