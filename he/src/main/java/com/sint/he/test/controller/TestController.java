package com.sint.he.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sint.he.test.service.TestService;


@Controller
public class TestController {
	@Autowired
	TestService testService;
	
	@RequestMapping(value = "/home")
	public String home() {
		return "index.html";
	}
	
	@ResponseBody
	@RequestMapping(value = "valueTest")
	public String valueTest() {
		String value = "테스트 String";
		return value;
	}
	
//	@RequestMapping("/test")
//	public ModelAndView test() throws Exception {
//		ModelAndView mav = new ModelAndView("test");
//		mav.addObject("name", "hyungeun");
//		List<String> testList = new ArrayList<String>();
//		testList.add("a");
//		testList.add("b");
//		testList.add("c");
//		mav.addObject("list", testList);
//		return mav;
//	}
	
	@RequestMapping("/thymeleafTest")
	public String thymeleafTest(Model model) {
		//TestVo testModel = new TestVo("hyungeun", "형은");
		//model.addAttribute("testModel", testModel);
		return "thymeleaf/thymeleafTest";
	}

//	@RequestMapping(value = "/test")
//	public ModelAndView test() throws Exception {
//		ModelAndView mav = new ModelAndView("test");
//		List<TestVo> testList = testService.selectTest();
//		mav.addObject("list", testList);
//		return mav;
//	}

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/test")
	public ModelAndView test() throws Exception {
		logger.trace("Trace Level 테스트");
		logger.debug("DEBUG Level 테스트");
		logger.info("INFO Level 테스트");
		logger.warn("Warn Level 테스트");
		logger.error("ERROR Level 테스트");
		
		testService.selectTest();
		
		return new ModelAndView();
	}

}
