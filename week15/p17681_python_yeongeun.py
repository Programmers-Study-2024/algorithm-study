# [1차] 비밀지도

def solution(n, arr1, arr2):
    answer = []
    list1 = []
    list2 = []
    for i in range(n):
        a = bin(arr1[i])[2:]
        b = bin(arr2[i])[2:]
        list1.append('0'*(n-len(a)) + a)
        list2.append('0'*(n-len(b)) + b)
        
    for i in range(n):
        ans = ''
        for j in range(n):
            if list1[i][j] == '1' or list2[i][j] == '1':
                ans += '#'
            else:
                ans += ' '
        answer.append(ans)
    return answer
