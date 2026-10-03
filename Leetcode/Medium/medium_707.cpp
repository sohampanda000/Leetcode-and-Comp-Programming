// 707. Design Linked List [i implemented singly linked list and not a doubly linked list]
typedef struct Node {
    int data;
    struct Node *next; // currently: implement SLL
    struct Node *prev; // challenge: implement DLL
} Node;

class MyLinkedList {
    private:
        Node *head;
        Node *tail;

    public:
        MyLinkedList() {
            head = nullptr;
            tail = nullptr;
        }
        
        int get(int index) {
            unsigned int currentIndex = 0;
            Node* currentNode = head;
            while (currentNode != nullptr) {
                if (currentIndex == index) {
                    return currentNode -> data;
                } else {
                    currentNode = currentNode -> next;
                    currentIndex++;
                }
            }
            return -1;
        }

        void addAtHead(int val) {
            Node *addNode = new Node();
            addNode -> data = val;
            if (head == nullptr || tail == nullptr) {
                head = addNode;
                tail = addNode;
            } else {
                addNode -> next = head;
                head = addNode;
            }
        }
        
        void addAtTail(int val) {
            Node *addNode = new Node();
            addNode -> data = val;
            if (head == nullptr || tail == nullptr) {
                head = addNode;
                tail = addNode;
            } else {
                tail -> next = addNode;
                tail = addNode;
            }
        }
        
        void addAtIndex(int index, int val) {
            if (index == 0) {
                addAtHead(val);
                return;
            }
            Node *addNode = new Node();
            Node *currentNode = head;
            addNode -> data = val;
            unsigned int currentIndex = 0;
            while (currentNode != nullptr) {
                if (currentIndex == index - 1) {
                    addNode -> next = currentNode -> next;
                    currentNode -> next = addNode;
                    if (addNode -> next == nullptr) {
                        tail = addNode;
                    }
                    break;
                } else {
                    currentNode = currentNode -> next;
                    currentIndex++;
                }
            }
            if (currentIndex == index) {
                addAtTail(val);
                return;
            } else if (currentIndex > index) {
                return;
            }
        }

        void deleteAtIndex(int index) {
            if (head == nullptr) {
                return;
            } else if (index == 0) {
                Node *temp = head;
                head = head -> next;
                if (head == nullptr) {
                    tail = nullptr;
                }
                delete temp;
                return;
            } else {
                Node *currentNode = head;
                unsigned int currentIndex = 0;
                while (currentNode != nullptr && currentNode -> next != nullptr) {
                    if (currentIndex == index - 1) {
                        Node *temp = currentNode -> next;
                        currentNode -> next = temp -> next;
                        if (currentNode -> next == nullptr) {
                            tail = currentNode;
                        }
                        delete temp;
                        return;
                    }
                    currentNode = currentNode -> next;
                    currentIndex++;
                }
            }
        }
};

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList* obj = new MyLinkedList();
 * int param_1 = obj->get(index);
 * obj->addAtHead(val);
 * obj->addAtTail(val);
 * obj->addAtIndex(index,val);
 * obj->deleteAtIndex(index);
 */
