package com.company;

public class Main {

    public static void main(String[] args) {
	// Скрипты
//        create table visitors (
//                visitors_full_name varchar(50) not null foreign key,
//                visitors_birth varchar(10) not null,
//                visitors_gender varchar(8) not null
//        )
//
//        create table visits (
//                visitor varchar references visitors(visitors_full_name),
//                visit_time timestamp,
//                visit_trainer integer references trainers(trainer_id) foreign key
//        )


//        1. Для хранения данных изменения и обработки.
//        2. Primary Key это первичный ключ - поле в таблице, которая не может иметь значения нулл, также
//                он должен содержать только уникальные значения.
//        3. Foreign Key нужен для того, что бы предоставить определённую ссылку для связи между двумя таблицами.
//        4. Отличие колонок от таблиц заключается в том, что колонки не делятся на строки,
//                а являются одним и тем же массивом текста, расположенным в колонках на одной странице рядом.
//        5. Электронные таблицы - это эксель, т. е. столбики и колонки. Реляционные
//        базы данных - это когда объекты записей связываются по правилам, например один к одному или один ко многим.
//        6. CRUD — акроним, обозначающий четыре базовые функции, используемые при работе с базами данных:
//        создание (англ. create), чтение (read), модификация (update), удаление (delete).
    }
}
