package com;

import com.component.CocoMilkTeaComponent;
import com.component.MilkTeaComponent;
import com.decorator.PuddingDecorator;
import com.decorator.SugarDecorator;

public class Client {
	public static void main(String[] args) {
		MilkTeaComponent cocoMilkTea = new CocoMilkTeaComponent();//原始的奶茶对象
		cocoMilkTea = new SugarDecorator(cocoMilkTea);//给奶茶加糖
		cocoMilkTea = new PuddingDecorator(cocoMilkTea);//给加过糖的奶茶再加布丁
		cocoMilkTea.generateMilkTea();//生产一杯加糖加布丁的奶茶
	}
}
