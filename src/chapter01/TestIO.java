package chapter01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 并发和单线程执行测试
 * 
 * @author tengfei.fangtf
 * @version $Id: ConcurrencyTest.java, v 0.1 2014-7-18 下午10:03:31 tengfei.fangtf Exp $
 */
public class TestIO {

    /** 执行次数 */
    private static final long count = 10000l;

    public static void main(String[] args) throws InterruptedException, IOException {
//        int i = 1;
//        System.out.println(i);
//        i = i << 4;
//        System.out.println(i);

        PrintWriter out = null;
        BufferedReader br = null;
        try{
            System.out.println("请输入:");
            out = new PrintWriter(System.out, true);
            br = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.equals("exit")) {
                    System.exit(1);
                }
                out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            out.close();
            br.close();
        }

    }
}
