package com.javaex.ex02;

import java.io.IOException;

public class FileApp {

	public static void main(String[] args) {
		
		try {
			fileRead();
		} catch (IOException  e) {
			System.out.println("파일이 없습니다.");
		}

	}

	// 수정하지 마세요
	public static void fileRead() throws IOException{
		throw new IOException(); // 강제로 예외 발생
	}
}


