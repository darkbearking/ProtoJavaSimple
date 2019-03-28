package org.dark.test;

import org.dark.beans.FileBean;
import org.dark.beans.FileEntity;
import org.dark.beans.Test;

/**
 * 调用生成的java类，进行一系列操作
 * @author liwei
 *
 */
public class PortoBufDealTest {

	public static void main(String[] args) {
		Test.gps_data.Builder builder = Test.gps_data.newBuilder();
		builder.setAltitude(1);

		FileBean.Builder builderBean = FileBean.newBuilder();
		builderBean.setFileLength(1);
		builderBean.setFileName("test file");
		System.out.println(builderBean.toString());
		
		FileBean bean = builderBean.build();
		System.out.println(bean.toString());
		
		for(byte b : bean.toByteArray()) {
			System.out.print(b);
		}
	}

}
