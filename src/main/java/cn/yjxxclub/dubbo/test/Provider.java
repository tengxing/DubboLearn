package cn.yjxxclub.dubbo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-10-19
 * Time: 上午11:56
 * Describe: 生产者
 */
public class Provider
{
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath*:dubbo/dubbo-provider.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }
}
