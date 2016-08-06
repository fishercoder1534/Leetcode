package spring_java_annotation_based_di;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import common.SpellChecker;
import common.TextEditor;

@Configurable
public class TextEditorConfig {

    // @Bean
    // public TextEditor textEditor() {
    // return new TextEditor();
    // }

    @Bean
    public TextEditor textEditor() {
        System.out
                .println("TextEditorConfig.java is getting called now and it's inside textEditor() method now.");
        return new TextEditor(spellChecker());
    }

    @Bean
    public SpellChecker spellChecker() {
        System.out
                .println("TextEditorConfig.java is getting called now and it's inside spellChecker() method now.");
        return new SpellChecker();
    }
}
