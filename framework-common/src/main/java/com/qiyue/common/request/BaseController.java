package com.qiyue.common.request;

import com.qiyue.orm.jpa.dao.BaseService;
import com.qiyue.utils.ResultUtils;
import com.qiyue.vo.Result;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by y747718944 on 2018/1/23
 */
public class BaseController<Biz extends BaseService,Entity>   {

    private final static Logger logger= LoggerFactory.getLogger(BaseController.class);


    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected Biz baseBiz;

    @ApiOperation(value = "主键查询",notes = "主键查询")
    @GetMapping("/{id}")
    public Result<Entity> get(
            @ApiParam(name = "id", value ="主键", defaultValue = "")
            @PathVariable Long id){
        Object o= baseBiz.findOne(id);
        return ResultUtils.getResult((Entity)o);
    }


    @ApiOperation(value = "新增",notes = "新增")
    @PostMapping("/{id}")
    public Result save(
            @ApiParam(name = "entity", value ="实体类", defaultValue = "")
            @RequestBody Entity entity){
        baseBiz.save(entity);
        return ResultUtils.success("新增成功！") ;
    }
    @ApiOperation(value = "更新",notes = "更新")
    @PutMapping("/{id}")
    public Result update(
            @ApiParam(name = "entity", value ="实体类", defaultValue = "")
            @RequestBody Entity entity){
        baseBiz.save(entity);
        return ResultUtils.success("更新成功！");
    }

    @ApiOperation(value = "单个删除",notes = "主键删除")
    @DeleteMapping("/{id}")
    public Result remove(
            @ApiParam(name = "id", value ="主键删除", defaultValue = "")
            @PathVariable Long id){
        baseBiz.delete(id);
        return ResultUtils.success("删除成功！");
    }

    @ApiOperation(value = "分页查询",notes = "根据条件进行分页查询")
    @GetMapping("/all")
    public Result<Entity> searchAll(
            @ApiParam(name = "filters", value = "过滤器，为空检索所有条件", defaultValue = "")
            @RequestParam(value = "filters", required = false) String filters){
        List<Entity> result=baseBiz.search(filters);
        return ResultUtils.getResult(result);
    }


    @ApiOperation(value = "分页查询",notes = "根据条件进行分页查询")
    @GetMapping("/page")
    public Result<Entity> searchPage(
            @ApiParam(name = "filters", value = "过滤器，为空检索所有条件", defaultValue = "")
            @RequestParam(value = "filters", required = false) String filters,
            @ApiParam(name = "sorts", value = "排序，规则参见说明文档", defaultValue = "")
            @RequestParam(value = "sorts", required = false) String sorts,
            @ApiParam(name = "size", value = "分页大小", defaultValue = "15")
            @RequestParam(value = "size", required = false) int size,
            @ApiParam(name = "page", value = "页码", defaultValue = "1")
            @RequestParam(value = "page", required = false) int page){
        Page<Entity> result=baseBiz.search(filters,sorts,page,size);
        return ResultUtils.getResult(result);
    }

}
