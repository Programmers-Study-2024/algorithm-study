-- 조건에 맞는 사용자와 총 거래금액 조회하기
SELECT USER_ID, NICKNAME, SUM(PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD B JOIN USED_GOODS_USER U ON B.WRITER_ID = U.USER_ID
WHERE STATUS = 'DONE'
-- HAVING절에 SELECT문에 있는 집계함수 쓸 수 있는거 알게됨
GROUP BY WRITER_ID HAVING TOTAL_SALES >= 700000
ORDER BY TOTAL_SALES;