package cn.just.shinelon.trap;

import java.util.ArrayList;
import java.util.List;
/**
 * ��ֵ��List<Integer>ʱJVM��Ѽ�����ʢװ������Ԫ�ض�����Integer����������������List<Integer>����ʱ��ֻ�Ǽ�
 * �����ÿһ������Ԫ�أ���δ�漰����Ԫ�ص����ͣ���˳���û���쳣����������ClassCastException�쳣
 * @author shinelon
 *
 */
public class RawTypeTest {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("java�ַ���");
		list.add("���java");
		List<Integer> intList = list;
		for(int i=0;i<intList.size();i++){
			System.out.println(intList.get(i));
			//�׳��쳣ClassCastException
//			Integer in = intList.get(i);
//			System.out.println(in);
		}
	}

}
