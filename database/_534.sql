select a1.player_id, a1.event_date, sum(a2.games_played) as games_played_so_far from Activity a1
inner join Activity a2
on a1.player_id = a2.player_id and a1.event_date >= a2.event_date
group by a1.player_id, a1.event_date;