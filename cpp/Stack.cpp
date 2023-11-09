
template<class T>
class Node{
private:
  T content;
  Node* nextNode;
public:
  Node(T content){
    this->content = content;
    nextNode = nullptr;
  }
  void setNode(Node* node){
    nextNode = node;
  }
  T getContent(){
    return content;
  }
  Node<T>* next(){
    return nextNode;
  }
};

template<class T>
class Stack{
private:
  Node<T> *head;
public:
  Stack()
  {
    head = new Node(nullptr);
  }
  T top()
  {
    return head->getContent();
  }
  void push(T content)
  {
    head->setNode(head);
    head = new Node<T>(content);
  }
  void pop()
  {
    Node<T> *next = head.nextNode();
    delete head;
    head = next;
  }
  bool isEmpty()
  {
    return head != nullptr;
  }
};
