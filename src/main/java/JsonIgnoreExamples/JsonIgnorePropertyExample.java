package JsonIgnoreExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Employee_60;

public class JsonIgnorePropertyExample {
    public static void main(String[] args) throws JsonProcessingException {
        /*String jsonString = "{\n" +
                "  \"name\" : \"Amod\",\n" +
                "\"age\" : 30,\n" +
                "\"married\" : true,\n" +
                "\"address\" : \"modinagar\",\n" +
                "\"mobileNo\":\"1237684\"\n" +
                "}";*/

        String jsonString = "{\n" +
                "  \"name\" : \"Amod\",\n" +
                "\"age\" : 30,\n" +
                "\"skills\" : \"java\"\n" +
                "}";

    ObjectMapper objectMapper=new ObjectMapper();
        Employee_60 employee=objectMapper.readValue(jsonString, Employee_60.class);
        System.out.println(employee.getAge());
        System.out.println(employee.getAddress());
        System.out.println(employee.getName());
        System.out.println(employee.getMobileNo());
        System.out.println(employee.isMarried());
}}
