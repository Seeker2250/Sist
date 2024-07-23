package days17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject
 * @Contents
 */
public class Ex01 {
  public static void main(String[] args) {
    String fileName = "./src/days17/SS21_Team.txt";
    String myName = "김준석";
    String teamLeader = null;
    String teamMemberLine = null;
    String teamLine = null;
    String[] teamMembers = null;//팀원들 저장할 arrray
    String regex = "\\s*, \\s*";
    String key = "user.dir";
    String userDir = System.getProperty(key);
    System.out.println(userDir);
    fileName = String.format("%s/src/days17/SS21_Team.txt", userDir, fileName);
    System.out.println(fileName);

    try (
        FileReader reader = new FileReader(fileName);//file 읽어
        BufferedReader br = new BufferedReader(reader);
    ) {
      while ((teamLine = br.readLine()) != null) {
        //바로 다음 라인 읽으면
        teamMemberLine = br.readLine();
        if (teamMemberLine.contains(myName)){
          break;
        }//if
      }//while
//      System.out.println(teamLine);
//      System.out.println(teamMemberLine);
      teamMembers = teamMemberLine.split(regex);//Array가 돼
      String prefix = "[팀장]";
      for (int i = 0; i < teamMembers.length; i++) {
        if(teamMembers[i].trim().startsWith(prefix))
          teamLeader = teamMembers[i].replace(prefix,"");
      }
//      나머지 팀원들을 정렬해서 배열에 채워넣기
      String [] temp = new String[teamMembers.length-1];//팀장 빼고
      System.arraycopy(teamMembers, 1, temp,0, teamMembers.length-1);//1번째 방부터 채움(팀장 제외 담아)
//      System.out.println(Arrays.toString(temp));
      Arrays.sort(temp);
//      System.out.println(Arrays.toString(temp));
      System.arraycopy(temp, 0, teamMembers,1, temp.length);// 팀장 제외 오름차순 정렬해서 담아

//      Arrays.sort(temp(s1, s2)->s1.compareTo(s1));

      StringBuilder sb = new StringBuilder(teamLine+"\n");
//      System.out.println("["+sb.toString()+" ]\n");
      sb.append("<ul>\n");
      sb.append("\tclass=\"leader\">"+teamLeader+"\n");
      sb.append("\t<li>");
      sb.append(String.join("</li>\n\t<li>", temp));
      sb.append("</li>\n</ul>\n");
      System.out.println(sb.toString());

    } catch (Exception e) {

    }
  }
}
