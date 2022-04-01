package org.alking.p2000;

public class P2024 {

    public int maxConsecutiveAnswers(String answerKey, int k) {
        int t = maxConsecutiveAnswers(answerKey, k, 'T');
        int f = maxConsecutiveAnswers(answerKey, k, 'F');
        return Math.max(t, f);
    }

    public int maxConsecutiveAnswers(String answerKey, int k, char c) {
        int result = 0;
        int leftPtr = 0;
        int rightPtr = 0;
        int cnt = 0;
        final int N = answerKey.length();
        if (answerKey.charAt(leftPtr) != c) {
            cnt++;
        }
        while (rightPtr < N) {

            while (rightPtr + 1 < N && cnt <= k) {
                if (answerKey.charAt(rightPtr + 1) == c) {
                    rightPtr++;
                } else if (cnt + 1 <= k) {
                    rightPtr++;
                    cnt++;
                } else {
                    break;
                }
            }
            result = Math.max(rightPtr - leftPtr + 1, result);
            if (rightPtr == N - 1) {
                break;
            }
            if (answerKey.charAt(leftPtr) != c) {
                cnt--;
            }
            leftPtr++;
        }
        return result;
    }
}
