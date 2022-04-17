class ConsoleIOEx1{

    public static void main(String[] args) {
        try {
               System.out.println("Enter a character!");
               int a = System.in.read();
               System.out.println("Character Entered!" + (char)a);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}