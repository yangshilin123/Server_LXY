package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ForumMsg;

/**
 * 论坛信息Service接口
 * 
 * @author ruoyi
 * @date 2022-07-02
 */
public interface IForumMsgService 
{
    /**
     * 查询论坛信息
     * 
     * @param id 论坛信息主键
     * @return 论坛信息
     */
    public ForumMsg selectForumMsgById(Long id);

    /**
     * 查询论坛信息列表
     * 
     * @param forumMsg 论坛信息
     * @return 论坛信息集合
     */
    public List<ForumMsg> selectForumMsgList(ForumMsg forumMsg);

    /**
     * 新增论坛信息
     * 
     * @param forumMsg 论坛信息
     * @return 结果
     */
    public int insertForumMsg(ForumMsg forumMsg);

    /**
     * 修改论坛信息
     * 
     * @param forumMsg 论坛信息
     * @return 结果
     */
    public int updateForumMsg(ForumMsg forumMsg);

    /**
     * 批量删除论坛信息
     * 
     * @param ids 需要删除的论坛信息主键集合
     * @return 结果
     */
    public int deleteForumMsgByIds(Long[] ids);

    /**
     * 删除论坛信息信息
     * 
     * @param id 论坛信息主键
     * @return 结果
     */
    public int deleteForumMsgById(Long id);
}
