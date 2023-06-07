package JacksonAnnotationExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.EmployeeSkills;
import pojo.Employee_60;

public class UseJsonIncludePropertiesAtSubclassLevel_v64 {
    public static void main(String[] args) throws JsonProcessingException {
        EmployeeSkills employee=new EmployeeSkills();
        employee.setName("Amod");
        employee.setAge(0);
        employee.setMobileNo("234578");
        employee.setMarried(false);
        employee.setAddress("KA");
        employee.setSkills("Java");

        ObjectMapper objectMapper=new ObjectMapper();
        String jsonString=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
        System.out.println(jsonString);
    }
}
