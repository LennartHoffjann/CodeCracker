package org.example;


import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodeCracker {
  static final char[] ALPHABET = {'a', 'b', 'c', 'd', 'e', 'f','g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
  static final char[] DECRYPTION_KEY = {'!', ')', '"', '(', '£', '*', '%', '&', '>', '<', '@', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o'};

  String encryptMessage(String message) {
    return message.chars()
      .mapToObj(i -> (char) i)
      .map(i -> getLetterInDecryptionKey(getPositionInAlphabet(i)))
      .map(Object::toString)
      .collect(Collectors.joining());
  }

  int getPositionInAlphabet(char letter) {
    return IntStream.range(0, ALPHABET.length)
      .filter(i -> ALPHABET[i] == letter)
      .findFirst()
      .orElse(-1);
  }

  char getLetterInDecryptionKey(int position) {
    return position == -1 ? ' ' : DECRYPTION_KEY[position];
  }

  String decryptMessage(String message) {
    return message.chars()
      .mapToObj(i -> (char) i)
      .map(i -> getLetterInAlphabet(getPositionInDecryptionKey(i)))
      .map(Object::toString)
      .collect(Collectors.joining());
  }

  int getPositionInDecryptionKey(char letter) {
    return IntStream.range(0, DECRYPTION_KEY.length)
      .filter(i -> DECRYPTION_KEY[i] == letter)
      .findFirst()
      .orElse(-1);
  }

  char getLetterInAlphabet(int position) {
    return position == -1 ? ' ' : ALPHABET[position];
  }


}



