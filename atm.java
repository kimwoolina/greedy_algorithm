import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 사람 수 입력 및 검증
        int n = sc.nextInt();
        if (n < 1 || n > 1000) {
            System.out.println("사람 수는 1에서 1000 사이여야 합니다.");
            return;
        }
        
        int[] numbers = new int[n];

        // 각 사람의 인출 시간 입력 받기
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // 인출 시간을 오름차순 정렬
        Arrays.sort(numbers);

        // 최소 시간 계산
        int result = 0;
        int waitingTime = 0;
        for (int i = 0; i < n; i++) {
            waitingTime += numbers[i];
            result += waitingTime;  // 대기 시간을 누적하여 계산
        }

        // 결과 출력
        System.out.println(result);
        
        // Scanner 리소스 해제
        sc.close();
    }
}
