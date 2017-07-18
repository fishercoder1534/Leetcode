--solution 1:
update salary
set sex = CHAR(ASCII('f') ^ ASCII('m') ^ ASCII(sex));

--solution 2:
update salary
set sex = case sex
    when 'm' then 'f'
    else 'm'
    end;

