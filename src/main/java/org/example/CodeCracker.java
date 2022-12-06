package org.example;


import java.util.stream.Collectors;
public class CodeCracker {

  String convert(final String message, final String fromKey, final String toKey) {
    return message.chars()
      .mapToObj(i -> (char) i)
      .map(fromKey::indexOf)
      .map(i -> i == -1 ? ' ': toKey.charAt(i))
      .map(Object::toString)
      .collect(Collectors.joining());
  }


}



