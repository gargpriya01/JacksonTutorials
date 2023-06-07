package JacksonAnnotationExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Employee_60;

public class UseJsonIncludeAtFieldLevel {
    public static void main(String[] args) throws JsonProcessingException {
        Employee_60 employee=new Employee_60();
        employee.setName("Amod");
        employee.setAge(0);
        employee.setMobileNo("234578");
        employee.setMarried(false);
        employee.setAddress("KA");

        ObjectMapper objectMapper=new ObjectMapper();
        String jsonString=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
        System.out.println(jsonString);
    }
}
