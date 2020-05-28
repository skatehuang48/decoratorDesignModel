package com.decorator;

import com.component.MilkTeaComponent;
/**
 * װ���߳�����
 * ע�⣺װ�γ�����ó���Componentʵ�����������
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
