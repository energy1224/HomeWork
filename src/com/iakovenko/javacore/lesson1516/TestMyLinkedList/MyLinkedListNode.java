package com.iakovenko.javacore.lesson1516.TestMyLinkedList;

class MyLinkedListNode<T> {
    // значение, которые добавляется в связный список
    private T value;
    // ссылка на следующую ноду (узел)
    private MyLinkedListNode<T> nextNode;
    // ссылка на предыдущую ноду (узел), если список двунаправленный
    private MyLinkedListNode<T> previousNode;

    public MyLinkedListNode(T value) {
        this.value = value;

    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public MyLinkedListNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(MyLinkedListNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public MyLinkedListNode<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(MyLinkedListNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        return "MyLinkedListNode{" +
                "value=" + value;
    }
}