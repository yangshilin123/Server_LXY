package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户数据对象 user_info
 * 
 * @author ruoyi
 * @date 2022-07-01
 */
public class UserInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户ID */
    private Long id;

    /** 用户名 */
    @Excel(name = "用户名")
    private String username;

    /** 用户密码 */
    private String password;

    /** 性别 */
    @Excel(name = "性别")
    private Integer gender;

    /** 生日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String phone;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 最近登陆时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最近登陆时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastLoginTime;

    /** 最近登录ip地址 */
    @Excel(name = "最近登录ip地址")
    private String lastLoginIp;

    /** 个性签名 */
    @Excel(name = "个性签名")
    private String signature;

    /** 删除状态 */
    @Excel(name = "删除状态")
    private Integer deletd;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setGender(Integer gender) 
    {
        this.gender = gender;
    }

    public Integer getGender() 
    {
        return gender;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setLastLoginTime(Date lastLoginTime) 
    {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastLoginTime() 
    {
        return lastLoginTime;
    }
    public void setLastLoginIp(String lastLoginIp) 
    {
        this.lastLoginIp = lastLoginIp;
    }

    public String getLastLoginIp() 
    {
        return lastLoginIp;
    }
    public void setSignature(String signature) 
    {
        this.signature = signature;
    }

    public String getSignature() 
    {
        return signature;
    }
    public void setDeletd(Integer deletd) 
    {
        this.deletd = deletd;
    }

    public Integer getDeletd() 
    {
        return deletd;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("username", getUsername())
            .append("password", getPassword())
            .append("gender", getGender())
            .append("birthday", getBirthday())
            .append("phone", getPhone())
            .append("status", getStatus())
            .append("lastLoginTime", getLastLoginTime())
            .append("lastLoginIp", getLastLoginIp())
            .append("signature", getSignature())
            .append("deletd", getDeletd())
            .toString();
    }
}
