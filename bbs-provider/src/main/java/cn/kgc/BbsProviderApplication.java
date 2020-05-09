package cn.kgc;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDubbo
@MapperScan(basePackages = "cn.kgc.mapper")
@SpringBootApplication
public class BbsProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(BbsProviderApplication.class,args);
    }
}
