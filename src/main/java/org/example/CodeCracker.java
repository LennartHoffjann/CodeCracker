package org.example;


import java.util.stream.Collectors;
public class CodeCracker {
  final String fromKey;
  final String toKey;

  CodeCracker(final String fromKey, final String toKey) {
    this.fromKey = fromKey;
    this.toKey = toKey;
  }

  public String encrypt(String message) {
    return convert(message, fromKey, toKey);
  }

  public String decrypt(String message) {
    return convert(message, toKey, fromKey);
  }

  String convert(final String message, final String fromKey, final String toKey) {
    return message.chars()
      .mapToObj(i -> (char) i)
      .map(fromKey::indexOf)
      .map(i -> i == -1 ? ' ' : toKey.charAt(i))
      .map(Object::toString)
      .collect(Collectors.joining());
  }
}





