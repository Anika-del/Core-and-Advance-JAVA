

class Emp1 {

    int age;
    void get(int age)throws AgeException
    {
        if(age < 18)
        {
                throw new AgeException("Invalid age");
        }else{
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Emp1 e1 = new Emp1();
        try{
        e1.get(10);
        }
        catch(AgeException e){
            System.out.println(e);
        }
    }
    class AgeException extends Exception{
        AgeException(String s){
            super(s);
        }
    }
    //Emp1$AgeException: Invalid age
    
}
