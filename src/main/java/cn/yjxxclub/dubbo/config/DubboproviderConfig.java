package cn.yjxxclub.dubbo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.annotation.Order;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-10-19
 * Time: 上午11:12
 * Describe: dubbo 发布者
 */
//@ImportResource("classpath*:dubbo/dubbo-provider.xml")//一次都没有成功过，建议还是在xml文件里面加载
@Configuration
@Order(1)
public class DubboproviderConfig {
}
