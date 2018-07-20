package sunxikai928.com.github.springcloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sunxikai928.com.github.springcloud.model.json.QuestionnireInfo;
import sunxikai928.com.github.springcloud.service.IQuestionnireService;

import java.util.List;

/**
 * Created by sunxikai on 18/7/20.
 */
@RestController
@RequestMapping("/questionnire")
public class QuestionnireRest {

    @Autowired
    private IQuestionnireService questionnireService;

    /**
     * 查询问卷列表
     */
    @RequestMapping(value = "/query/questionnire", method = {RequestMethod.GET})
    public List<QuestionnireInfo> queryQuestionnire() {
        return questionnireService.queryQuestionnire();
    }

}
