package cn.tedu.assertx;
/*
 * 断言
 * 在Java中，断言没有默认开启
 * Run As---> Run Configurations...Arguments---->VM arguments里面输入-ea
 */

public class AssertDemo {
	public static void main(String[] args) {
		int i = 10;
		i +=7;
		assert i>=15:"结果应该大于等于15,但是i的值:"+i;
		System.out.println(i);
	}
}
