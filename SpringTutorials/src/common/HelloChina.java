package common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class HelloChina {

//    public HelloChina() {
//    }
    
    @Setter @Getter//these Lombok annotations eventually work in my own Eclipse and project now, I can safely comment out/remove those boilerplate code! Cool!
    private String message;

//    public void getMessage() {
//    	System.out.println(message);
//    }

    public void setMessage(String message) {
        this.message = message;
    }

    // this init() method is required b/c I'm using HelloWorld as this
    // HelloChina's parent bean
    public void init() {
        System.out.println("Bean HelloChina is going through init.");
    }

    // this destroy() method is required b/c I'm using HelloWorld as this
    // HelloChina's parent bean
    public void destroy() {
        System.out.println("Bean HelloChina will destroy now.");
    }

}
