Author author1 = new Author("George RR Martin","1948");
Book book1 = new Book("Game of Thrones", "Novel", "1996", author1);

book1.toString();
book1.toString2();
author1.toString();

book1.isModern();
author1.setYearOfBirth("1800");
book1.toString2();
book1.isModern();
