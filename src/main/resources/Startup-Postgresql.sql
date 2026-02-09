
INSERT INTO permissions (addssubscriptions,editspeople) VALUES ('TRUE','TRUE');
INSERT INTO permissions (addssubscriptions,editspeople) VALUES ('TRUE','TRUE');
INSERT INTO permissions (addssubscriptions,editspeople) VALUES ('TRUE','TRUE');


INSERT INTO person (firstName,lastName,login,password,permissionsID) VALUES ('Theodore','Petrosky','tedpet','3368',1);
INSERT INTO person (firstName,lastName,login,password,permissionsID) VALUES ('Joe','Folta','jfolta','3368',2);
INSERT INTO person (firstName,lastName,login,password,permissionsID) VALUES ('Debbie','Heltzer','dheltzer','3368',3);

INSERT INTO subscription (emailaccount,personid,subid,subpassword,subscrptionname,datesubscribed,retired) 
VALUES 
('dheltzer@agencysacks.com','3','SubcriptionID','password','Monday','2025-10-03','false');

INSERT INTO subscription (emailaccount,personid,subid,subpassword,subscrptionname,datesubscribed, retired) 
VALUES 
('jfolta@agencysacks.com','2','SubcriptionID','the password','Tuesday','2024-10-03','false');
