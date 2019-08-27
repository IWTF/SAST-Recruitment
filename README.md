# SAST-Recruitment
第九届科协招新网站

**前端**

jQuery+bootstrap

**后端**

spring boot
> PS: 直接使用了同学的blog后端，由于需求较低，仅仅实现了些简单接口



**后端配置文件**


在`main`目录下新建`resources`夹, 新建文件`application.properties`

```
# mysql\u914D\u7F6E
spring.datasource.url = jdbc:mysql://localhost:3306/eepc?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC
spring.datasource.username = 用户名
spring.datasource.password = 密码
spring.datasource.driver-class-name = com.mysql.jdbc.Driver

swagger.title = Swagger


# http request
spring.http.encoding.charset = UTF-8
spring.http.encoding.enabled = true
spring.http.encoding.force = true

server.port = 8081
server.context-path=/
server.tomcat.uri-encoding = UTF-8

spring.http.encoding.charset=utf-8
spring.http.encoding.force=true
spring.http.encoding.enabled=true
```
