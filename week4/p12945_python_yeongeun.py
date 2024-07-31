# 피보나치 수

def solution(n):
    f_num = [0,1] # 초기값 설정
    for i in range(2,n+1): # f[2]부터 f[n]까지 구해주기
        f_num.append(f_num[i-2] + f_num[i-1]) # f[2] = f[0] + f[1]
    #print(f_num)
    return f_num[-1]%1234567 # 항상 마지막값이 f[n]이기 때문에, f[n] = f[-1]
