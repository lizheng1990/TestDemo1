package com.test.basic;

public class ArgsTest {

	public static void main(String[] args) {
		float a = 0f;
		float b = 0f;
		String i = args[0];
		String j = args[1];
		System.out.println("第一个输入参数：" + i + "\n" + "第二个输入参数：" + j + "\n" + "比较结果：");
		// TODO Auto-generated method stub
		try {
			a = Float.parseFloat(i);
			b = Float.parseFloat(j);

			if (a > b) {
				System.out.println("a大于b");
			}else if (a == b) {
				System.out.println("a等于b");
			}else {
				System.out.println("a小于b");
			}

		} catch (NumberFormatException e) {
			System.out.println("输入参数格式错误，请检查后重新输入");
			e.printStackTrace();
		}
	}

}
