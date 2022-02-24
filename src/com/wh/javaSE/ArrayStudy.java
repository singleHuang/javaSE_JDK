package com.wh.javaSE;

import java.util.Scanner;

/**
 * @author HuangJw
 * @ClassName: com.huangjw.javaSE.ArrayStudy
 * @Description: 数组学习
 * @create 2022-01-15 22:46
 * @Version 1.0
 */
public class ArrayStudy {

    public static void main(String[] args) {
        arrayTest1();
        arrayTest2();
        arrayTest3();
        arrayTest4();
        arrayTest5();
        arrayTest6();
//       arrayTest7();
        arrayTest8();
        arrayTest9();
        arrayTest10();
        arrayTest11();
    }

    /**
     *功能描述: 一个养鸡场有 6 只鸡，它们的体重分别是 3kg,5kg,1kg,3.4kg,2kg,50kg 。请问这六只鸡的总体重是多少?平
     *          均体重是多少? 请你编一个程序。 Array01.jav
     * @param
     * @return
     * @Author HuangJw
     * @date 2022/1/15 22:48
     */
    private static void arrayTest1(){
        System.out.println("============数组测试1============");
        //定义一个数组
        double[] hens =  {3,5,1,3.4,2,50};
        double totalHens = 0;
        //遍历数组
        for (int i = 0; i < hens.length; i++) {
            totalHens += hens[i];
            System.out.println("第"+(i+1)+"只鸡的体重为："+hens[i]);
        }
        System.out.println("总体重："+totalHens);
        System.out.println("平均体重："+totalHens/hens.length);
    }

    /**
     * 功能描述:
     * @Param: [a, b]
     * @Date: 2022/2/18 22:08
     * @return: java.lang.String
     * @Author: HuangJw
     **/
    public static String test(String a, int b){return "";}

    /**
     *功能描述: 创建一个 char 类型的 26 个元素的数组，分别 放置'A'-'Z'。
     * 使用 for 循环访问所有元素并打印出来。
     * 提示：char 类型数据运算 'A'+2 -> 'C'
     * @param
     * @return
     * @Author HuangJw
     * @date 2022/1/15 23:14
     */
    private static void arrayTest2(){
        System.out.println("============数组测试2============");
        //创建char类型数组,定义长度
        char[] chars = new char[26];
        //给数组赋值
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('A'+i);
        }
        //循环输出该数组
        for (int i = 0; i < chars.length; i++) {
            System.out.println("第"+(i+1)+"个元素为："+chars[i]);
        }
    }

    /**
     *功能描述: 请求出一个数组 int[]的最大值
     * {4,-1,9, 10,23}，
     * 并得到对应的下标。
     * @param
     * @return
     * @Author HuangJw
     * @date 2022/1/15 23:14
     */
    private static void arrayTest3(){
        System.out.println("============数组测试3============");
        //创建int类型数组
        int[] nums = {4,-1,9, 10,23,2};
        //定义索引变量
        int b = 0;
        //遍历数组，先假设第一个元素为最大值
        int maxNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxNum){
                maxNum = nums[i];
                b = i;
            }
