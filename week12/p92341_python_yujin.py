# 주차 요금 계산

import math

def solution(fees, records):
    answer = []
    times={}
    car={}
    
    # 누적 시간 계산
    for record in records :
        time, ID, inout =record.split()
        h, m = time.split(':')
        m= int(h)*60 + int(m)
        #print(m,ID,inout)
        
        if inout == 'IN' :
            car[ID]=m
        else :  
            time = m - car[ID]
            if ID in times :
                times[ID]+=time
            else :
                times[ID]=time
            del(car[ID])
    #print(times) 
    
    # 출차 안한 차 누적 계산
    for ID, m in car.items():
        time = 23 * 60 + 59 - m
        if ID in times:
            times[ID] += time
        else:
            times[ID] = time        
    #print(times)
            
    # 주차 요금 계산 및 정렬
    for ID, m in times.items():
        time=max(0,m-fees[0])
        # 올림 계산 ceil
        money = fees[1]+ math.ceil(time/fees[2]) * fees[3]
        times[ID]=money
    times=sorted(times.items())
    #print(times)
    
    for ID,money in times:
        answer.append(money)
        
    return answer
