select round(
    (
    100 * (select count(*) from Delivery d where d.order_date = d.customer_pref_delivery_date)/
        (select count(*) from Delivery)
        ),
    2) as immediate_percentage;