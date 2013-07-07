package org.novick.crypto.vaudenaytest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.bouncycastle.crypto.prng.*;


public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		Encrypter enc = context.getBean("aesEncrypter", org.novick.crypto.vaudenaytest.Encrypter.class);
		
		byte[] plaintext = new byte[Encrypter.AESBLOCKSIZE];
		byte[] key = new byte[Encrypter.AES256KEYSIZE];
		
		
		RandomGenerator rng = new VMPCRandomGenerator();
		
		rng.nextBytes(key);
		
		
		enc.Encrypt(plaintext, key);
		
		context.close();
		
		System.out.println("Application exiting now.");
		
	}

}
