import java.util.*;

class Node{
    String nodeName;
    Node(String name){
        this.nodeName=name;
    }
}
class helloGraph{
    ArrayList<String> list=new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("c");
    list.add("D");
    list.add("E");

    Graph g=new Graph(list);
    g.addEdge("A","B");
    g.addEdge("B","C");
    g.addEdge("C","E");
    g.addEdge("D","A");
    g.addEdge("E","B");


    
}

class Graph{
    HashMap<String,ArrayList<String>> hash;
   Graph(list<Node> lst){
     this.hash=new HashMap<>();
     for(Node n:list){
     hash.put(n,ArrayList<Node>());
     }

   }
   void addEdge(Node n1,Node n2){
    hash.get(n1).add(n2);
    hash.get(n1).add(n2);   
   }
   void Display(){
    for (Node node : hash.keySet()) {
        System.out.print(node.nodeName + " -> ");
        for (Node neighbor : hash.get(node)) {
            System.out.print(neighbor.nodeName + " ");
        }
        System.out.println();
    }

     

    
   }

}