create database book_management_system;

use book_management_system;

CREATE TABLE author_details(
    author_id int primary key auto_increment,
    author_first_name varchar(20),
    author_last_name varchar(20));
    
create table book_details(
	book_id int primary key auto_increment,
    book_title varchar(100),
    book_author_id int,
    book_genre varchar(100),
    book_published date,
    book_cost int,
    book_image_url varchar(255),
    constraint fk_book_author_id foreign key(book_author_id) references author_details(author_id));
    
insert into author_details(author_first_name, author_last_name) values ("Rowling", "JK");
insert into author_details(author_first_name, author_last_name) values ("Geronimo", "Stilton");
insert into author_details(author_first_name, author_last_name) values ("Enid", "Blyton");

insert into book_details(book_title, book_author_id, book_cost, book_genre, book_published, book_image_url) values ("Harry Potter and the Order of Phoenix",1,400,"Fiction", "2010-05-05", "https://images.unsplash.com/photo-1626618012641-bfbca5a31239?q=80&w=1964&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
insert into book_details(book_title, book_author_id, book_cost, book_genre, book_published, book_image_url) values ("Harry Potter and the Deathly Hallows",1,500,"Fiction", "2011-10-10", "https://images.unsplash.com/photo-1611676279444-5577698aa13c?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
insert into book_details(book_title, book_author_id, book_cost, book_genre, book_published, book_image_url) values ("Harry Potter and the Chamber of Secrets",1,450,"Fiction","2014-12-12", "https://images.unsplash.com/photo-1609866138210-84bb689f3c61?q=80&w=1969&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
insert into book_details(book_title, book_author_id, book_cost, book_genre, book_published, book_image_url) values ("Famous Five",3,400,"Thriller","2010-05-05", "https://images.unsplash.com/photo-1505063366573-38928ae5567e?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
insert into book_details(book_title, book_author_id, book_cost, book_genre, book_published, book_image_url) values ("The Dragon Sword",2,250,"Commedy","2010-05-06", "https://images.unsplash.com/photo-1622673038079-de1ddac26c16?q=80&w=1887&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");

