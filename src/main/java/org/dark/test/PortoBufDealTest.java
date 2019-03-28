package org.dark.test;

import org.dark.beans.FileBean;
import org.dark.beans.FileEntity;
import org.dark.beans.Product;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * �������ɵ�java�࣬����һϵ�в���
 * @author liwei
 *
 */
public class PortoBufDealTest {

	/**
	 * �M��ԭʼ����
	 * 1��������Ҫ����builder���Դ�������A�������d�w
	 * 2�����builder�����쌍�Hʹ�õČ������m�Ă�ݔ�cʹ�ö�����@������
	 * 3����ǰ�����e�˃ɂ����ӣ��քe�ǆ�������c��������˼���ϛ]�в�ͬ��
	 */
	public static void init() {
		/******************����ֵ�ʾ��	start******************/
		System.out.println("******************����ģ��******************");
		Product.productData.Builder builder = Product.productData.newBuilder();
		builder.setId(34532515753L);
		builder.setInventory(20);
		builder.setDiscount(0.98f);
		System.out.println("******************��������******************");
		Product.productData product = builder.build();
		System.out.println(product.toString());
		System.out.println("******************�����Y��******************");

		System.out.println("******************�_ʼ ��byte��ʽ�@ʾ******************");
		for(byte b : product.toByteArray()) {
			System.out.print(b);
		}
		System.out.println();
		System.out.println(product.toByteArray().length);
		System.out.println("******************�Y�� ��byte��ʽ�@ʾ******************");
		
		System.out.println("******************�_ʼ �Է����л����Ɍ���******************");
		Product.productData pd = null;
		try {
			pd = Product.productData.parseFrom(product.toByteArray());
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
		System.out.println(pd.toString());
		System.out.println("******************�Y�� �Է����л����Ɍ���******************");
		/******************����ֵ�ʾ��	end******************/
		
		
		
		/******************����ֵ�ʾ��	start******************/
		System.out.println("******************����ֵ�ʾ��******************");
		FileBean.Builder builderBean = FileBean.newBuilder();
		builderBean.setFileLength(1);
		builderBean.setFileName("test file");
		System.out.println(builderBean.toString());
		
		FileBean bean = builderBean.build();
		System.out.println(bean.toString());
		/******************����ֵ�ʾ��	end******************/
	}
	
	public static void main(String[] args) {
		PortoBufDealTest.init();
		
	}

}
