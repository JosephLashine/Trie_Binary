import java.util.*;
public class Trie_Tester  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Trie trie = new Trie();

Scanner console = new Scanner (System.in);
String word;



System.out.println("What word would you like to add  ");
word=console.next();
String wordLower = word.toLowerCase();
System.out.println("Add " + wordLower+ ": ");
System.out.println(trie.addWord(wordLower));
System.out.println("Add snoop: ");
System.out.println(trie.addWord("snoop"));
System.out.println("Add book: ");
System.out.println(trie.addWord("book"));
System.out.println("Add foo: ");
System.out.println(trie.addWord("foo"));

List<String> result = trie.display();


Stack<String> stack = new Stack<String>(); //2 Create new stack
stack.addAll(result);

System.out.println(stack);

String search;
System.out.println("Enter the word your would like to search in the trie");
search = console.next();
search = search.toLowerCase();
System.out.println("Searching for: " + search);
System.out.println(trie.search(search));
System.out.println("Searching for 'apple': ");
System.out.println(trie.search("apple"));
System.out.println("Searching for 'fo': ");
System.out.println(trie.search("fo"));
System.out.println("Searching for 'book': ");
System.out.println(trie.search("book"));
System.out.println("Searching for 'foo': ");
System.out.println(trie.search("foo"));

String prefix;
System.out.println("Enter the prefix of your word that you would like to see");
prefix = console.next();
 prefix = prefix.toLowerCase();
System.out.println("Search for the prefix 'sn': ");
System.out.println(trie.containsPrefix("sn"));
System.out.println("Search for the prefix 'boo': ");
System.out.println(trie.containsPrefix("boo"));
System.out.println("Search for the prefix 'vo': ");
System.out.println(trie.containsPrefix("vo"));
System.out.println("Search for the prefix" + " " +prefix+ ": ");
System.out.println(trie.containsPrefix(prefix));;
System.out.println("The amount of words in the trie is: ");
System.out.println(trie.size(stack));
System.out.println("Trie before the clear: ");
System.out.println(stack);
trie.clear(stack,result);
System.out.println("Trie after the clear");
System.out.println(stack);


}
	
}

