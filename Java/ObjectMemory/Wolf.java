package cn.just.shinelon.objectMemory;

/**
 * ����ʼ��һ�������ʱ�������Ȼ��ʼ�����࣬��ʽ���ø����޲ι����������������д�˸���ķ��������������ķ���
 * Ȼ���ʼ�����������ִ�зǾ�̬����飨�ʹ���ı�д˳��һ�£����������๹����
 * @author shinelon
 */
public class Wolf extends Animal{
	private String name="wolf";
	private Double weight;
	{
		System.out.println(this.name);
	}
	public Wolf(String name,Double weight){
		System.out.println("�����вι�����");
		this.name=name;
		this.weight=weight;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		System.out.println("������д����");           //��
		return "name: "+name+" weight: "+weight;		//��
	}
	
	public static void main(String[] args){
		System.out.println(new Wolf("��̫��",52.0));		//��
	}
}
class Animal{
	private String desc;
	public Animal(){
		//this�ڹ��캯���е�ʱ��this�������ڳ�ʼ����java����
		//�������������б����µķ���
		this.desc=getDesc();
		System.out.println("�����޲ι�����");			//��
	}
	public String getDesc(){
		return "Animal";
	}
	public String toString(){
		return desc;
	}
	
}