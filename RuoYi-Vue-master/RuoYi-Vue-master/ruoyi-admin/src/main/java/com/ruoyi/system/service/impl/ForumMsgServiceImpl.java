package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ForumMsgMapper;
import com.ruoyi.system.domain.ForumMsg;
import com.ruoyi.system.service.IForumMsgService;

/**
 * 论坛信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-07-02
 */
@Service
public class ForumMsgServiceImpl implements IForumMsgService 
{
    @Autowired
    private ForumMsgMapper forumMsgMapper;

    /**
     * 查询论坛信息
     * 
     * @param id 论坛信息主键
     * @return 论坛信息
     */
    @Override
    public ForumMsg selectForumMsgById(Long id)
    {
        return forumMsgMapper.selectForumMsgById(id);
    }

    /**
     * 查询论坛信息列表
     * 
     * @param forumMsg 论坛信息
     * @return 论坛信息
     */
    @Override
    public List<ForumMsg> selectForumMsgList(ForumMsg forumMsg)
    {
        return forumMsgMapper.selectForumMsgList(forumMsg);
    }

    /**
     * 新增论坛信息
     * 
     * @param forumMsg 论坛信息
     * @return 结果
     */
    @Override
    public int insertForumMsg(ForumMsg forumMsg)
    {
        return forumMsgMapper.insertForumMsg(forumMsg);
    }

    /**
     * 修改论坛信息
     * 
     * @param forumMsg 论坛信息
     * @return 结果
     */
    @Override
    public int updateForumMsg(ForumMsg forumMsg)
    {
        return forumMsgMapper.updateForumMsg(forumMsg);
    }

    /**
     * 批量删除论坛信息
     * 
     * @param ids 需要删除的论坛信息主键
     * @return 结果
     */
    @Override
    public int deleteForumMsgByIds(Long[] ids)
    {
        return forumMsgMapper.deleteForumMsgByIds(ids);
    }

    /**
     * 删除论坛信息信息
     * 
     * @param id 论坛信息主键
     * @return 结果
     */
    @Override
    public int deleteForumMsgById(Long id)
    {
        return forumMsgMapper.deleteForumMsgById(id);
    }
}
