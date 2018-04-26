

public class Run {
    public static void main(String args[]) {
        Node nodeA = new Node("Sao Luis");
        Node nodeB = new Node("Recife");
        Node nodeC = new Node("Salvador");
        Node nodeD = new Node("Manaus");
        Node nodeE = new Node("Porto Alegre");
       
        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 10);
        nodeA.addDestination(nodeD, 20);
        nodeA.addDestination(nodeE, 70);

        nodeB.addDestination(nodeC, 10);
        nodeB.addDestination(nodeD, 50);
        nodeB.addDestination(nodeE, 50);

        nodeC.addDestination(nodeD, 40);
        nodeC.addDestination(nodeE, 30);
        
        nodeD.addDestination(nodeE, 50);

     
        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
  

        graph = graph.calculateShortestPathFromSource(graph, nodeA);
        
        for(Node n : graph.getNodes()) {
            System.out.println(n.getName() +" - "+ n.getDistance());
        }
       
    }
}
