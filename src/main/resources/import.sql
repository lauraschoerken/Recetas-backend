INSERT INTO ingredient (name, image) VALUES ('Tomate', '')
INSERT INTO ingredient (name, image) VALUES ('Pepino', '')
INSERT INTO ingredient (name, image) VALUES ('Lechuga', '')
INSERT INTO ingredient (name, image) VALUES ('Aceite', '')

INSERT INTO cookware_cutlery (name, image) VALUES ('Cuchillo', '')

INSERT INTO `requirement`( `name`) VALUES ('Ensalada')

INSERT INTO `requirement_cookware_cutlery`(`requirement_id`, `cookware_cutlery_id`) VALUES ('1','1')
INSERT INTO `requirement_ingredient`(`requirement_id`, `ingredient_id`) VALUES ('1','1')
INSERT INTO `requirement_ingredient`(`requirement_id`, `ingredient_id`) VALUES ('1','2')
INSERT INTO `requirement_ingredient`(`requirement_id`, `ingredient_id`) VALUES ('1','3')
INSERT INTO `requirement_ingredient`(`requirement_id`, `ingredient_id`) VALUES ('1','4')

INSERT INTO `steps`( `image`, `step`) VALUES ('','paso 1')
INSERT INTO `steps`( `image`, `step`) VALUES ('','paso 2')
INSERT INTO `steps`( `image`,`step`) VALUES ('', 'paso 3')

insert into recipe (title, time, requirement_id, image, info, subtitle, note)  values ('Ensalada', "00:02:00", '1','','','','')
INSERT INTO `recipe_steps`(`recipe_id`, `steps_id`) VALUES ('1','1')
INSERT INTO `recipe_steps`(`recipe_id`, `steps_id`) VALUES ('1','2')
INSERT INTO `recipe_steps`(`recipe_id`, `steps_id`) VALUES ('1','3')

