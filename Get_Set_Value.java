package revision;
class Employee{
    String name ;
    int id ;
    int age ;

    public String getName(){
        return name ;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
         this.id=id;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int z){
        age = z ;
    }
}
class Get_Set_Value{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Ujjwal Kumar");
        System.out.println("Name : "+ e.getName());
        e.setId(1);
        System.out.println("Id : "+ e.getId());
        e.setAge(22);
        System.out.println("Age : "+ e.getAge());
    }
}
