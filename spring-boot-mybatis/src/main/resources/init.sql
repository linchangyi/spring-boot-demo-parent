CREATE TABLE student (
  `id` INT NOT NULL AUTO_INCREMENT,
  `sno` VARCHAR(45) NULL,
  `sname` VARCHAR(45) NULL,
  `sex` VARCHAR(45) NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO student(sno, sname, sex) VALUES ('001', 'KangKang', 'M');
INSERT INTO student(sno, sname, sex) VALUES ('002', 'Mike', 'M');
INSERT INTO student(sno, sname, sex) VALUES ('003', 'Jane', 'F');