package sunxikai928.com.github.springcloud.service;


import sunxikai928.com.github.springcloud.model.json.QuestionnireInfo;

import java.util.List;

/**
 * Created by sunxikai on 18/7/20.
 */
public interface IQuestionnireService {

    /**
     * 查询问卷列表
     *
     * @return
     */
    List<QuestionnireInfo> queryQuestionnire();
}
