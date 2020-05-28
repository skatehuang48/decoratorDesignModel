package com.decorator;

import com.component.MilkTeaComponent;
/**
 * 装饰者抽象类
 * 注意：装饰抽象这得持有Component实例对象的引用
 *
 */
public abstract class MilkTeaDecorator implements MilkTeaComponent {

	private MilkTeaComponent milkTeaComponent;
	public MilkTeaDecorator(MilkTeaComponent milkTeaComponent){
		this.milkTeaComponent = milkTeaComponent;
	}
	
	@Override
	public void generateMilkTea() {
		this.milkTeaComponent.generateMilkTea();
	}

}
