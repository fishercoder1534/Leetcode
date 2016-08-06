package learnHeadFirstJava.serializationIsFun;

import java.io.Serializable;

public class GospelBook implements Serializable {
    private static final long serialVersionUID = 3141633621593356035L;
    private String name;
	private String author;
	private int order;
	
	public GospelBook(String name, String author, int order) {
		super();
		this.name = name;
		this.author = author;
		this.order = order;
	}
	public String getName(){
		return name;
	}
	public int getOrder(){
		return order;
	}
	public String getAuthor(){
		return author;
	}
}
