package com.decorator;

import com.component.MilkTeaComponent;
/**
 * ���ǵ�װ���ߣ����̲����
 * @author Administrator
 *
 */
public class SugarDecorator extends MilkTeaDecorator {

	public SugarDecorator(MilkTeaComponent milkTeaComponent) {
		super(milkTeaComponent);
	}

	public void addSugar(){
		System.out.println("���Ǿ���ļ���װ���ߣ��Ҹ�����̲����----------");
	}
	
	@Override
	public void generateMilkTea() {
		// TODO Auto-generated method stub
		addSugar();
		System.out.println("---------sugar decorator--------------");
		super.generateMilkTea();
	}
	
}
