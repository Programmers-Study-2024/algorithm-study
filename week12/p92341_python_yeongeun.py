# 주차 요금 계산

import math
def solution(fees, records):
    answer = []    
    time, fee, time_a, fee_a = fees
    
    dic = {} # 누적 주차 시간 계산
    t = [] # 입차 시간
    r = [] # 차량 번호
    for i in range(len(records)):
        record = records[i].split(' ')
        total = 0
        if record[2] == "IN":
            t.append(record[0])
            r.append(record[1])
        else:
            if record[1] in r:
                i = t[r.index(record[1])] # 해당 차량의 입차 시간
                o = record[0] # 출차 시간
                
                r.remove(record[1]) # r에서 삭제
                t.remove(i) # t에서 삭제
                
                m = int(o[-2:])-int(i[-2:]) # 분                
                h = int(o[:2])-int(i[:2]) # 시
                if m < 0:
                    h -= 1
                    m += 60
                total = h*60 + m
                # 누적 주차 시간 계산
                try : 
                    dic[record[1]] += total
                except : 
                    dic[record[1]] = 0
                    dic[record[1]] += total

    if r: # 출차된 내역이 없는 경우
        for i in range(len(r)):
            m = 59 - int(t[i][-2:])
            h = 23 - int(t[i][:2])
            total = h*60 + m
            try :
                dic[r[i]] += total
            except:
                dic[r[i]] = 0
                dic[r[i]] += total

    # 정렬 : 차량번호 작은 자동차부터
    dic = sorted(dic.items(),key=lambda x:x[0])
    answer = []
    for i in range(len(dic)):
        if dic[i][1] <= time: # 기본시간 time이하
            answer.append(fee) # 기본요금
        else:
            # 기본요금 + 초과한 시간마다 단위시간별 단위요금
            if (dic[i][1]-time)%time_a != 0: # 나누어떨어지지 않으면, 올림
                answer.append(fee + math.ceil((dic[i][1]-time)/time_a)*fee_a)
            else:
                answer.append(fee+((dic[i][1]-time)/time_a)*fee_a)    
    
    return answer
