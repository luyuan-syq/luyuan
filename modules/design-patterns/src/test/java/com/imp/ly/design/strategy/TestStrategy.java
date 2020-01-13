package com.imp.ly.design.strategy;

import java.math.BigDecimal;

import com.ly.design.strategy.CashContext;
import com.ly.design.strategy.CashStrategy;
import com.ly.design.strategy.Strategy;
import org.junit.Test;
import org.springframework.util.Assert;

/**
 * <br/>
 * Author: Shao Yuqi(yuanhan.syq@alibaba.com) <br/>
 * Date: 2020/1/13
 */
public class TestStrategy {

	@Test
	public void test() {
		Strategy strategy = new CashStrategy(new BigDecimal("0.5"));
		CashContext context = new CashContext();
		context.setStrategy(strategy);

		//accept
		BigDecimal result = context.getResult(BigDecimal.valueOf(100L));
		Assert.isTrue(new BigDecimal(50L).compareTo(result) == 0, "不符合期望");
	}
}
