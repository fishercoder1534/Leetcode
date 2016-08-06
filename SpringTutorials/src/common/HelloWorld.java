package common;

import lombok.Setter;

public class HelloWorld {
	@Setter 
    private String message;

//    public void setMessage(String message) {
//        this.message = message;
//    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void init() {
        System.out.println("Bean HelloWorld is going through init.");
    }

    public void destroy() {
        System.out.println("Bean HelloWorld will destroy now.");
    }
}
