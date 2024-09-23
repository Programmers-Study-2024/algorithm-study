select A.NAME, A.DATETIME from ANIMAL_INS A left outer join ANIMAL_OUTS Bon A.ANIMAL_ID = B.ANIMAL_IDwhere B.ANIMAL_ID is null
order by A.DATETIME
    limit 3;