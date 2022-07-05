package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 私信信息对象 private_msg
 * 
 * @author ruoyi
 * @date 2022-07-02
 */
public class PrivateMsg extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 信息ID */
    @Excel(name = "信息ID")
    private Long id;

    /** 父级ID */
    @Excel(name = "父级ID")
    private Long parentId;

    /** 发送者ID */
    @Excel(name = "发送者ID")
    private Long userId;

    /** 收件人ID */
    @Excel(name = "收件人ID")
    private Long toUserId;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setToUserId(Long toUserId) 
    {
        this.toUserId = toUserId;
    }

    public Long getToUserId() 
    {
        return toUserId;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("parentId", getParentId())
            .append("userId", getUserId())
            .append("toUserId", getToUserId())
            .append("content", getContent())
            .append("time", getTime())
            .toString();
    }
}
