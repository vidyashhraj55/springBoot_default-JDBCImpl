
DROP TABLE IF EXISTS `authorities`;
DROP TABLE IF EXISTS `users`;





CREATE TABLE `users` (
 `username` varchar(200) NOT NULL,
`password` varchar(200) NOT NULL,
`enabled` varchar(200) NOT NULL,
 PRIMARY KEY (`username`)
);

CREATE TABLE `authorities` (
 `username` varchar(200) NOT NULL,
`authority` varchar(200) NOT NULL,
 FOREIGN KEY (`username`) REFERENCES `users` (`username`));
