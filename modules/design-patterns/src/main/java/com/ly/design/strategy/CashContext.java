package com.ly.design.strategy;

import java.math.BigDecimal;

import lombok.Data;

/**
 * <br/>
 * Author: Shao Yuqi(yuanhan.syq@alibaba.com) <br/>
 * Date: 2020/1/13
 */
@Data
public class CashContext {

	private Strategy strategy;

	public BigDecimal getResult(BigDecimal sourceAmount) {

		return strategy.accpet(sourceAmount);
	}
}
