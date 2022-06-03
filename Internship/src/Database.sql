CREATE TABLE Pupil(
    pupilId INTEGER IDENTITY(1,1) PRIMARY KEY,
    first_name VARCHAR(128),
    last_name VARCHAR(128),
    sex VARCHAR(6),
    class VARCHAR(128)
   
);

CREATE TABLE Teacher(
    teacherId INTEGER IDENTITY(1,1) PRIMARY KEY,
    first_name VARCHAR(128),
    last_name VARCHAR(128),
    sex VARCHAR(6),
    subject VARCHAR(128)
    
);

CREATE TABLE student_teacher(
    student_id INTEGER,
    teacher_id INTEGER,
    FOREIGN KEY (student_id) REFERENCES Pupil(pupilId),
    FOREIGN KEY (teacher_id) REFERENCES Teacher(teacherId)
);

SELECT
Teacher.teacherId,
Teacher.first_name,
Teacher.last_name,
Teacher.sex,
Teacher.subject
FROM Teacher
JOIN student_teacher
ON Teacher.teacherId = student_teacher.teacher_id
JOIN Pupil 
ON Pupil.pupilId = student_teacher.student_id
WHERE Pupil.first_name = 'giorgi'
;
