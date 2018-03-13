import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Iterator;
 import java.util.*;
 
public class Trie {
	private Trie_Node root; // Intiate root
	 
	  public Trie() { 
	    root = new Trie_Node('\0'); //Null character
	  }//constructor
	public boolean addWord(String word) { //add a word to the tree
	    Trie_Node node = root, temp; // node with  a root and temp
	    for (char ch : word.toCharArray()) { //each character from word
	      temp = node.next[ch]; // the temp variable takes each character
	      if (temp == null) { // if the temp varaible equals null
	        temp = new Trie_Node(ch); // temp equals the new character
	        node.setChild(ch, temp); //This character gets set in its certain child
	      }
	      node = temp; //node equals the character 
	    }
	    if (node.word) { 
	      return !node.word; //If the word is incomplete
	    }
	    node.word = true; //Addimg the word is complete
	    return node.word;
	  }
	 public List<String> display() {
		    List<String> result = new ArrayList<String>(); // New arraylist
		    for (Trie_Node node : root.next) { //Node equals next root
		      if (null != node) { // if nothing is in the node
		       search(result, node.value + "", node); // search through the trie for the words
		      }
		    }
		    return result; // Return the trie of words
		  }
	  private void search(List<String> result, String word, Trie_Node nxt) { // Sets the list to display
		    if (nxt.word) { // If it reads a word
		      result.add(word); //Add the word to the list
		    }
		    for (Trie_Node node : nxt.next) { // if the node equals the next word
		      if (null != node) { //If there is nothing in node
		       search(result, word + node.value, node); // Set the search method. 
		      }
		    }
		    
		  }
	  public boolean containsPrefix(String word) {
		    Trie_Node node = root; 
		    for (char ch : word.toCharArray()) { //goes character by character
		      node = node.next[ch]; // Go through each character
		      if (null == node) { // If the character is not in the word return false.
		        return false;
		      }
		    }
		    return !node.nextIsEmpty(); // If it is a prefix return true
		  }
	  public boolean search(String word) {
		    Trie_Node node = root; 
		    for (char ch : word.toCharArray()) { //Character by Character
		      node = node.next[ch]; // If each character matches node
		      if (null == node) { // If character does not match up
		        return false;
		      }
		    }
		    return node.word; // Return true if the word matches
	  }
		  
	  public int size(List<String> result)
	  {
		  return result.size(); // Returns the size of words in the tree
	  }

	  public  void clear(Stack<String> stack,List<String> result )
		{
		 for (int i = 0; i< result.size();i++) 
		 {
			 stack.pop(); //Removes the words from the tree. 
		 }
		 
		}
	 
}

