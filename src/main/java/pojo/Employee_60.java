package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import java.util.List;
import java.util.Map;

//@JsonInclude(JsonInclude.Include.NON_DEFAULT)
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonInclude(JsonInclude.Include.NON_EMPTY)
//@JsonIncludeProperties(value={"name","age"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee_60 {
    private String name;
    private int age;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private boolean married;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String address;
    private String mobileNo;
    private List<String> skillset;
    private Map<String,String> familyMembers;

    public List<String> getSkillset() {
        return skillset;
    }

    public void setSkillset(List<String> skillset) {
        this.skillset = skillset;
    }

    public Map<String, String> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(Map<String, String> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }




}
