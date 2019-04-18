package com.sss;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class PrizeBoxController {
	
	@RequestMapping(value="/showPrizeBoxPage",method=RequestMethod.GET)
	public String showResistrationPage(ModelMap mm) {
		Input reg=new Input();
		mm.addAttribute("inputCmd", reg);
		return "prizebox";
	}
	@RequestMapping(value="/showPrize",method=RequestMethod.GET)
	public ModelAndView showPrize(@ModelAttribute("inputCmd") Input input) {
		Random rand = new Random();
        int inputNum=input.getNumber();
		// Obtain a number between [0 - 49].
		int n = rand.nextInt(inputNum);
		int prize=0;
		if(n<inputNum) {
			prize=n;
		}else {
			prize=inputNum;
		}
		
		return new ModelAndView("Show","msg",prize);

	}
	
}
