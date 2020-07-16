package com.imp.ly.design.template;

import com.ly.design.template.CookingTemplate;
import com.ly.design.template.EggCooking;
import com.ly.design.template.TomatoCooking;
import org.junit.Test;

/**
 * <br/>
 * Author: Shao Yuqi(yuanhan.syq@alibaba.com) <br/>
 * Date: 2020/1/13
 */
public class TestTemplate {

	@Test
	public void test() {
		CookingTemplate template = new EggCooking();
		template.doing();

		System.out.println();
		template = new TomatoCooking();
		template.doing();
	}
}
