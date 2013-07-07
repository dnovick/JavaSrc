package org.novick.crypto.vaudenaytest;

import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

import org.bouncycastle.crypto.engines.*;
import org.bouncycastle.crypto.params.*;


public class Encrypter {

	private AESEngine _aesEngine;
	
	public static final int AESBLOCKSIZE = 16;
	public static final int AES128KEYSIZE = 16;
	public static final int AES256KEYSIZE = 32;
	
	public Encrypter()
	{
		_aesEngine = new AESEngine();
		
		//_aesEngine.
		
	}
	
	public boolean Encrypt(byte[] plaintext, byte[] key)
	{		
		System.out.println("Encrypting");
		
		byte[] iv = new byte[AESBLOCKSIZE];
		
		//ParametersWithIV params = new ParametersWithIV(iv);
		
		//_aesEngine.init(false, params);
		
		return true;
	}
	
	public boolean Decrypt(byte[] ciphertext, byte[] key)
	{
		System.out.println("Decrypting");
		
		return true;
		
	}
}
