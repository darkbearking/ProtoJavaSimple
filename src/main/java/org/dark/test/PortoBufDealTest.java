package org.dark.test;

import com.lw.proto.Demo;
import com.lw.proto.FileBean;

/**
 * �������ɵ�java�࣬����һϵ�в���
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
