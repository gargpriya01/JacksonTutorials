package JacksonAnnotationExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Employee_60;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeWithAllData_60 {
    public static void main(String[] args) throws JsonProcessingException {

        Employee_60 emp1=new Employee_60();
        emp1.setName("Amod");
        emp1.setAge(0);
       // emp1.setAddress("BLR");
        emp1.setMarried(true);
        emp1.setMobileNo("123123");

        emp1.setSkillset(new ArrayList<String>());
        emp1.setFamilyMembers(new HashMap<String, String>());


        ObjectMapper mapper=new ObjectMapper();
        String emp1JsonFormat=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp1);
        System.out.println(emp1JsonFormat);

    }
}
