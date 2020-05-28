package com.component;
/**
 * 具体的被装饰者对象
 * coco奶茶
 * @author Administrator
 *
 */
public class CocoMilkTeaComponent implements MilkTeaComponent {

	@Override
	public void generateMilkTea() {
		System.out.println("我是被装饰者对象，一杯原味的coco奶茶。。。");
	}

}
