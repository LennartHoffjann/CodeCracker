package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



class CodeCrackerTest {

  static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
  static final String DECRYPTION_KEY = "!)\"(£*%&><@abcdefghijklmno";


  @Test
  void encryptMessage(){
    final String message= "hello world";
    final CodeCracker codeCracker = new CodeCracker();

    assertEquals("&£aad ldga(", codeCracker.convert(message, ALPHABET, DECRYPTION_KEY));

  }
  @Test
  void encryptMessageNotHelloWorld(){
    final String message= "not hello world";
    final CodeCracker codeCracker = new CodeCracker();

    assertEquals("cdi &£aad ldga(", codeCracker.convert(message, ALPHABET, DECRYPTION_KEY));

  }
  @Test
  void decryptMessage(){
    final String message= "&£aad ldga(";
    final CodeCracker codeCracker = new CodeCracker();

    assertEquals("hello world", codeCracker.convert(message, DECRYPTION_KEY, ALPHABET));

  }

  @Test
  void decryptMessageNotHelloWorld(){
    final String message= "cdi &£aad ldga(";
    final CodeCracker codeCracker = new CodeCracker();

    assertEquals("not hello world", codeCracker.convert(message, DECRYPTION_KEY, ALPHABET));

  }
}
