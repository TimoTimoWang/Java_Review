package cn.just.shinelon.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
/**
 * ������
 * @author shinelon
 *
 */
public class PhantomReferenceTest {
	
	public static void main(String[] args) {
		String str = new String("���java����");
		ReferenceQueue<String> rq = new ReferenceQueue<String>();
		//��Ӧ�ò��ܵ���ʹ�ã���������ö�������ʹ��
		PhantomReference<String> pr = new PhantomReference<String>(str, rq);
		str=null;
		System.out.println(pr.get());			//null
		System.gc();
		System.runFinalization();
		System.out.println(rq.poll()==pr);		//true
		
	}

}
