public class Parent {

    private String secretData;

    // Constructor
    public Parent() {
        // Initialize the private variable
        this.secretData = null;
    }

    // Getter method to access the private variable
    public String getSecretData() {
        return secretData;
    }

    // Setter method to modify the private variable
    public void setSecretData(String secretData) {
        this.secretData = secretData;
    }
}

class Child extends Parent{

    public void accessSecretData()
     {
         String data = getSecretData();
         System.out.println("child attempting to access secret data:"+data);
     }

}
