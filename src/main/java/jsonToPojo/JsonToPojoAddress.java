package jsonToPojo;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Address_v58;

import java.io.File;
import java.io.IOException;

public class JsonToPojoAddress {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Address_v58 address=objectMapper.readValue
                (new File("//Users//priyagarg//IdeaProjects//RestAssuredMaster//Mse_JacksonTutorials//src//test//resources//payloads//address.json"), Address_v58.class);
        System.out.println(address.getCity());
        address.setCity("Delhi");
       // System.out.println(address.getCity());

        String updatedJson1=objectMapper.writeValueAsString(address);
        System.out.println(updatedJson1);

        updatedJson1=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
        System.out.println(updatedJson1);

    }
}
