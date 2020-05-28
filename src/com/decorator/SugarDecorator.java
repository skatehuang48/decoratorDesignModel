package com.decorator;

import com.component.MilkTeaComponent;
/**
 * 加糖的装饰者，给奶茶加糖
 * @author Administrator
 *
 */
public class SugarDecorator extends MilkTeaDecorator {

	public SugarDecorator(MilkTeaComponent milkTeaComponent) {
		super(milkTeaComponent);
	}

	public void addSugar(){
		System.out.println("我是具体的加糖装饰者，我负责给奶茶加糖----------");
	}
	
	@Override
	public void generateMilkTea() {
		// TODO Auto-generated method stub
		addSugar();
		System.out.println("---------sugar decorator--------------");
		super.generateMilkTea();
	}
	
}
