package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeCrackerTest {
  @Test
  void returnMessage() {
    final String message = "Hello World";
    final CodeCracker codeCracker = new CodeCracker();

    assertEquals(message, codeCracker.returnMessage("Hello World"));
  }
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

    assertEquals('b', codeCracker.getLetterInDecryptionKey(position));

  }
}
