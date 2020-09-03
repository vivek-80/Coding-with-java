//singly linklist //
class Node{
	  int data;
	  Node next; 
      int pos;
}
class LinkList{
	  Node head;
	  public void Insert(int data){
	  	Node node =new Node();
	  	node.data=data;
	  	if(head==null){
	  		head=node; 
	  	}
	  	else{
	  		Node n=head;
	  		while(n.next!=null){
	  		n=n.next;
	  	    }
	  		n.next = node;
	  	}
	  }
	  public void intermediate(int pos,int data){
          Node n1=head;
          for(int i=n1.pos;i==pos;i++){
          n1=n1.next;
          n1.data=data;
          }
	  }
	  public void show(){
	  	Node node=head;

	  	while(node.next!=null){
	  		System.out.println(node.data);
	  	    node=node.next;}
	  	    System.out.println(node.data);	    
	  }
}
class call{
    public static void main(String str[]){
	LinkList o1=new LinkList();
	o1.Insert(122);
	o1.Insert(123);
	o1.Insert(124);
	o1.intermediate(0,120);
	o1.show();
}}