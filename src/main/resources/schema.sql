------------- Member ------------------
create table Member(
    member_no int not null primary key,
    member_id int not null,
    password varchar(100) not null,
    create_date date default now(),
    update_date date default now(),
    delete_date date default null
);