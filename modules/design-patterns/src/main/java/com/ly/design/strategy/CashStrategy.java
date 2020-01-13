package com.ly.design.strategy;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <br/>
 * Author: Shao Yuqi(yuanhan.syq@alibaba.com) <br/>
 * Date: 2020/1/13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CashStrategy implements Strategy{

	private BigDecimal rebate;

	/**
	 * 打折
	 * @param sourceAmount
	 * @return
	 */
	@Override
	public BigDecimal accpet(BigDecimal sourceAmount) {
		return sourceAmount.multiply(rebate);
	}
}
