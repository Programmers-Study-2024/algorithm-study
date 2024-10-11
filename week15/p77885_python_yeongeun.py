# 2개 이하로 다른 비트

def solution(numbers):
    answer = []
    for num in numbers:
        bin_num = list('0' + bin(num)[2:])
        
        # 가장 오른쪽 0을 찾아서 1로 바꿔주기
        idx = ''.join(bin_num).rfind('0')
        bin_num[idx] = '1'
        
        # 홀수인 경우 / 7 = 0111, 1111보단 1011이 더 작은 값
        if num % 2 == 1:
            bin_num[idx+1] = '0'
        answer.append(int(''.join(bin_num),2))
    return answer
