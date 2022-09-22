package HomeWork;

public void task_6 (TreeNode tmpRoot) {

    Queue<TreeNode> currentLevel = new LinkedList<TreeNode>();
    Queue<TreeNode> nextLevel = new LinkedList<TreeNode>();

    currentLevel.add(tmpRoot);

    while (!currentLevel.isEmpty()) {
        Iterator<TreeNode> iter = currentLevel.iterator();
        while (iter.hasNext()) {
            TreeNode currentNode = iter.next();
            if (currentNode.left != null) {
                nextLevel.add(currentNode.left);
            }
            if (currentNode.right != null) {
                nextLevel.add(currentNode.right);
            }
            System.out.print(currentNode.value + " ");
        }
        System.out.println();
        currentLevel = nextLevel;
        nextLevel = new LinkedList<TreeNode>();

    }

}

// public void levelOrder(List<TreeNode> n) {
//     List<TreeNode> next = new ArrayList<TreeNode>();
//     for (TreeNode t : n) {
//         if (t != null) {
//             System.out.print(t.getValue());
//             next.add(t.getLeftChild());
//             next.add(t.getRightChild());
//         }
//     }
//     System.out.println();
//     if(next.size() > 0)levelOrder(next);
// }