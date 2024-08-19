-- 상품 별 오프라인 매출 구하기
SELECT PRODUCT_CODE, SUM(SALES_AMOUNT)*PRICE AS SALES
FROM PRODUCT JOIN OFFLINE_SALE
ON PRODUCT.PRODUCT_ID=OFFLINE_SALE.PRODUCT_ID
GROUP BY PRODUCT_CODE
ORDER BY SALES DESC, PRODUCT_CODE
