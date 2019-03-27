package org.dark.test;

import com.lw.proto.Demo;
import com.lw.proto.FileBean;

/**
 * 调用生成的java类，进行一系列操作
 * @author liwei
 *
 */
public class PortoBufDealTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = null;
		FileBean fileBean = FileBean.newBuilder().build();
		fileBean.toBuilder().setFileName("Test Name");
		fileBean.toBuilder().setOpt(1);
		
		fileBean.toByteArray();
	}

}
