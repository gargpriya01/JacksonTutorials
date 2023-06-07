package JsonPropertyExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Book;

public class JsonPropertyEx {
    public static void main(String[] args) throws JsonProcessingException {

        Book b1 = new Book();
        b1.setBookName("Data structure");
        b1.setAuthorName("Mark henry");


        ObjectMapper objectMapper=new ObjectMapper();
        String bookJsonObject = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(b1);
        System.out.println(bookJsonObject);


        Book b2=objectMapper.readValue(bookJsonObject,Book.class);
        System.out.println(b2.getAuthorName());
        System.out.println(b2.getBookName());
    }
}
