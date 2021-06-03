
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //First Employee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstname", "Dang");
        employeeDetails.put("lastname", "Kim Thi");
        employeeDetails.put("website", "codelean.vn");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        //Second Employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstname", "Code");
        employeeDetails2.put("lastname", "Lean");
        employeeDetails2.put("website", "codelean.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);

        //Add employees to list
        JSONArray emloyeeList = new JSONArray();
        emloyeeList.add(employeeObject);
        emloyeeList.add(employeeObject2);

        //Write JSON file
        try(FileWriter file = new FileWriter("employees.json")){

            file.write(emloyeeList.toJSONString());
            file.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
