
public class Trie_Node {
	public char value; //set the value
	  boolean word = false; //set a flag
	  Trie_Node[] next = new Trie_Node[256];
	  private int nextLength = 0;
	 
	  public Trie_Node(char c) {
	    value = c;
	  }
	 
	  void setChild(char c, Trie_Node node){
	    next[c]=node;
	    nextLength++;
	  }
	  void clearNext() {
	    next = new Trie_Node[256];
	    nextLength = 0;
	  }
	 
	  boolean nextIsEmpty(){
	    return nextLength == 0;
	  }
	 
	 public int nextSize(){
	    return nextLength;
	  }
	}

