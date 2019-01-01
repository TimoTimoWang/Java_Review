package cn.just.shinelon.trap;

import java.util.ArrayList;
import java.util.List;

/**
 * ����һ�����з�����Ϣ�Ķ��󸳸���һ��û�з�����Ϣ�ı���ʱ�����м��������������Ϣ����������
 * ���磬��һ��List<String>���͵Ķ���ת��ΪList�����List�Լ���Ԫ�ص����ͼ���������ͱ��������ޣ���Object����
 * JDK��Ȼ֧�ַ��ͣ����ǲ���������������
 * @author shinelon
 */
public class ErasureTest {
	
	public static void main(String[] args) {
		Apple<Integer> a = new Apple<Integer>(6);
		Integer as = a.getSize();
		//�ᶪʧ���������������Ϣ
		Apple b = a;
		//���Ͳ�������������Ϊ���͵����޼�Number
		Number size1 = b.getSize();
		//����������
//		Integer size2 = b.getSize();
		
		//������󣬷��Ͳ�����ʱ�����������������������Ϣ
//		for(String apple:b.getApples()){
//			System.out.println(apple);
//		}
		
	}
}
class Apple<T extends Number>{
	T size;
	public Apple(){
	}
	public Apple(T size){
		this.size=size;
	}
	public T getSize() {
		return size;
	}
	public void setSize(T size) {
		this.size = size;
	}
	
	public List<String> getApples(){
		List<String> list = new ArrayList<String>();
		for(int i=0;i<3;i++){
			list.add(new Apple<Integer>(10*i).toString());
		}
		return list;
	}
	public String toString(){
		return "Apple[size=]"+size+"]";
	}
	
}
