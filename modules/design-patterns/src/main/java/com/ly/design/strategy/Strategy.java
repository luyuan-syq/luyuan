package com.ly.design.strategy;

import java.math.BigDecimal;

/**
 * <br/>
 * Author: Shao Yuqi(yuanhan.syq@alibaba.com) <br/>
 * Date: 2020/1/13
 */
public interface Strategy {

	BigDecimal accpet(BigDecimal sourceAmount);
}
