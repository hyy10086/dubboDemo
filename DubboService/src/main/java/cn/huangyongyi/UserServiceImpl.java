package cn.huangyongyi;

import cn.huangyongyi.IUserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author huangyongyi.
 * @date 2018/4/10
 * @desc:
 */
@Component
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public String getUserName() {
        return "我是dubbo的提供者";
    }
}
