package cn.huangyongyi.web;

import cn.huangyongyi.IUserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author huangyongyi.
 * @date 2018/4/10
 * @desc:
 */
@Controller
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/getName")
    public String getUser(HttpServletRequest request){

        String userName = iUserService.getUserName();
        System.out.println(userName);
        request.setAttribute("userName",userName);
        return "welcome";
    }


    @RequestMapping("/aa")
    public String aa(){
        return "welcome";
    }

}
