package sunxikai928.com.github.springcloud.core.model;

import java.io.Serializable;

/**
 * Created by sunxikai on 18/7/20.
 */
public class DBObject implements Serializable {
    private static final long serialVersionUID = -864866915792946547L;

    /**
     * sql中in的最大数量
     */
    public static int BATCH_IN_MAX_SIZE = 1000;
}
