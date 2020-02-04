package task_2.data_structure.tree;

/**
 * Изучение реализации структуры данных бинарного дерева. Книга Лафорте
 */
public class MyTree {

    private Node rootNode; // корень

    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }

    public int find(int key) {
        Node current = null; // хранение узла, проверяемого в тек момент
        current = rootNode; // начало проверки с корневого узла
        while (current.getKey() != key) {
            if (key < current.getKey()) {
                current = current.getLeftBranch();
            } else {
                current = current.getRightBranch();
            }
            if (current == null) {
                return -1;
            }
        }
        return current.getData(); // вернем ссылку для доступа к данными именно найденного нами узла
    }

    public boolean add(int data, int key) {
        boolean result = false;
        // создаем узел, добавляем ему значение и ключ
        Node addedNode = new Node();
        addedNode.setData(data);
        addedNode.setKey(key);

        if (rootNode == null) {
            rootNode = addedNode;
            result = true;
        } else {
            Node current = rootNode; // переменная для проверки глубины уровней(она станет нулем при достижении последнего узла)
            Node futureParentRoot; // нужна для записи нового узла как наследника этого родителя
            while (true) { // теоретическая выкладка, нельзя использовать так как узел с совподающим ключом интерпрет как ключ больше искомого(взято из Лафорте)
                futureParentRoot = current;
                if (key < current.getKey()) {
                    current = current.getLeftBranch();
                    if (current == null) {
                        futureParentRoot.leftBranch = addedNode;
                        result = true;
                        return result;
                    }
                } else {
                    current = current.getRightBranch();
                    if (current == null) {
                        futureParentRoot.rightBranch = addedNode;
                        result = true;
                        return result;
                    }
                }
            }
        }
        return result;
    }

    public int findMinimum() {
        Node current = rootNode;
        while (current.leftBranch != null) {
            current = current.getLeftBranch();
        }
        int result = current.getData();
        return result;
    }


    class Node {

        private int key;
        private int data;
        private Node leftBranch;
        private Node rightBranch;

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeftBranch() {
            return leftBranch;
        }

        public void setLeftBranch(Node leftBranch) {
            this.leftBranch = leftBranch;
        }

        public Node getRightBranch() {
            return rightBranch;
        }

        public void setRightBranch(Node rightBranch) {
            this.rightBranch = rightBranch;
        }


    }


}
