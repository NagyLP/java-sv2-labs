//package 0.algorithms;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.List;
//
//public enum ReadAllLines {
//
//    List<Book>books =new ArrayList<>();
//
//    @BeforeEach
//    void setUp() throws IOException {
//        List<String> lines = Files.readAllLines(Paths.get("src/test/resources/books.csv"));
//        for (String s : lines) {
//            String[] lineParts = s.split(";");
//            books.add(new Book(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2]));
//        }
//    }
//
//    @Test
//    void testEmptyParametersShouldThrowException() {
//        books = new ArrayList<>();
//
//        Exception ex = assertThrows(IllegalArgumentException.class,
//                () -> new BookSearch(books).findBookByAuthorTitle("", ""));
//        assertEquals("Author or title must not be empty!", ex.getMessage());
//    }
//}