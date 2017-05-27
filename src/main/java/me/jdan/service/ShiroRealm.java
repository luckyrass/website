package me.jdan.service;

import me.jdan.po.User;
import me.jdan.service.impl.UserServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jdan on 2016/11/30.
 */
public class ShiroRealm extends AuthorizingRealm{
    @Autowired
    private UserService userService;
    public static final String SESSION_USER_KEY = "gray";
    /**
     * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用,负责在应用程序中决定用户的访问控制的方法
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        User user = (User) SecurityUtils.getSubject().getSession().getAttribute(ShiroRealm.SESSION_USER_KEY);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRole("user");
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        // 把token转换成User对象
        User userLogin = tokenToUser((UsernamePasswordToken) authcToken);
        // 验证用户是否可以登录
        User ui = userService.selectByUserName(userLogin.getUsername());
        if (ui.getPassword() != userLogin.getPassword()) ui = null;
        if(ui == null)
            return null; // 异常处理，找不到数据
        // 设置session
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute(ShiroRealm.SESSION_USER_KEY, ui);
        //当前 Realm 的 name
        String realmName = this.getName();
        //登陆的主要信息: 可以是一个实体类的对象, 但该实体类的对象一定是根据 token 的 username 查询得到的.
//      Object principal = ui.getUsername();
        Object principal = authcToken.getPrincipal();
        return new SimpleAuthenticationInfo(principal, userLogin.getPassword(), realmName);
    }
    private User tokenToUser(UsernamePasswordToken authcToken) {
        User user = new User();
        user.setUsername(authcToken.getUsername());
        user.setPassword(String.valueOf(authcToken.getPassword()));
        return user;
    }
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
