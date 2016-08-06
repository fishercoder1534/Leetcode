package learnHeadFirstDesignPatterns.chapter_2_observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class CoreFamilyImpl implements CoreFamily {

	private String coreFamilyName;

	private String bibleReadingProgress;
	
	private int monthsWeMarried;
	
	private int timesWeHiked;
	
	private List<Relative> relatives;
	
	public CoreFamilyImpl(String bibleReadingProgress, String coreFamilyName, int monthsWeMarried, int timesWeHiked) {
		this.relatives = new ArrayList<Relative>();
		this.bibleReadingProgress = bibleReadingProgress;
		this.coreFamilyName = coreFamilyName;
		this.monthsWeMarried = monthsWeMarried;
		this.timesWeHiked = timesWeHiked;
	}
	
	@Override
	public void registerRelative(Relative relative) {
		relatives.add(relative);
	}

	@Override
	public void removeRelative(Relative relative) {
		int i = relatives.indexOf(relative);
		if(i > 0){
			relatives.remove(i);
		}
	}

	@Override
	public void notifyRelative() {
		for(int i = 0; i < relatives.size(); i++){
			Relative relative = (Relative) relatives.get(i);
			relative.update(coreFamilyName, timesWeHiked, monthsWeMarried, bibleReadingProgress);
		}
	}
	
	public void hasUpdates(){
		notifyRelative();
	}

	@Override
	public void setCoreFamilyAttributes(String coreFamilyNames,
			int hikingTimes, int marriedMonths, String bibleReadingProgress) {
		this.coreFamilyName = coreFamilyNames;
		this.timesWeHiked = hikingTimes;
		this.monthsWeMarried = marriedMonths;
		this.bibleReadingProgress = bibleReadingProgress;
		hasUpdates();
	}
	
}
