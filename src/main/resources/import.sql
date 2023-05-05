INSERT INTO ingredient (name) VALUES ('Tomate')
INSERT INTO ingredient (name) VALUES ('Lechuga')
INSERT INTO ingredient (name) VALUES ('Pepino')
INSERT INTO ingredient (name) VALUES ('Aceite')

INSERT INTO cookware_cutlery (name) VALUES ('Cuchillo')

INSERT INTO `requirement`( `name`) VALUES ('Ensalada')

INSERT INTO `requirement_cookware_cutlery`(`requirement_id`, `cookware_cutlery_id`) VALUES ('1','1')
INSERT INTO `requirement_ingredient`(`requirement_id`, `ingredient_id`) VALUES ('1','1')
INSERT INTO `requirement_ingredient`(`requirement_id`, `ingredient_id`) VALUES ('1','2')
INSERT INTO `requirement_ingredient`(`requirement_id`, `ingredient_id`) VALUES ('1','3')
INSERT INTO `requirement_ingredient`(`requirement_id`, `ingredient_id`) VALUES ('1','4')



insert into recipe (title, time, requirement_id)  values ('Ensalada', "00:02:00", '1');


