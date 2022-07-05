package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.UserInfo;

/**
 * 用户数据Service接口
 * 
 * @author ruoyi
 * @date 2022-07-01
 */
public interface IUserInfoService 
{
    /**
     * 查询用户数据
     * 
     * @param id 用户数据主键
     * @return 用户数据
     */
    public UserInfo selectUserInfoById(Long id);

    /**
     * 查询用户数据列表
     * 
     * @param userInfo 用户数据
     * @return 用户数据集合
     */
    public List<UserInfo> selectUserInfoList(UserInfo userInfo);

    /**
     * 新增用户数据
     * 
     * @param userInfo 用户数据
     * @return 结果
     */
    public int insertUserInfo(UserInfo userInfo);

    /**
     * 修改用户数据
     * 
     * @param userInfo 用户数据
     * @return 结果
     */
    public int updateUserInfo(UserInfo userInfo);

    /**
     * 批量删除用户数据
     * 
     * @param ids 需要删除的用户数据主键集合
     * @return 结果
     */
    public int deleteUserInfoByIds(Long[] ids);

    /**
     * 删除用户数据信息
     * 
     * @param id 用户数据主键
     * @return 结果
     */
    public int deleteUserInfoById(Long id);
}