package sunxikai928.com.github.springcloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sunxikai928.com.github.springcloud.service.IQuestionnireService;

/**
 * Created by sunxikai on 18/7/20.
 */
@RestController
@RequestMapping("/service")
public class ServiceRest {

    @Value("${server.port}")
    String port;
    @Value("${spring.application.name}")
    String name;

    /**
     * 查询端口号和名称
     *
     * @return
     */
    @RequestMapping(value = "/name/port", method = {RequestMethod.GET})
    public String home() {
        return "This is " + name + " service, port is " + port;
    }
}
