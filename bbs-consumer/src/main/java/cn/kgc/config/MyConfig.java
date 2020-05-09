package cn.kgc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //展示
        registry.addViewController("/").setViewName("bbslist");
        //添加
        registry.addViewController("/add").setViewName("addbbs");
    }
}
