package spring_java_annotation_based_di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import common.Gospel1;
import common.HelloWorld;
import common.TextEditor;

/**
 * This is to demo java-annotation-based Spring configuration/dependency
 * Injection.
 */
public class MainAppForDemoJavaAnnotationBasedDI {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(Gospel1Config.class, TextEditorConfig.class,
                HelloWorldConfig.class);
        ctx.refresh();

        Gospel1 luke = ctx.getBean(Gospel1.class);
        luke.setReflection("Gospel 1 is the book of Luke!");
        System.out.println(luke.getReflection());

        TextEditor te = ctx.getBean(TextEditor.class);
        te.spellCheck();

        HelloWorld hw = ctx.getBean(HelloWorld.class);

        System.out.println("The program ends!");
    }

}
