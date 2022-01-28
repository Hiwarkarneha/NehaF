class  Program {

    public static void main(String[] args) {
        System.out.println("Before Exception");
        Program obj = null;
        //Program obj = new program();
        obj.fun();
        System.out.println("After Exception");
    }
        void fun(){
            System.out.println("In Fun");

        }
