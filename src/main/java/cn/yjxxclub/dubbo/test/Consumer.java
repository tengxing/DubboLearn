package cn.yjxxclub.dubbo.test;

import cn.yjxxclub.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-10-19
 * Time: 上午11:56
 * Describe: 消费者
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo/dubbo-consumer.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法

        System.out.println(hello); // 显示调用结果
    }
}