//            maxNum = nums[i] > maxNum?nums[i]:maxNum;
        }
        System.out.println("该数组中最大值为："+maxNum+"，其索引为："+ b);
    }

    /**
     *功能描述: 数组赋值机制
     * 基本数据类型赋值，这个值就是具体的数据，而且相互不影响（值拷贝）
     * 数组(引用类型)在默认情况下是引用传递，赋的值是地址（地址拷贝）
     * @param
     * @return
     * @Author HuangJw
     * @date 2022/1/15 23:14
     */
    private static void arrayTest4(){
        System.out.println("============数组测试4============");
        //基本数据类型
        int a = 1;
        int b = a;
        //改变b的值，不会影响a的变化
        b = 8;
        System.out.println("a的值为：" + a);
        System.out.println("b的值为：" + b);
        //引用类型
        int[] nums1 = {1,2,3};
        System.out.print("第一个数组nums1未改变前的值为：");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + ",");
        }
        System.out.println();
        int[] nums2 = nums1;
        //改变nums2的值，其实质是改变了其地址下的值，会影响到该地址的其他引用
        nums2[2] = 10;
        System.out.print("第一个数组nums1的值为：");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + ",");
        }
        System.out.println();
        System.out.print("第二个数组nums2的值为：");
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + ",");
        }
        System.out.println();
    }


    /**
     *功能描述: 实现数组拷贝(内容复制)
     * 将 int[] arr1 = {10,20,30}; 拷贝到 arr2 数组, 要求数据空间是独立
     * @param
     * @return
     * @Author HuangJw
     * @date 2022/1/15 23:14
     */
    private static void arrayTest5(){
        System.out.println("============数组测试5============");
        //定义数组1，并赋值
        int[] arr1 = {10,20,30};
        //定义数组2，并定义长度为arr1.length
        int[] arr2 = new int[arr1.length];
        //遍历数组1，并将数组1的值复制到数组2
        System.out.print("遍历数组1，输出结果为：");
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
            System.out.print(arr1[i] + ",");
        }
        System.out.println();
        //循环输出数组2的值
        System.out.print("复制数组1的值，遍历数组2，输出结果为：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");
        }
        System.out.println();
    }

    /**
     *功能描述:数组反转
     * 要求：把数组的元素内容反转
     * arr {11,22,33,44,55,66}
     * @param
     * @return
     * @Author HuangJw
     * @date 2022/1/15 23:14
     */
    private static void arrayTest6(){
        System.out.println("============数组测试6============");
        //定义数组1，并赋值
        int[] arr1 = {11,22,33,44,55,66};
        //定义数组2，并赋值
        int[] arr2 = new int[arr1.length];
        //反转数组1，并赋值给数组2
        System.out.print("数组1的元素有：");
        for (int i = 1; i <= arr1.length; i++) {
            arr2[arr1.length - i] = arr1[i-1];
            System.out.print(arr1[i-1] + ",");
        }
        System.out.println();
        //遍历数组2的值
        System.out.print("数组2的元素有：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");

        }
        System.out.println();
    }

    /**
     *功能描述:数组添加/扩容
     * 要求：实现动态的给数组添加元素效果，实现对数组扩容。ArrayAdd.java
     * 1) 原始数组使用静态分配 int[] arr = {1,2,3}
     * 2) 增加的元素 4，直接放在数组的最后 arr = {1,2,3,4}
     * 3) 用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
     * @param
     * @return
     * @Author HuangJw
     * @date 2022/1/15 23:14
     */
    private static void arrayTest7(){
        System.out.println("============数组测试7============");
        //定义初始数组，并赋值
        int[] arrOld = {1,2,3};
        System.out.print("原始数组元素为：");
        for (int i = 0; i < arrOld.length; i++) {
            System.out.print(arrOld[i] + ",");
        }
        System.out.println();
        String s = "y";
        int[] arrNew = null;
        do {
            System.out.println("是否需要添加元素？y/n");
            Scanner myScanner = new Scanner(System.in);
            s = myScanner.next();
            if ("y".equalsIgnoreCase(s)) {
                System.out.println("请输入你需要添加元素的个数：");
                int num = myScanner.nextInt();
                if (num != 0) {
                    int[] arrTemp = new int[num];
                    for (int i = 0; i < num; i++) {
                        System.out.println("请输入你需要添加的第" + (i + 1) + "个元素：");
                        int anInt = myScanner.nextInt();
                        arrTemp[i] = anInt;
                    }
                    System.out.println("定义新增元素操作结束！");
                    //新建数组，长度为初始数组长度加上添加元素的个数
                    arrNew = new int[arrOld.length + num];
                    //定义新数组的元素
                    for (int i = 0; i < arrOld.length; i++) {
                        arrNew[i] = arrOld[i];
                    }
                    for (int i = 0; i < arrTemp.length; i++) {
                        arrNew[(arrOld.length+i)] = arrTemp[i];
                    }
                    //更新初始数组
                    arrOld = arrNew;
                    //遍历新数组
                    System.out.println("新增后的数组元素为：");
                    for (int i = 0; i < arrNew.length; i++) {
                        System.out.print(arrNew[i]);
                    }
                    System.out.println();
                }else {
                    System.out.println("添加元素结束！");
                    break;
                }
            }else if ("n".equalsIgnoreCase(s)){
                System.out.println("添加元素结束！");
                break;
            } else {
                System.out.println("输入不合法，请重新输入！");
            }
        }while (true);
    }

    /**
     *功能描述: 冒泡排序
     *  冒泡排序（Bubble Sorting）的基本思想是：
     *  通过对待排序序列从后向前（从下标较大的元素开始），依次比较相邻元素的值，
     *  若发现逆序则交换，使值较大的元素逐渐从前移向后部，就象水底下的气泡一样逐渐向上冒
     * @param
     * @return
     * @Author HuangJw
     * @date 2022/1/16 0:48
     */
    private static void arrayTest8(){
        System.out.println("============数组测试8============");
        //定义数组变量
        int[] arrNum = {24,69,80,57,13};
        System.out.print("排序前的数组元素为：");
        //遍历排序后的值
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i] + ",");
        }
        //定义辅助变量，用于辅助交换
        int temp = 0;

        for (int i = 0; i < arrNum.length -1 ; i++) { //最后一位不用比较
            for (int j = 0; j < arrNum.length - i - 1; j++) { //已比较的数就不用比了
                //跟后面相邻的值进行比较
                if (arrNum[j] > arrNum[j+1]){ //如果前一位大于后一位
                    temp = arrNum[j]; //将前一位的值赋值给辅助变量
                    arrNum[j] = arrNum[j+1]; //将后一位的值赋值给前一位
                    arrNum[j+1] = temp; //将辅助变量的值赋值给后一位
                }
            }
        }
        System.out.println();
        System.out.print("排序后的数组元素为：");
        //遍历排序后的值
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i] + ",");
        }
        System.out.println();
    }

    /***
     *功能描述: 二维函数
     *  定义方式： int[][] dimensionalArray = new int[1][2]
     *            int[] dimensionalArray[] = new int[2][2]
     *      *  二维函数（Two Dimensional Array）的基本思想是：原来的一维数组的每个元素是一维数组, 就构成二维数组
     *      *   使用二维数组打印一个 10 行杨辉三角
     * 规律
     * 1.第一行有 1 个元素, 第 n 行有 n 个元素
     * 2. 每一行的第一个元素和最后一个元素都是 1
     * 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素的值. arr[i][j]
     * arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; //必须找到这个规律
     * 比如：
     *  1
     *  1  1
     *  1  2  1
     *  1  3  3  1
     *  1  4  6  4  1
     *  1  5 10 10  5  1
     * @param
     * @return
     * @Author HuangJw
     * @date 2022/2/8 19:37
     */
    private static void arrayTest9(){
        System.out.println("============数组测试9============");
        int[][] yangHui = new int[12][];
        for (int i = 0; i < yangHui.length; i++) {
            //给每个一维数组（行）开辟空间 其中i表示多少行
            yangHui[i] = new int[i+1];
            //给每个一维数组（行）赋值
            for (int j = 0; j < yangHui[i].length; j++) {
                //每一行的第一个元素和最后一个元素都是 1 其中j表示多少列
                if (j == 0 || j == yangHui[i].length-1){
                    yangHui[i][j] = 1;
                }else {
                    yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
                }
            }
        }
        //输出杨辉三角
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "\t");
            }
            //换行
            System.out.println();
        }
    }

    /***
     *功能描述: 数组升序及插入
     * 描述：已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，
     * 比如：[10,12,45,90] 添加23后，数组为[10,12,23,45,90]
     * @param
     * @return
     * @Author HuangJw
     * @date 2022/2/8 20:03
     */
    private static void arrayTest10(){
        System.out.println("============数组测试10============");
        //思路：本质为扩容 + 定位
        //1：先确定所插入的数是在哪个索引位
        //2：然后复制扩容
        //先定义初始数组
        int[] arrOld = {10,12,45,90};
        int insertNum = 46;
        int index = -1; //定义插入的索引位
        //遍历arrOld数组，如果发现insertNum <= arr[i],说明i就是要插入的位置
        //使用index 保留index = i;
        //如果遍历完后，没有发现insertNum <= arrOld[i],说明index = arrOld.length,即添加到数组的最后
        for (int i = 0; i < arrOld.length; i++) {
            //查找要插入的位置
            if (insertNum <= arrOld[i]){
                index = i;
                break;
            }
        }
        //判断index的值，是否查找到合适位置
        if (-1 == index){
            index = arrOld.length;
        }
        //扩容，创建新的数组
        int[] arrNew = new int[arrOld.length+1];
        //拷贝
        for (int i = 0,j = 0; i < arrNew.length; i++) {
            //判断index ,是否可以拷贝
            if (i != index){
                arrNew[i] = arrOld[j];
                j++;
            }else { //否则就赋值插入的数
                arrNew[i] = insertNum;
            }
        }
        arrOld = arrNew;
        //遍历数组
        for (int i = 0; i < arrOld.length; i++) {
            System.out.print(arrOld[i] + "\t");
        }
        System.out.println();
    }

    /***
     *功能描述: 随机数，倒序，平均值，最大值，最小值，查找元素位置
     * 描述：随机生成10个整数（1-100）保存到数组
     *      并倒序打印，以及求平均值，最大值和最小值的下标
     *      并查找里面是否有8，如果有则给出其位置索引，否则提示信息
     * @param
     * @return
     * @Author HuangJw
     * @date 2022/2/8 20:30
     */
    private static void arrayTest11(){
        System.out.println("============数组测试11============");
        //初始化数组
        int[] arr = new int[10];
        //借助(int)(Math.random()*100)+1 生成随机数 1-100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100) + 1;
        }
        System.out.print("arr数组元素情况：");
        int maxNum = 0;
        int minNum = 0;
        int sumNum = 0;
        int average = 0;
        int flag = -1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            //求最大值
            if (arr[i] >= maxNum){
                maxNum = arr[i];
            }
            //求最小值
            if (i == 0) {
                minNum = arr[i]; //默认最小值为第一个元素
            }else if(arr[i] <= minNum){
                minNum = arr[i];
            }
            //求和
            sumNum += arr[i];
            //查找是否含有8
            if (arr[i] == 8){
                flag = i;
            }
        }
        //求平均值
        average = sumNum/arr.length;
        System.out.println("\n"+"其最大值为："+maxNum);
        System.out.println("其最小值为："+minNum);
        System.out.println("其平均值为："+average);
        if (flag == -1){
            System.out.println("该数组中不存在8！");
        }else{
            System.out.println("该数组中包含8元素，其位置索引为：" + flag);
        }
        //排序（降序）
        /*方式1：冒泡排序 ——将数组中的相邻两个元素进行比较，将比较大（较小）的数通过
        两两比较，移动到数组末尾（开始），执行一遍内层循环，确定一个最大数（最小数），
        外层循环从数组末尾(开始)遍历到开始(末尾)
        */
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("冒泡排序后的结果：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        /*方式2：选择排序 ——找到数组元素中最小的数，放置在第一个位置（最后一个位置），找到数组剩余元素中
        最小的数，放置在第二个位置（倒数第二个位置），依次循环……
        */
        temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[minIndex]){
                    minIndex = j;
                }
                if (i !=minIndex){
                    temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.print("\n"+"选择排序后的结果：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        /*方式3：插入排序 ——取出第一个元素，依次跟数组中其它元素对比，小的往左（往右放），
        大的往左放（往右放）
        */
        temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (arr[j] > arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.print("\n"+"插入排序后的结果：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        /*方式4：快速排序 ——将数组元素划分成两部分，小的放置在左边（右边），大的放置在右边（左边）
        再对左右两部分进行划分（小的左边（右边），大的右边（左边）），依次进行下去……
        */
        System.out.print("\n"+"快速排序后的结果：");
        quickSort(arr,0, arr.length-1);
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }

    /***
     *功能描述: 快速排序法1
     * @param arr 原数组
     * @param left 数组前指针
     * @param right 数组后指针
     * @return
     * @Author HuangJw
     * @date 2022/2/8 21:46
     */
    private static void quickSort(int[] arr, int left, int right){
        if (left >= right){
//            System.out.println("该数组只有一个元素，无需排序！");
            return;
        }
        //设置最左边的元素为基准值
        int key = arr[left];
        //数组中比key小的放在左边（右边），比key大的放在右边（左边）,key值下标为i
        int i = left;
        int j = right;
        while (i<j){
            //j向左移，直到遇到比key小的值
            while (arr[j] <= key && i < j){ //如果是升序 则while (arr[j] >= key && i < j)
                j--;
            }
            //i向右移，直到遇到比key大的值
            while (arr[i] >= key && i > j){ //如果是升序 则while (arr[j] <= key && i < j)
                i++;
            }
            //i和j指向元素交换
            if (i>j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[left] = arr[i];
        arr[i] = key;
        quickSort(arr,left, i-1);
        quickSort(arr,i+1, right);
    }
}
