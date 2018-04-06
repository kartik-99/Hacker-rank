public class JavaReflection {

    public static void main(String[] args){
        Class student = (new Student()).getClass();
        Method[] methods =student.getDeclaredMethods();
        ArrayList<String> methodList = new ArrayList<>();
        String methodName, fullName;
        for(Method i: methods){
            fullName = i.toString();
            //System.out.println("Got String : "+fullName);
            methodName = fullName.substring(fullName.indexOf("Student.")+8, fullName.indexOf('('));
            methodList.add(methodName);
        }
        
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}