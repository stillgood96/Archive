------------- Member ------------------
create table if not exists Member(
    member_no int not null primary key,
    member_id int not null,
    password varchar(100) not null,
    create_date date default now(),
    update_date date default now(),
    delete_date date default null
);
------------- Board ------------------
create table if not exists Board(
    board_no int not null primary key,
    board_name varchar(100) not null,
    create_date date default now(),
    update_date date default now(),
    delete_date date default null
);
------------- Post ------------------
create table if not exists Post(
    board_no int not null,
    post_no int not null primary key,
    post_title varchar(100) not null,
    post_contents text,
    post_file_url varchar(255),
    member_no int not null,
    create_date date default now(),
    update_date date default now(),
    delete_date date default null,
    foreign key (board_no)
    references Board(board_no) on update cascade on delete restrict,
    foreign key (member_no)
    references Member(member_no) on update cascade on delete restrict
);

