package week11;
/**
 * lv 2
 * 스킬트리
 */
public class p49993_java_harin {
    class Solution {
        public int solution(String skill, String[] skill_trees) {
            int answer = 0;
            for (int i=0; i<skill_trees.length; i++){
                // skill 제외한 문자 ""로 치환
                String stree = skill_trees[i].replaceAll("[^" + skill + "]", "");
                for (int j = 0; j < skill.length() + 1; j++) {
                    String sub_skill = skill.substring(0, j); // skill을 한 글자씩 잘라
                    if (stree.equals(sub_skill)) {
                        answer++;
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
