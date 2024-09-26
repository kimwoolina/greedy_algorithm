import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String expression = sc.nextLine();  // 수식을 입력 받음
        String[] minusSplit = expression.split("-");  // '-'를 기준으로 분리
        
        int result = Integer.MAX_VALUE;  // 처음엔 임의의 큰 값으로 초기화

        for (int i = 0; i < minusSplit.length; i++) {
            String part = minusSplit[i];  // '-'로 나뉜 부분들
            
            int sum = 0;
            String[] plusSplit = part.split("\\+");  // '+'로 다시 분리
            
            // 각 부분을 더함
            for (String num : plusSplit) {
                sum += Integer.parseInt(num);
            }

            // 첫 번째 부분은 그냥 더하고, 나머지는 빼기
            if (result == Integer.MAX_VALUE) {
                result = sum;
            } else {
                result -= sum;
            }
        }

        System.out.println(result);  // 최종 결과 출력
    }
}