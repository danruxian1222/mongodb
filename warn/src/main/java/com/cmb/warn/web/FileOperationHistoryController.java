package com.cmb.warn.web;

import com.cmb.warn.common.CommonResult;
import com.cmb.warn.nosql.mongodb.document.FileOperationHistory;
import com.cmb.warn.service.FileOperationHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Api(tags = {"FileOperationHistoryController"}, description = "文件操作记录controller")
@RestController
@RequestMapping("fileoperationhistory")
public class FileOperationHistoryController {

    @Autowired
    private FileOperationHistoryService fileOperationHistoryService;

    @ApiOperation("展示文件操作记录")
    @GetMapping(value = "list")
    public CommonResult<List<FileOperationHistory>> list(@RequestParam("fileName") String fileName) {
        List<FileOperationHistory> fileOperationHistoryList = fileOperationHistoryService.list(fileName);
        return CommonResult.success(fileOperationHistoryList);
    }
}
