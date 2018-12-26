package cn.just.shinelon.reference;

import java.lang.ref.WeakReference;
/**
 * ������
 * @author shinelon
 *
 */
public class WeakReferenceTest {
	
	public static void main(String[] args){
		String str = new String("���java����");
		WeakReference<String> wr = new WeakReference<String>(str);
		str=null;
		System.out.println(wr.get());		//���java����
		System.gc();
		System.runFinalization();
		System.out.println(wr.get());		//null
	}
}
