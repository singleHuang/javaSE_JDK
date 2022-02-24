package com.wh.javaSE;

/**
 * @author HuangJw
 * @ClassName: StringSubAndSelect
 * @Description: 测试string类型的截取及查询
 * @create 2022-02-16 21:16
 * @Version 1.0
 */
public class StringSubAndSelect {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(t.charAt(1));
        int[] ta = new int[128];
        System.out.println(ta[t.charAt(1)]);
        System.out.println(stringSubAndSelect(s ,t));
    }
    /***
     *功能描述: 查询string类型数据，并截取对应字符
     * @param s 原始字符串
     * @param t 匹配字符串
     * @return {@link String}
     * @Author HuangJw
     * @date 2022/2/16 21:41
     */
    public static String stringSubAndSelect(String s, String t) {
        //创建int数组ta 长度定为128，并默认每个元素都为0
        int[] ta = new int[128];
        //创建int数组sa 长度定为128 并默认每个元素都为0
        int[] sa = new int[128];
        int min = Integer.MAX_VALUE;
        String minStr = "";
        // 循环字符串t的每个字符，并设置ta数组对应的值为1
        for (int i = 0; i < t.length(); i++) {
            ta[t.charAt(i)]++; //根据i值 遍历t中所有的字符 ，并根据字符对应的char转换成对应的int类型，作为后续判断的标准，对于其后一位数则赋值为1，比如t.chartAt(0)=A; char类型的A 转换为int时值为65;  即ta[65]默认为0; ta[65]++ 为1
        }
        int count = 0;
        int end = 0;
        int start = 0;
        while (end < s.length()) { //循环遍历所有的s的字符
            if (ta[s.charAt(end)] != 0) {
                if (sa[s.charAt(end)] < ta[s.charAt(end)]) {
                    count++;
                }
                sa[s.charAt(end)]++;
            }
            if (count == t.length()) {
                while (ta[s.charAt(start)] == 0 || sa[s.charAt(start)] > ta[s.charAt(start)]) {
                    if (sa[s.charAt(start)] > ta[s.charAt(start)]) {
                        sa[s.charAt(start)]--;
                    }
                    start++;
                }
                if (end - start + 1 < min) {
                    minStr = s.substring(start, end + 1);
                    min = end - start + 1;
                }
            }
            end++;
        }
        return minStr;
    }
}
