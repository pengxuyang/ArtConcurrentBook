package chapter01;

/**
 * 并发和单线程执行测试
 * 
 * @author tengfei.fangtf
 * @version $Id: ConcurrencyTest.java, v 0.1 2014-7-18 下午10:03:31 tengfei.fangtf Exp $
 */
public class Test1 {

    /** 执行次数 */
    private static final long count = 10000l;

    public static void main(String[] args) throws InterruptedException {
        int i = 1;
        System.out.println(i);
        i = i << 4;
        System.out.println(i);

    }
}
