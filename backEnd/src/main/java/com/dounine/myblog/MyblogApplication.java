package com.dounine.myblog;

/***
 * @project my-blog
 * @author douNine
 * @date 2019/5/20
 * @description 博客系统
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class MyblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyblogApplication.class, args);
    }

    
    /**
     *新增此方法
     */
//     @Override
//   protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//       // 注意这里要指向原先用main方法执行的Application启动类
//       return builder.sources(MyblogApplication .class);
//   }
}
