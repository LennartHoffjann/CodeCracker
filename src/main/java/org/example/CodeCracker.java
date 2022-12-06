package org.example;


import java.util.stream.IntStream;

public class CodeCracker {
  static final char[] ALPHABET = {'a', 'b', 'c', 'd', 'e', 'f','g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
  static final char[] DECRYPTION_KEY = {'!', ')', '"', '(', '£', '*', '%', '&', '>', '<', '@', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o'};
  String returnMessage(String message){
    return message;
  }

  public int getPositionInAlphabet(char letter) {
    return IntStream.range(0, ALPHABET.length)
      .filter(i -> ALPHABET[i] == letter)
      .findFirst()
      .orElse(-1);
  }

  public char getLetterInDecryptionKey(int position) {
    return 'a';
  }
}
