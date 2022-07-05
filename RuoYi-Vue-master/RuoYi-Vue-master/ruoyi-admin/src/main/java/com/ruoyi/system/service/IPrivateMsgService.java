package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.PrivateMsg;

/**
 * 私信信息Service接口
 * 
 * @author ruoyi
 * @date 2022-07-02
 */
public interface IPrivateMsgService 
{
    /**
     * 查询私信信息
     * 
     * @param id 私信信息主键
     * @return 私信信息
     */
    public PrivateMsg selectPrivateMsgById(Long id);

    /**
     * 查询私信信息列表
     * 
     * @param privateMsg 私信信息
     * @return 私信信息集合
     */
    public List<PrivateMsg> selectPrivateMsgList(PrivateMsg privateMsg);

    /**
     * 新增私信信息
     * 
     * @param privateMsg 私信信息
     * @return 结果
     */
    public int insertPrivateMsg(PrivateMsg privateMsg);

    /**
     * 修改私信信息
     * 
     * @param privateMsg 私信信息
     * @return 结果
     */
    public int updatePrivateMsg(PrivateMsg privateMsg);

    /**
     * 批量删除私信信息
     * 
     * @param ids 需要删除的私信信息主键集合
     * @return 结果
     */
    public int deletePrivateMsgByIds(Long[] ids);

    /**
     * 删除私信信息信息
     * 
     * @param id 私信信息主键
     * @return 结果
     */
    public int deletePrivateMsgById(Long id);
}
