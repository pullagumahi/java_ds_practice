package addition;

public class Add {

    static int addition(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

   /*
      1. read two numbers from the user.
      2. use arithmetic operators to calculate result/addition.
      3. c = a + b;
      4. print result to the console,screen,file or data base 
   */
    public static void main(String[] args) throws Exception {
        System.out.println(Add.addition(1,2));//3
    }
}
