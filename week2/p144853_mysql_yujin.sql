-- 조건에 맞는 도서 리스트 출력하기

SELECT BOOK_ID, substr(PUBLISHED_DATE,1,10) AS PUBLISHED_DATE
FROM BOOK
WHERE CATEGORY='인문' and substr(PUBLISHED_DATE,1,4)='2021'
ORDER BY PUBLISHED_DATE