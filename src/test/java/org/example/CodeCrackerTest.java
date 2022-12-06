package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeCrackerTest {
  @Test
  void getPositionInAlphabet(){
    final char letter = 'a';
    final CodeCracker codeCracker = new CodeCracker();

    assertEquals(0, codeCracker.getPositionInAlphabet(letter));

  }
  @Test
  void getLetterPositionInDecryptionKey(){
    final int position = 1;
    final CodeCracker codeCracker = new CodeCracker();

    assertEquals(')', codeCracker.getLetterInDecryptionKey(position));

  }

  @Test
  void encryptMessage(){
    final String message= "hello world";
    final CodeCracker codeCracker = new CodeCracker();

    assertEquals("&£aad ldga(", codeCracker.encryptMessage(message));

  }
  @Test
  void encryptMessageNotHelloWorld(){
    final String message= "not hello world";
    final CodeCracker codeCracker = new CodeCracker();

    assertEquals("cdi &£aad ldga(", codeCracker.encryptMessage(message));

  }
  @Test
  void decryptMessage(){
    final String message= "&£aad ldga(";
    final CodeCracker codeCracker = new CodeCracker();

    assertEquals("hello world", codeCracker.decryptMessage(message));

  }

  @Test
  void decryptMessageNotHelloWorld(){
    final String message= "cdi &£aad ldga(";
    final CodeCracker codeCracker = new CodeCracker();

    assertEquals("not hello world", codeCracker.decryptMessage(message));

  }
}
