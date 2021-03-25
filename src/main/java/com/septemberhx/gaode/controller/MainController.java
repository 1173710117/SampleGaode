package com.septemberhx.gaode.controller;

import com.hitices.common.bean.MResponse;
import com.hitices.mclient.annotation.MLogFunction;
import com.hitices.mclient.base.MObject;
import com.septemberhx.gaode.utils.MBaseUtils;
import com.hitices.mclient.annotation.MFuncDescription;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/3/31
 */
@Controller
public class MainController extends MObject {

    @PostMapping(path = "/navigation")
    @ResponseBody
    @MFuncDescription(value = "navigation", level = 4)
    @MLogFunction
    public MResponse navigation(@RequestBody MResponse params, HttpServletRequest request) {
        return MBaseUtils.generateResInKBSize(10);
    }
}
