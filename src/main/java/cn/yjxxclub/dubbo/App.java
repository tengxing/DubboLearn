package cn.yjxxclub.dubbo;

import cn.yjxxclub.dubbo.action.Str;
import cn.yjxxclub.dubbo.util.BeanTools;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-10-19
 * Time: 下午4:52
 * Describe: spring boot 启动累
 */
@SpringBootApplication
public class App extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class);
    }

    public static void main (String[] args){
        SpringApplication.run(App.class);

        Str str= (Str) BeanTools.getBean(Str.class);
        str.test();
    }
}
