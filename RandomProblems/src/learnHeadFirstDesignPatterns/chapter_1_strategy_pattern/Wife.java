package learnHeadFirstDesignPatterns.chapter_1_strategy_pattern;

public abstract class Wife {

	CookBehavior cookBehavior;
	LoveBehavior loveBehavior;
	
	public Wife () {
		System.out.println("I'm the abstract wife - Sophie Yan!");
	};
	
	public void setCookBehavior(CookBehavior cb){
		cookBehavior = cb;
	}
	
	public void setLoveBehavior(LoveBehavior lb){
		loveBehavior = lb;
	}
	
	public void performCook(){
		cookBehavior.cook();
	}
	
	public void performLove(){
		loveBehavior.showLove();
	}
}
