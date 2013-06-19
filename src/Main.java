  class tree{
      int height;
      tree(){
            System.out.println(" grow tree" );
          height = 0;
      tree(int InitialHeight){
              InitialHeight = height;
              System.out.println(" height of our tree is - "+ height +" m ");

          }
      void info(){
          System.out.println(" now is - "+ height +" m ");
      }
      void info(String s){
           System.out.println(s+ " now is - "+ height +" m ");

       }

      }

public class Main {

    public static void main(String[] args) {
    for(int i=0; i<5; i++){
        tree t =  new tree(i);
        t.info();
        t.info("overloading method");
    }
        new tree();
    }
}
