package datasupplier;

import java.util.*;

public class GetData {

    public static List<Integer> getIntegerList= Arrays.asList(3,2,5,6,7,2,1,49,99,22,53,65,26, 87,67,78, 89,15,16,42,37);
    public static List<String> getStringList= Arrays.asList("biggest", "sale", "on", "apparels", "java", "8", "explains", "behind", "stream", "api");



    public static List<Student> getStudentData(){
        List<Student> studentsData = new ArrayList<>();
        studentsData.add(new Student("Venu", "g", 123, "1st"));
        studentsData.add(new Student("abc", "x1", 43, "2ND"));
        studentsData.add(new Student("rst", "p2", 135, "5th"));
        studentsData.add(new Student("pqr", "s4", 55, "10"));
        studentsData.add(new Student("news", "o3", 987, "9th"));
        return  studentsData;
    }

    public static Map<String, Object> getMapData(){
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("firstname", "venu");
        map.put("lname", "g");
        map.put("school", "in");
        map.put("age", 15);
        map.put("class", 10);
        return map;
    }




}
