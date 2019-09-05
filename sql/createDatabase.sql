DROP TABLE IF EXISTS user_roles;
DROP TABLE IF EXISTS advert_images;
DROP TABLE IF EXISTS adverts;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS roles;

DROP TABLE IF EXISTS images;
DROP TABLE IF EXISTS sub_categories;
DROP TABLE IF EXISTS main_categories;

DROP TABLE IF EXISTS addresses;


create table addresses(
	id bigint PRIMARY KEY auto_increment,
    city varchar(225) not null,
    postal_code varchar(45) not null,
    street varchar(225) not null,
    street_nr varchar(45),
    apartment_nr varchar(45));
    

CREATE TABLE users(
	id bigint PRIMARY KEY auto_increment, 
    first_name VARCHAR(255) not null, 
    last_name VARCHAR(255) not null, 
    email VARCHAR(255) not null, 
    address_id bigint ,
    foreign key (address_id) references addresses(id), 
    passsword varchar(255) not null);



CREATE TABLE roles(
	id bigint PRIMARY KEY AUTO_INCREMENT, 
    name VARCHAR(255) not null);
    
CREATE TABLE user_roles(
	role_id bigint not null,
    user_id bigint not null,
	constraint fk_user_roles_role foreign key (role_id) references roles(id), 
    constraint fk_user_roles_user foreign key (user_id) references users(id));

    
create table adverts(
	id bigint PRIMARY KEY AUTO_INCREMENT, 
    user_id bigint not null,
    foreign key (user_id) references users(id),
    date_created date not null,
    date_updated date not null,
    date_canceled date not null,
    date_end date not null,
    title varchar(255) not null,
    adv_description text not null,
    is_active boolean not null,
    address_id bigint not null,
    foreign key (address_id) references addresses(id));
    
create table images(
	id bigint PRIMARY KEY AUTO_INCREMENT);
    
create table advert_images(
	advert_id bigint not null,
    image_id bigint not null,
	constraint fk_advert_images_advert foreign key (advert_id) references adverts(id),
    constraint fk_advert_images_image foreign key (image_id) references images(id));

create table main_categories(
	id bigint PRIMARY KEY AUTO_INCREMENT,
    title varchar(255));
    
create table sub_categories(
	id bigint PRIMARY KEY AUTO_INCREMENT,
    title varchar(255),
    main_category_id bigint not null,
    foreign key (main_category_id) references main_categories(id));
    
INSERT INTO addresses(city, postal_code, street, street_nr, apartment_nr) VALUES('Warszawa', '00-023', 'Marszałkowska', '12A','10');
INSERT INTO addresses(city, postal_code, street, street_nr, apartment_nr) VALUES('Warszawa', '00-023', 'Nowogródzka', '120','25');
INSERT INTO addresses(city, postal_code, street, street_nr) VALUES('Warszawa', '00-023', 'Konopnickiej', '56');

INSERT INTO users(first_name, last_name, email, address_id, passsword) VALUES('Alicja', 'Mogielnicka', 'ala@wp.pl', '1','ala123');
INSERT INTO users(first_name, last_name, email, address_id, passsword) VALUES('Anna', 'Nowak', 'anna@wp.pl', '3','anna123');
INSERT INTO users(first_name, last_name, email, address_id, passsword) VALUES('Tomasz', 'Mogielnicki', 'tom@wp.pl', '2','tom');
INSERT INTO users(first_name, last_name, email, address_id, passsword) VALUES('John', 'Nowak', 'john@wp.pl', '3','jgj4');