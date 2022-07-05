package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.UserInfo;
import com.ruoyi.system.service.IUserInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户数据Controller
 * 
 * @author ruoyi
 * @date 2022-07-01
 */
@RestController
@RequestMapping("/system/info")
public class UserInfoController extends BaseController
{
    @Autowired
    private IUserInfoService userInfoService;

    /**
     * 查询用户数据列表
     */
    @PreAuthorize("@ss.hasPermi('system:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserInfo userInfo)
    {
        startPage();
        List<UserInfo> list = userInfoService.selectUserInfoList(userInfo);
        return getDataTable(list);
    }

    /**
     * 导出用户数据列表
     */
    @PreAuthorize("@ss.hasPermi('system:info:export')")
    @Log(title = "用户数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserInfo userInfo)
    {
        List<UserInfo> list = userInfoService.selectUserInfoList(userInfo);
        ExcelUtil<UserInfo> util = new ExcelUtil<UserInfo>(UserInfo.class);
        util.exportExcel(response, list, "用户数据数据");
    }

    /**
     * 获取用户数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(userInfoService.selectUserInfoById(id));
    }

    /**
     * 新增用户数据
     */
    @PreAuthorize("@ss.hasPermi('system:info:add')")
    @Log(title = "用户数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserInfo userInfo)
    {
        return toAjax(userInfoService.insertUserInfo(userInfo));
    }

    /**
     * 修改用户数据
     */
    @PreAuthorize("@ss.hasPermi('system:info:edit')")
    @Log(title = "用户数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserInfo userInfo)
    {
        return toAjax(userInfoService.updateUserInfo(userInfo));
    }

    /**
     * 删除用户数据
     */
    @PreAuthorize("@ss.hasPermi('system:info:remove')")
    @Log(title = "用户数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(userInfoService.deleteUserInfoByIds(ids));
    }
}
