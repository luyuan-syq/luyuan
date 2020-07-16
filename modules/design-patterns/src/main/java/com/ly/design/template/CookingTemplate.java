package com.ly.design.template;

/**
 * <br/>
 * Author: Shao Yuqi(yuanhan.syq@alibaba.com) <br/>
 * Date: 2020/1/13
 */
public abstract class CookingTemplate {

	public void doing() {
		//磨刀
		sharpenningKnife();
		//洗菜板
		washingBoard();
		//烹饪
		cooking();
	}

	private void sharpenningKnife() {
		System.out.println("开始磨刀");
	}

	private void washingBoard() {
		System.out.println("开始洗菜板");
	}

	public abstract void cooking();

}
