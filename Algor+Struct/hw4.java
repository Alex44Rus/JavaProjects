package Algorithmes.HomeWork.hw4;

import java.awt.Color;

class BinaryTree {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;
        Color color;
    }

    public boolean find(int value) {
        return find(root, value);
    }

    public boolean find(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (node.value == value) {
            return true;
        }
        if (node.value < value) {
            return find(node.right, value);
        } else {
            return find(node.left, value);
        }
    }

    public boolean insert(int value) {
        if (root == null) {
            root = new Node();
            root.value = value;
            root.color = Color.BLACK;
            return true;
        } else {
            boolean res = insert(root, value);
            root = rebalance(root);
            root.color = Color.BLACK;
            return res;
        }
    }

    public boolean insert(Node node, int value) {
        if (node.value == value) {
            return false;
        }

        if (node.value < value) {
            if (node.right == null) {
                node.right = new Node();
                node.right.value = value;
                node.right.color = Color.RED;
                node.right = rebalance(node.right);
                return true;
            } else {
                boolean res = insert(node.right, value);
                node.right = rebalance(node.right);
                return res;
            }


        } else {
            if (node.left == null) {
                node.left = new Node();
                node.left.value = value;
                node.left.color = Color.RED;
                node.left = rebalance(node.left);
                return true;
            } else {
                boolean res = insert(node.left, value);
                node.left = rebalance(node.left);
                return res;

            }
        }
    }

    private void colorSwap(Node node) {
        node.right.color = Color.BLACK;
        node.left.color = Color.BLACK;
        node.color = Color.RED;
    }

    private Node leftSwap(Node node) {
        Node left = node.left; //левый ребенок
        Node between = left.right; //правая нода от левого ребенка
        left.right = node;
        node.left = between;
        left.color = node.color;//левый ребенок получает цвет своего родителя  почему?
        node.color = Color.red;
        return left;
    }

    private Node rightSwap(Node node) {
        Node right = node.right;
        Node between = right.left;
        right.left = node;
        node.right = between;
        right.color = node.color;
        node.color = Color.RED;
        return right;
    }

    private Node rebalance(Node node) {
        Node result = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if (result.right != null && result.right.color == Color.RED &&
                    (result.left == null || result.left.color == Color.BLACK)) {
                needRebalance = true;
                result = rightSwap(result);
            }
            if (result.left != null && result.left.color == Color.RED &&
                    result.left.left != null && result.left.left.color == Color.RED) {
                needRebalance = true;
                result = leftSwap(result);
            }
            if (result.left != null && result.left.color == Color.RED &&
                    result.right != null && result.right.color == Color.RED) {
                needRebalance = true;
                colorSwap(result);
            }
        }
        while (needRebalance);
        return result;
    }

    // метод печати с гитхаба
    public void print() {
        int leftSize = 0;
        int rightSize = 0;
        Node tempL = root.left;
        Node tempR = root.right;
        System.out.printf("    ROOT %d(%s)\n", root.value, root.color);
        System.out.println("    LEFT ROOT:");
        while (tempL != null) {
            print(tempL);
            if (tempL.right != null) {
                print(tempL.right);
            }
            tempL = tempL.left;
            leftSize++;
        }
        System.out.println("    RIGHT ROOT:");
        while (tempR != null) {
            print(tempR);
            if (tempR.left != null) {
                print(tempR.left);
            }
            tempR = tempR.right;
            rightSize++;
        }
        if (Math.abs(rightSize - leftSize) <= 1) {
            System.out.println("BinaryTree is balanced.");
        } else {
            System.out.println("BinaryTree is not balanced.");
        }
    }

    private void print(Node root) {
        System.out.printf("    node %d(%s)\n", root.value, root.color);
        if (root.left != null && root.right != null) {
            System.out.printf("left %d(%s)   right %d(%s)\n",
                    root.left.value,
                    root.left.color,
                    root.right.value,
                    root.right.color);
        } else if (root.left != null && root.right == null) {
            System.out.printf("left %d(%s)   right null\n",
                    root.left.value,
                    root.left.color);
        } else if (root.left == null && root.right != null) {
            System.out.printf("left null   right %d(%s)\n",
                    root.right.value,
                    root.right.color);
        } else {
            System.out.println("left null    right null");
        }


    }


}