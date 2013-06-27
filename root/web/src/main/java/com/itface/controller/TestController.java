package com.itface.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itface.commons.DateTimeUtils;
@Controller
@RequestMapping("/test/second")
public class TestController {

	@RequestMapping
	public ModelAndView callFunConfigIndex(){
		String now = DateTimeUtils.getNowDateTime();
		Map map = new HashMap();
		map.put("now", now);
		return new ModelAndView("second",map);
	}
}
