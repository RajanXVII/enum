// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println(RAJAN.rajan.getFirstName()); 
    }
}

 enum RAJAN{
    rajan("Rajan","Sonvane",28),
    sheerin("Sheerin","Sonvane",32),
    Narjohn("John","Mesharam",34);
    
    String firstName;
    String lastName;
    int age;
    
    RAJAN(String firstName,String lastName,int age){
        this.firstName= firstName;  
        this.lastName= lastName;
        this.age= age;
    }
    
    public String getFirstName(){
       return this.firstName;
    }
    
}
