package cn.tedu.assertx;
/*
 * ����
 * ��Java�У�����û��Ĭ�Ͽ���
 * Run As---> Run Configurations...Arguments---->VM arguments��������-ea
 */

public class AssertDemo {
	public static void main(String[] args) {
		int i = 10;
		i +=7;
		assert i>=15:"���Ӧ�ô��ڵ���15,����i��ֵ:"+i;
		System.out.println(i);
	}
}
