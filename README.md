# my-SpringCloud
SpringCloud学习

## maven打包 ##
### pom文件中引入插件 spring-boot-maven-plugin ###

引入 spring-boot-maven-plugin 插件会将所有jar包全部打包,最后打包成一个可直接运行的jar包.

 - 如果是直接继承自`` spring-boot-starter-parent ``的模块,可以直接指定启动类(在 properties 中配置 start-class );
 - 如果是自己创建的父模块,需要在pom文件中引入插件,并指定启动类.
  - 如果所有的子模块都有加了`` @SpringBootApplication ``的启动类,那么可以直接在父模块中引入插件.
  - 如果有 core 模块这种不需要单独部署的没有启动类的模块,就需要在每个模块的pom文件中都引入插件并指定启动类.

### 打包命令 #
mvn clean package 
直接执行会将test一起打包,并且检查所有的test; 
如果不需要test检查选择不打包不检查test  -Dmaven.test.skip=true 
mvn clean package -Dmaven.test.skip=true 

### 启动 #
java -jar ***.jar 
如果需要指定环境可以加参数 `` --spring.profiles.active=test ``

### 环境 #
application.yml 是默认文件必须要有.如果需要多环境可以新建 application-环境名称.yml 的文件.例如 application-dev.yml / application-test.yml.dev环境启动 `` --spring.profiles.active=dev `` 就可以了. 
