package cn.just.shinelon.objectMemory;


/**
 * java�ڼ̳и���ı����ͷ���ʱ��������ģ��̳з���ʱ������ʱ�Ὣ����ת�Ƶ������У����
 * �����䷽��ȡ����ʵ�����õ�java��������ͣ����Ǳ�������ת�Ƶ������У���˱����ķ���ȡ���������ñ���ʱ������
 * @author shinelon
 *
 */
public class Child extends Parent{
	private int i=1;
	
	public static void main(String[] args) {
		new Child();
	}
	
}
class Parent{
	private int i=11;
	public void print(){
		System.out.println("print");
	}
}
