class TrieNode {
    boolean isEndOfWord;
    TrieNode[] children;
    public TrieNode() {
        children = new TrieNode[26];
        isEndOfWord = false;
    }
}
class PrefixTree {
    TrieNode root;
    public PrefixTree() {
         root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int ind = c - 'a';
            if (node.children[ind] == null) {
                node.children[ind] = new  TrieNode();
            }
            node = node.children[ind];

        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int ind = c - 'a';
            if (node.children[ind] == null) return false;
            node = node.children[ind];

        }
        return node.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            int ind = c - 'a';
            if (node.children[ind] == null) return false; 
            node = node.children[ind];

        }
        node.isEndOfWord = true;
        return true;
    }
}
