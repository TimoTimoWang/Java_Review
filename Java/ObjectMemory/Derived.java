package cn.just.shinelon.objectMemory;

/**
 * @author shinelon
 *
 */
public class Derived extends Base{
	private int i=22;
	public Derived(){
		System.out.println(this.getClass());
		i=222;
	}
	public void display(){
		System.out.println(i);
//		FileInputStream
	}
	
	public static void main(String[] args){
		new Derived();
	}

}

class Base{
	private int i=2;
	public Base(){
		//���Ǵ�ʱthis��Ȼ�����ڳ�ʼ����java���󣬵������ڸ��๹�����У����this�ı���ʱ����Ϊ����Base�����Խ��Ϊ2
		System.out.println(this.i);
		//this�������ڳ�ʼ����java����
		//��ʱ�������������д�ķ������������������ʱ��û�г�ʼ����ɣ����ֵΪ0
		this.display();
	}
	
	public void display(){
		System.out.println(i);
	}
}
