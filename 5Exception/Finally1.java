
class Finally1 {

    static int show(){
        try{
           System.out.println(0);// System.exit(0);
            int x = 10/0;
            return 20;
        }
        catch(NullPointerException e){
            System.err.println(e);
        }
        finally{
            return 40;
        }
    }

    public static void main(String[] args) {
        int z = show();
        System.out.println(z);
        // finally f1 = null;
        // f1.show();
    }}

// PS D:\1CoreJava\5Exception> cd "d:\1CoreJava\5Exception\" ; if ($?) { javac Finally1.java } ; if ($?) { java Finally1 }    
// 0
// 40
