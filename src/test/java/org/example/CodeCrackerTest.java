package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



class CodeCrackerTest {

  static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
  static final String DECRYPTION_KEY = "!)\"(£*%&><@abcdefghijklmno";


  @Test
  void encryptMessage(){
    final String message= "hello world";
    final CodeCracker codeCracker = new CodeCracker(ALPHABET, DECRYPTION_KEY);

    assertEquals("&£aad ldga(", codeCracker.encrypt(message));

  }
  @Test
  void encryptMessageNotHelloWorld(){
    final String message= "not hello world";
    final CodeCracker codeCracker = new CodeCracker(ALPHABET, DECRYPTION_KEY);

    assertEquals("cdi &£aad ldga(", codeCracker.encrypt(message));

  }
  @Test
  void decryptMessage(){
    final String message= "&£aad ldga(";
    final CodeCracker codeCracker = new CodeCracker(ALPHABET, DECRYPTION_KEY);

    assertEquals("hello world", codeCracker.decrypt(message));

  }

  @Test
  void decryptMessageNotHelloWorld(){
    final String message= "cdi &£aad ldga(";
    final CodeCracker codeCracker = new CodeCracker(ALPHABET, DECRYPTION_KEY);

    assertEquals("not hello world", codeCracker.decrypt(message));

  }
}
