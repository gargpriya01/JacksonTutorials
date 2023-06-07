package JsonPropertyExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Book;
import pojo.Book1_v70;

public class BuilderAnnotationExample_v70 {
    public static void main(String[] args) throws JsonProcessingException {

        Book1_v70 b1 = Book1_v70.builder()
                        .bookName("Data structure")
                                .authorName("Mark Henry")
                                        .build();

        ObjectMapper objectMapper=new ObjectMapper();
        String bookJsonObject = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(b1);
        System.out.println(bookJsonObject);


        Book b2=objectMapper.readValue(bookJsonObject,Book.class);
        System.out.println(b2.getAuthorName());
        System.out.println(b2.getBookName());

        Book1_v70 book1V70=b1.toBuilder()
                .bookName("abc")
                .authorName("Mark Henry")
                .build();

        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(book1V70));
    }
}
