package org.dark.test;

import org.dark.beans.FileBean;
import org.dark.beans.FileEntity;
import org.dark.beans.Product;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * 调用生成的java类，进行一系列操作
 * @author liwei
 *
 */
public class PortoBufDealTest {

	/**
	 * 組織原始數據
	 * 1：首先需要構造builder。以此作為基礎數據的載體
	 * 2：基於builder，構造實際使用的對象。後續的傳輸與使用都基於這個對象。
	 * 3：當前方法舉了兩個例子，分別是單生成類與拆分生成類。思想上沒有不同。
	 */
	public static void init() {
		/******************單類部分的示例	start******************/
		System.out.println("******************構建模型******************");
		Product.productData.Builder builder = Product.productData.newBuilder();
		builder.setId(34532515753L);
		builder.setInventory(20);
		builder.setDiscount(0.98f);
		System.out.println("******************構建實例******************");
		Product.productData product = builder.build();
		System.out.println(product.toString());
		System.out.println("******************構建結束******************");

		System.out.println("******************開始 以byte形式顯示******************");
		for(byte b : product.toByteArray()) {
			System.out.print(b);
		}
		System.out.println();
		System.out.println(product.toByteArray().length);
		System.out.println("******************結束 以byte形式顯示******************");
		
		System.out.println("******************開始 以反序列化生成對象******************");
		Product.productData pd = null;
		try {
			pd = Product.productData.parseFrom(product.toByteArray());
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
		System.out.println(pd.toString());
		System.out.println("******************結束 以反序列化生成對象******************");
		/******************單類部分的示例	end******************/
		
		
		
		/******************多類部分的示例	start******************/
		System.out.println("******************多類部分的示例******************");
		FileBean.Builder builderBean = FileBean.newBuilder();
		builderBean.setFileLength(1);
		builderBean.setFileName("test file");
		System.out.println(builderBean.toString());
		
		FileBean bean = builderBean.build();
		System.out.println(bean.toString());
		/******************多類部分的示例	end******************/
	}
	
	public static void main(String[] args) {
		PortoBufDealTest.init();
		
	}

}
