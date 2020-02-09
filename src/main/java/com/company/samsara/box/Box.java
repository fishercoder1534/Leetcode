package com.company.samsara.box;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import org.apache.commons.lang3.StringUtils;

/**
 * PART 1: Implement a representation of valuable with two fields id and name.
 *
 * <p>PART 2: Implement a representation of box, which is used as a container of valuables.
 * Implement two methods. First is to add a valuable to the box (given id as input). Second is to
 * remove a valuable from the box(given valuable object as input)
 *
 * <p>PART3: Add an maximum size bar to the representation of box. Modify the add method so that if
 * the total size of valuables in the box will exceed the box size bar, do not add and print an
 * error message. Otherwise, add the valuable into the box.
 *
 * <p>PART 4: Implement a method to output the maximum valuable-size in the box whenever the method
 * is called
 */
public class Box {

  private int sizeBar;
  private int currentSize;
  private PriorityQueue<Valuable> maxValuables;
  private Map<Integer, Valuable> contentMap;

  public Box(int sizeBar) {
    if(sizeBar <= 0) {
      throw new IllegalArgumentException("Size bar of a box cannot be smaller thant or equal to zero");
    }
    this.sizeBar = sizeBar;
    this.currentSize = 0;
    maxValuables = new PriorityQueue<>((a,b)->(b.size - a.size));
    contentMap = new HashMap<>();
  }

  public void addValuable(Valuable valuable) {
    if(valuable == null) {
      throw new IllegalArgumentException("added valuable cannot be null");
    }

    if(contentMap.containsKey(valuable.id)) {
      throw new IllegalArgumentException("valuable is already in the box");
    }

    if(currentSize + valuable.size > sizeBar) {
      throw new IllegalArgumentException(String.format("adding this valuable with size %d will exceeds the box' size bar %d", valuable.size, sizeBar));
    }

    contentMap.put(valuable.id, valuable);
    maxValuables.offer(valuable);
    currentSize += valuable.size;
    System.out.println("Added " + valuable.toString() + ", current box size: " + currentSize + " maxValueSize: " + getMaxValuableSize());
  }

  public void removeValuable(int id) {
    if(!contentMap.containsKey(id)) {
      throw new IllegalArgumentException("valuable is no in the box");
    }
    Valuable removed = contentMap.remove(id);
    maxValuables.remove(removed);
    currentSize -= removed.size;
    System.out.println("Removed " + removed.toString() + ", current box size: " + currentSize + " maxValueSize: " + getMaxValuableSize());
  }

  public int getMaxValuableSize() {
    if(maxValuables.isEmpty()) {
      return 0;
    } else {
      return maxValuables.peek().size;
    }
  }

  public static void main(String[] args) {

    Valuable v1 = new Valuable(1, "valuable 1", 1);
    Valuable v10 = new Valuable(2, "valuable 10", 10);
    Valuable v20 = new Valuable(3, "valuable 20", 20);
    Valuable v29 = new Valuable(4, "valuable 29", 29);
    Valuable v5 = new Valuable(5, "valuable 5", 5);
    Valuable v9 = new Valuable(6, "valuable 9", 9);

    Box aBox = new Box(30);
    try{
      aBox.addValuable(v1);
      aBox.addValuable(v10);
//      aBox.addValuable(v20);
      aBox.removeValuable(v10.id);
      aBox.addValuable(v29);
      aBox.removeValuable(v29.id);
      aBox.addValuable(v5);
      aBox.addValuable(v10);
      aBox.addValuable(v9);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

  }

}

class Valuable {
  int id;
  String name;
  int size;

  public Valuable(int id, String name, int size) {
    if(StringUtils.isBlank(name)) {
      throw new IllegalArgumentException("Valuabe cannot be blank");
    }
    if(size <= 0) {
      throw new IllegalArgumentException("Valuabe size cannot be smaller than or equal to 0");
    }
    this.id = id;
    this.name = name;
    this.size = size;
  }

  @Override
  public String toString() {
    return "[id = " + id + ", name = " + name + ", size = " + size + "]";
  }

}


