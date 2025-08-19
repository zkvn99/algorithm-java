-- 코드를 작성해주세요

select count(fi.ID) as FISH_COUNT from FISH_INFO as fi join fish_name_info as fni on fi.FISH_TYPE = fni.FISH_TYPE where fni.FISH_NAME IN ('BASS', 'SNAPPER')