package sunxikai928.com.github.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sunxikai928.com.github.springcloud.dao.IQuestionnireDAO;
import sunxikai928.com.github.springcloud.model.json.QuestionnireInfo;
import sunxikai928.com.github.springcloud.service.IQuestionnireService;

import java.util.List;

/**
 * Created by sunxikai on 18/7/20.
 */
@Service
public class QuestionnireService implements IQuestionnireService {

    @Autowired
    private IQuestionnireDAO questionnireDAO;

    @Override
    public List<QuestionnireInfo> queryQuestionnire() {
        return questionnireDAO.queryQuestionnire();
    }
}