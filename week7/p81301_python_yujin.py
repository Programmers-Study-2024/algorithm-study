# 숫자 문자열과 영단어

def solution(s):
    NUM = {'zero':'0',
           'one':'1',
           'two':'2',
           'three':'3',
           'four':'4',
           'five':'5',
           'six':'6',
           'seven':'7',
           'eight':'8',
           'nine':'9'
          }
    for key, value in NUM.items():
        s=s.replace(key,value)
    return int(s)
