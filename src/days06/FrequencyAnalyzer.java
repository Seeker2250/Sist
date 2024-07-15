package days06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyAnalyzer {
  public static void main(String[] args) {
    // 텍스트 파일 경로 지정
    String filePath = "/Users/junst/SsEducation/src/days06/asdf";

    // 단어 빈도 저장용
    Map<String, Integer> wordFrequency = new HashMap<>();
    // 문장에 결속된 단어 체크용
    Map<String, Integer> prefixFrequency = new HashMap<>();

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = br.readLine()) != null) {
        //특수 문자 제거
        line = line.replaceAll("[^\\p{L}\\s]", " ");

        // 각 라인 단어로 분리, 배열로
        String[] words = line.split("\\s+");

        // 각 단어 빈도 계산 foreach 써먹어보장
        for (String word : words) {
          word = word.toLowerCase(); // 영어면 싹 다 소문자로 쳐버려
          if (!word.isEmpty()) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);

            // 공백을 제거 및 문장 결속 단어 빈도 계산
            String cleanedWord = word.replaceAll("\\s", "");
            for (int i = 2; i <= cleanedWord.length(); i++) { // 2글자 이상 단어만 고려
              String prefix = cleanedWord.substring(0, i);
              prefixFrequency.put(prefix, prefixFrequency.getOrDefault(prefix, 0) + 1);
            }
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    // 단어 빈도 내림차순으로 정렬&출력
    System.out.println("단어 빈도 (내림차순):");
    List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordFrequency.entrySet());
    sortedWords.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue())); // 내림차순 정렬

    for (Map.Entry<String, Integer> entry : sortedWords) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    // 문장 결속 단어도 빈도 내림차순 정렬&출력
    System.out.println("\n접두사 빈도 (2글자 이상, 내림차순):");
    List<Map.Entry<String, Integer>> sortedPrefixes = new ArrayList<>(prefixFrequency.entrySet());
    sortedPrefixes.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue())); // 빈도 순으로 내림차순 정렬

    for (Map.Entry<String, Integer> entry : sortedPrefixes) {
      if (entry.getKey().length() >= 2) { // 글자 수가 2개 이상인 접두사만 출력
        System.out.println(entry.getKey() + ": " + entry.getValue());
      }
    }
  }
}
