
class Emp {

    int age;
    void get(int age){
        if(age < 18){
            try{
                throw new ArithmeticException("Invalid age");
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
        }else{
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.get(10);
    }
    
}
//java.lang.ArithmeticException: Invalid age
//PS D:\1CoreJava\5Exception> 