select * from userlist;
select * from lineitem;
select * from orderlist;
select user_id, orderlist.order_id, lineitem_id from lineitem, orderlist where orderlist.order_id=lineitem.order_id;

drop database cupcake;

select * from userlist;

select * from lineitem;

select * from orderlist;

drop database legohus;

select * from user;

select * from orderlist;

show tables;