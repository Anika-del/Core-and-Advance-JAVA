
class Empp {

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
        Empp e1 = new Empp();
        try{
        e1.get(10);
        }
        catch(AgeException e){
         System.out.println(e);
        }
    }

}
class AgeException extends Exception{
    String s;
    AgeException(String s){
        this.s = s;
    }
    public String toString(){
        return s;
    }
}
    
//Invalid age
