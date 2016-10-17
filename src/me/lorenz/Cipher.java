package me.lorenz;

public class Cipher {

	/**
	 * Used for the encryption of plaintext into ciphertext based on
	 * Vernam cipher. First it takes the non-encrypted letter ITA2
	 * value, then it takes the key in form of another ITA2 value
	 * and does exclussive OR (XOR) logic function of both thus
	 * getting the encrypted ITA2 value used for getting the 
	 * encrypted letter.
	 * 
	 * 
	 * @param plainText - ITA2 value of non-encrypted letter
	 * @param key - cipher key
	 * @return ITA2 value of encrypted letter
	 * @throws IllegalArgumentException
	 */
		public int[] encrypt(int[] plainText, int[] key) throws IllegalArgumentException {
		int[] result = new int[Math.min(plainText.length, key.length)];
		for (int i = 0; i < result.length; i++) {
			result[i] = plainText[i] ^ key[i];
		}
		return result;
 	}
	
}