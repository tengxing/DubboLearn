package cn.yjxxclub.dubbo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-10-19
 * Time: 下午5:06
 * Describe:
 */
@ImportResource("classpath*:dubbo-consumer.xml")
@Configuration
public class DubboConsumerConfig {

}
