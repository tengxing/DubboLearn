package cn.yjxxclub.dubbo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-10-19
 * Time: 下午5:06
 * Describe:
 */
//@PropertySource("classpath*:dubbo/dubbo.properties") //一次都没有成功过，建议还是在xml文件里面加载
@ImportResource("classpath*:dubbo/dubbo-consumer.xml")
@Configuration
@Order(2)
public class DubboConsumerConfig {

}
