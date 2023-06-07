package jsonToPojo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Address_v58;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

public class UpdateJsonWithoutPojo_59 {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object> address=objectMapper.readValue
                (new File("//Users//priyagarg//IdeaProjects//RestAssuredMaster//Mse_JacksonTutorials//src//test//resources//payloads//address.json"), new TypeReference<Map<String,Object>>() {});

        System.out.println(address.get("city"));
        address.put("city","Delhi");
        address.put("pin","12345");
        address.remove("houseNo");
        String updated=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
        System.out.println(updated);




    }
}
