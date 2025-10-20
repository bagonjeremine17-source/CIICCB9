
// package class
public class Main {

        // reserve method
        public static void main(String[] args) {


            //method to ouput Hello World
            System.out.println("Hello World");
            Plant plant1=new Plant();
            plant1.name="Papaya";
            System.out.println(plant1.name);
            System.out.println(plant1.getBranch());

        }

    }
    //class
    class Plant{
        //variables
        int Branch;
        String name;
        int leaves;

        //method
        void setBranch(int leaves){

            this.leaves=leaves;


         } 
         
         public int getBranch() {
             return Branch;
         }


    
        }
        








    



