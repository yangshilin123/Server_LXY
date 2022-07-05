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
import com.ruoyi.system.domain.PrivateMsg;
import com.ruoyi.system.service.IPrivateMsgService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 私信信息Controller
 * 
 * @author ruoyi
 * @date 2022-07-02
 */
@RestController
@RequestMapping("/system/msg")
public class PrivateMsgController extends BaseController
{
    @Autowired
    private IPrivateMsgService privateMsgService;

    /**
     * 查询私信信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:msg:list')")
    @GetMapping("/list")
    public TableDataInfo list(PrivateMsg privateMsg)
    {
        startPage();
        List<PrivateMsg> list = privateMsgService.selectPrivateMsgList(privateMsg);
        return getDataTable(list);
    }

    /**
     * 导出私信信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:msg:export')")
    @Log(title = "私信信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PrivateMsg privateMsg)
    {
        List<PrivateMsg> list = privateMsgService.selectPrivateMsgList(privateMsg);
        ExcelUtil<PrivateMsg> util = new ExcelUtil<PrivateMsg>(PrivateMsg.class);
        util.exportExcel(response, list, "私信信息数据");
    }

    /**
     * 获取私信信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:msg:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(privateMsgService.selectPrivateMsgById(id));
    }

    /**
     * 新增私信信息
     */
    @PreAuthorize("@ss.hasPermi('system:msg:add')")
    @Log(title = "私信信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PrivateMsg privateMsg)
    {
        return toAjax(privateMsgService.insertPrivateMsg(privateMsg));
    }

    /**
     * 修改私信信息
     */
    @PreAuthorize("@ss.hasPermi('system:msg:edit')")
    @Log(title = "私信信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PrivateMsg privateMsg)
    {
        return toAjax(privateMsgService.updatePrivateMsg(privateMsg));
    }

    /**
     * 删除私信信息
     */
    @PreAuthorize("@ss.hasPermi('system:msg:remove')")
    @Log(title = "私信信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(privateMsgService.deletePrivateMsgByIds(ids));
    }
}
