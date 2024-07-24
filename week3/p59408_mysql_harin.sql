-- 중복 제거하기
SELECT count(name) as count
FROM (
    SELECT NAME
    FROM ANIMAL_INS
    WHERE NAME IS NOT NULL GROUP BY NAME
    ) A