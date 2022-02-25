# gateway相关

* [x] gateway入口，报错503

> 由于最开始pom文件没有引入
> ```xml
> <!-- loadbalancer 依赖 -->
>         <dependency>
>             <groupId>org.springframework.cloud</groupId>
>             <artifactId>spring-cloud-starter-loadbalancer</artifactId>
>         </dependency>
> ```
> 访问gateway入口的时候，一直报错503.