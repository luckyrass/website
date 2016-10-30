package me.jdan.service;

import me.jdan.po.User;

/**
 * Created by jdan on 2016/10/29.
 */
public interface UserService {
    public User getUserById(String userId);
    public User selectByUserName(String userName);
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUserByUserId(String userId);
    public int selectUserCount();
}
