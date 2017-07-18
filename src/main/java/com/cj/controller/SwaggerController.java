package com.cj.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chenjun on 17-7-18.
 */
@RestController
//@RequestMapping("/swagger")
@Api(value = "SwaggerController",description = "SwaggerController 描述")
public class SwaggerController {

    @ApiOperation(value = "/sayHello",notes = "注意事项")
    @ApiImplicitParam(name = "name",value = "名称",dataType = "String",paramType = "path")
    @RequestMapping(value = "/sayHello/{name}",method = RequestMethod.GET)
    public String sayHello(@PathVariable("name") String name) {
        return name + "say Hello!";
    }
}
