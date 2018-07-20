package sunxikai928.com.github.springcloud.dao;

import org.springframework.stereotype.Component;
import sunxikai928.com.github.springcloud.model.json.QuestionnireInfo;

import java.util.List;

/**
 * Created by sunxikai on 18/7/20.
 */
@Component
public interface IQuestionnireDAO {
    /**
     * 查询问卷列表
     *
     * @return
     */
    List<QuestionnireInfo> queryQuestionnire();
}
