package org.dark.test;

import java.io.IOException;

/**
 * 使用protobuf工具，依照demo.proto文件生成对饮的java类
 * @author liwei
 *
 */
public class ProtoBufGenerateTest {

	public static void main(String[] args) throws IOException {
		String strCmd = "D:\\work tools\\protoc-3.7.0-win64\\bin\\protoc.exe " +
	//			" -I=E:\\protoDir\\ --java_out=E:\\protoDir\\childPath\\  E:\\protoDir\\protoPath\\demo.proto";
			"-I=./src/main/java --java_out=./src/main/java/ ./src/main/java/org/dark/proto/product.proto";
 
        Runtime.getRuntime().exec(strCmd);
	}
}