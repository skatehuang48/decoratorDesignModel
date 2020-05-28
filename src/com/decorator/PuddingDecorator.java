package com.decorator;

import com.component.MilkTeaComponent;

public class PuddingDecorator extends MilkTeaDecorator {

	public PuddingDecorator(MilkTeaComponent milkTeaComponent) {
		super(milkTeaComponent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generateMilkTea() {
		// TODO Auto-generated method stub
		super.generateMilkTea();
		System.out.println("---------pudding decorator-------------");
		addPudding();
	}
	
	public void addPudding(){
		System.out.println("我是布丁装饰者，我负责给奶茶加布丁=============");
	}
}
