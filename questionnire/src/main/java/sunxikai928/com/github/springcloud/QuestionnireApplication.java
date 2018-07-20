package sunxikai928.com.github.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("sunxikai928.com.github.springcloud.**.dao")//将项目中对应的mapper类的路径加进来就可以了
public class QuestionnireApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionnireApplication.class, args);
	}
}
