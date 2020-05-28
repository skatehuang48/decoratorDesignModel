package com;

import com.component.CocoMilkTeaComponent;
import com.component.MilkTeaComponent;
import com.decorator.PuddingDecorator;
import com.decorator.SugarDecorator;

public class Client {
	public static void main(String[] args) {
		MilkTeaComponent cocoMilkTea = new CocoMilkTeaComponent();//ԭʼ���̲����
		cocoMilkTea = new SugarDecorator(cocoMilkTea);//���̲����
		cocoMilkTea = new PuddingDecorator(cocoMilkTea);//���ӹ��ǵ��̲��ټӲ���
		cocoMilkTea.generateMilkTea();//����һ�����ǼӲ������̲�
	}
}
