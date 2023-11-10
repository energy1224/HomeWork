package com.iakovenko.javacore.lesson1516.TestMyLinkedList;

// двунапрвленный или однонаправленный связный список
public class MyLinkedList<T> {
    // размер списка (увеличивается при добавлении, уменьшается при удалении)
    private int size;
    // ссылка на первый элемент списка
    private MyLinkedListNode<T> first;
    // ссылка на последний элемент списка
    private MyLinkedListNode<T> last;

//    public MyLinkedList() {
//        size = 0;
//
//        first = new MyLinkedListNode<>(null);
//
//        last = new MyLinkedListNode<>(null);
//    }

    // добавление элемента в список
    public void add(T t) {
        MyLinkedListNode<T> newNode= new MyLinkedListNode<>(t);
        if (size == 0) {
            first= newNode;
            last = newNode;
            first.setNextNode(last);
            last.setPreviousNode(first);
        } else {

            last.setNextNode(newNode);
            newNode.setPreviousNode(last);
            last=newNode;
            last.setNextNode(null);

        }
        size++;

    }

    public void printMyLinkedList() {
        int index = 0;
        MyLinkedListNode<T> node = first;
        while (index < size) {
            System.out.println(node.getValue());

                node = node.getNextNode();
                index++;
            }

        }



        // добавление элемента в список на указанную позицию
        // индексы начинаются с 0 и не могут быть больше или равными size
        public void add (T t,int index){
        }

        // удаление элемента из списка (для установки соответствия использовать метод equals)
        // возвращает true, если элемент был удалён и false, если нет
        public boolean remove (T t){
            return false;
        }

        // удаление элемента из списка по индексу
        // возвращает удалённый, если он был удалён и null, если нет
        public T remove ( int index){
            return null;
        }


        // получение элемента списка по индексу (без удаления)
        // возвращает ссылку на элемент, если он найден и null, если нет
        public T get ( int index){
//        int x=index;
//        while (x!=index){
//
//
//        }
//
//
//            }
            return null;
        }

        // метод, позволяющий развернуть список
        // необходимо перезаписать все ссылки, а не просто поменять местами first и last
        public void reverse () {
        }

        @Override
        public String toString () {
            return "MyLinkedList{" +
                    "size=" + size +
                    ", first=" + first +
                    ", last=" + last +
                    '}';
        }
    }
