select
    round(
        ifnull(
        (select count(distinct requester_id,accepter_id) from request_accepted)
        /
        (select count(distinct sender_id, send_to_id) from friend_request)
        ,0)
    ,2)
    as accept_rate;

--The divisor (total number of requests) could be '0'
--if the table friend_request is empty.
--So, we have to utilize ifnull to deal with this special case.