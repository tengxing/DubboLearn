package cn.yjxxclub.dubbo.action;

import cn.yjxxclub.dubbo.service.DemoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-10-19
 * Time: 下午5:48
 * Describe:
 */
@Component
public class Str {
    @Reference
    DemoService demoService; // 获取远程服务代理

    public void test(){
        String hello = demoService.sayHello("world"); // 执行远程方法

        System.out.println(hello); // 显示调用结果
    }
}
