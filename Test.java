import java.util.Scanner;

public class Test {
    // 选择题

    public static void main1(String[] args) {
        int num = 10;
        System.out.println(test(num)); // 30
    }

    private static int test(int num) {
        try {
            num += 10;
            return num;
        } catch (RuntimeException e1) {

        } catch (Exception e2) {

        } finally {
            num += 10;
            return num;
        }
    }

    public static void main3(String[] args) {
        boolean b = true ? false : true == true ? false : true;
        System.out.println(b);// false
    }
}

class HelloA {
    public HelloA() {
        System.out.println("HelloA");
    }
    static {
        System.out.println("static A");
    }
}
class HelloB extends HelloA {
    public HelloB() {
        System.out.println("HelloB");
    }

    static {
        System.out.println("static B");
    }

    public static void main2(String[] args) {
        new HelloB();
    }
}

class TestCoode {
    // 编程题

    public static void main4(String[] args) {
        // A, B, C三个人是好朋友, 每个人手里都有一些糖果, 我们不知道他们每个人手上具体有多少个糖果, 但是我们知道以下的信息：
        // A - B, B - C, A + B, B + C 这四个数值.每个字母代表每个人所拥有的糖果数.
        // 现在需要通过这四个数值计算出每个人手里有多少个糖果, 即 A, B, C (这里保证最多只有一组 整数  A, B, C满足所有题设条件)

        // 输入为一行，一共 4 个整数，分别为 A - B，B - C，A + B，B + C，用空格隔开
        // 范围均在-30到30之间(闭区间)
        // 输出为一行，如果存在满足的整数 A，B，C 则按顺序输出 A，B，C，用空格隔开，行末无空格
        // 如果不存在这样的整数 A，B，C，则输出 No

        // 输入: 1 -2 3 4
        // 输出: 2 1 3

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int A = (a + c) / 2;
        int B = (b + d) / 2;
        int C = (d - b) / 2;

        if ((a != A - B) || (b != B - C) || (c != A + B) || (d != B + C) ) {
            // 判断是否存在 A B C 是难点
            System.out.println("No");
        } else {
            System.out.print(A + " " + B + " " + C);
        }
    }

    public static void main(String[] args) {
        // 输入 n 个整数，输出出现次数大于等于数组长度一半的数.

        // 每个测试输入包含 n 个空格分割的 n 个整数，n 不超过 100，
        // 其中有一个整数出现次数大于等于n/2
        // 输出出现次数大于等于n/2的数

        //输入 3 9 3 2 5 6 7 3 2 3 3 3
        //输出 3
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        // str.split(String regex); 将此字符串分割为给定的 regular expression的匹配
        // str.split(" "); 将字符数组中的空格去掉
        int[] arr = new int[s.length];
        //将字符数组转为 Integer 类型的数组

        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
            // Interger.parseInt(String s);
            // 将字符串参数解析为带符号的十进制整数
        }

        int len = arr.length / 2;
        int[] array = new int[100];
        // 定义一个容量为100的数组，然后遍历arr数组，
        // 将arr里面的数值与a的下标对应，如果相同，就将a里面的值++；
        // 最后遍历a数组，找到满足条件的数字，将其打印出来。
        for (int cur = 0; cur < arr.length; cur++) {
            for (int bound = 0; bound < array.length; bound++) {
                if (arr[cur] == bound) {
                    array[bound]++;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= len) {
                max = i;
            }
        }
        System.out.println(max);
    }
}