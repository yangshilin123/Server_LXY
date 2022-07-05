package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserInfoMapper;
import com.ruoyi.system.domain.UserInfo;
import com.ruoyi.system.service.IUserInfoService;

/**
 * 用户数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-07-01
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService 
{
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 查询用户数据
     * 
     * @param id 用户数据主键
     * @return 用户数据
     */
    @Override
    public UserInfo selectUserInfoById(Long id)
    {
        return userInfoMapper.selectUserInfoById(id);
    }

    /**
     * 查询用户数据列表
     * 
     * @param userInfo 用户数据
     * @return 用户数据
     */
    @Override
    public List<UserInfo> selectUserInfoList(UserInfo userInfo)
    {
        return userInfoMapper.selectUserInfoList(userInfo);
    }

    /**
     * 新增用户数据
     * 
     * @param userInfo 用户数据
     * @return 结果
     */
    @Override
    public int insertUserInfo(UserInfo userInfo)
    {
        return userInfoMapper.insertUserInfo(userInfo);
    }

    /**
     * 修改用户数据
     * 
     * @param userInfo 用户数据
     * @return 结果
     */
    @Override
    public int updateUserInfo(UserInfo userInfo)
    {
        return userInfoMapper.updateUserInfo(userInfo);
    }

    /**
     * 批量删除用户数据
     * 
     * @param ids 需要删除的用户数据主键
     * @return 结果
     */
    @Override
    public int deleteUserInfoByIds(Long[] ids)
    {
        return userInfoMapper.deleteUserInfoByIds(ids);
    }

    /**
     * 删除用户数据信息
     * 
     * @param id 用户数据主键
     * @return 结果
     */
    @Override
    public int deleteUserInfoById(Long id)
    {
        return userInfoMapper.deleteUserInfoById(id);
    }
}
