INSERT INTO ROLES VALUES ( 'Admin');
INSERT INTO ROLES VALUES ( 'User');
INSERT INTO ROLES VALUES ( 'Ban');

INSERT INTO USERS (user, user_name) VALUES ('user', 'user_name');


insert into recipe (NAME, ID_USER, ID_CATEGORY, VIDEO)
    values ('Something', 1, 'hard', 'https://www.youtube.com/watch?v=zVlrcKSj4QM') ;

insert into recipe_tags values (1, 1);
insert into recipe_tags (ID_RECIPE, ID_TAGS) values (1, 3);

insert into steps (STEP_NUMBER, ID_RECIPE, NAME, BODY)
    values (1, 1, 'First of nothing', 'To be an merchant and cool');
insert into steps (STEP_NUMBER, ID_RECIPE, NAME, BODY)
    values (2, 1, 'Second of nothing', 'Do not loose money');

insert into comments (ID_STEP, BODY, ID_USER) values (2, 'This is the most hard', 1);

insert into rating (ID_RECIPE, ID_USER, MARK) values (1, 1, 1);

