-- 성분으로 구분한 아이스크림 총 주문량

SELECT INGREDIENT_TYPE, SUM(TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF, ICECREAM_INFO
WHERE FIRST_HALF.FLAVOR=ICECREAM_INFO.FLAVOR
GROUP BY INGREDIENT_TYPE
ORDER BY 2