package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PrivateMsgMapper;
import com.ruoyi.system.domain.PrivateMsg;
import com.ruoyi.system.service.IPrivateMsgService;

/**
 * 私信信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-07-02
 */
@Service
public class PrivateMsgServiceImpl implements IPrivateMsgService 
{
    @Autowired
    private PrivateMsgMapper privateMsgMapper;

    /**
     * 查询私信信息
     * 
     * @param id 私信信息主键
     * @return 私信信息
     */
    @Override
    public PrivateMsg selectPrivateMsgById(Long id)
    {
        return privateMsgMapper.selectPrivateMsgById(id);
    }

    /**
     * 查询私信信息列表
     * 
     * @param privateMsg 私信信息
     * @return 私信信息
     */
    @Override
    public List<PrivateMsg> selectPrivateMsgList(PrivateMsg privateMsg)
    {
        return privateMsgMapper.selectPrivateMsgList(privateMsg);
    }

    /**
     * 新增私信信息
     * 
     * @param privateMsg 私信信息
     * @return 结果
     */
    @Override
    public int insertPrivateMsg(PrivateMsg privateMsg)
    {
        return privateMsgMapper.insertPrivateMsg(privateMsg);
    }

    /**
     * 修改私信信息
     * 
     * @param privateMsg 私信信息
     * @return 结果
     */
    @Override
    public int updatePrivateMsg(PrivateMsg privateMsg)
    {
        return privateMsgMapper.updatePrivateMsg(privateMsg);
    }

    /**
     * 批量删除私信信息
     * 
     * @param ids 需要删除的私信信息主键
     * @return 结果
     */
    @Override
    public int deletePrivateMsgByIds(Long[] ids)
    {
        return privateMsgMapper.deletePrivateMsgByIds(ids);
    }

    /**
     * 删除私信信息信息
     * 
     * @param id 私信信息主键
     * @return 结果
     */
    @Override
    public int deletePrivateMsgById(Long id)
    {
        return privateMsgMapper.deletePrivateMsgById(id);
    }
}
