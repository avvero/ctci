package pw.avvero.leet.year2023.year2023_09;

public class Problem427 {

    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }

        public Node construct(int[][] grid) {
            return construct(grid, 0, grid.length - 1, 0, grid.length - 1);
        }

        private Node construct(int[][] grid, int is, int ie, int js, int je) {
            if (is == ie) {
                return new Node(grid[is][js] == 1, true);
            }
            Node node = new Node();
            int imid = is + (ie - is) / 2;
            int jmid = js + (je - js) / 2;
            node.topLeft = construct(grid, is, imid, js, jmid);
            node.topRight = construct(grid, is, imid, jmid + 1, je);
            node.bottomLeft = construct(grid, imid + 1, ie, js, jmid);
            node.bottomRight = construct(grid, imid + 1, ie, jmid + 1, je);
            if (node.topLeft.isLeaf && node.topRight.isLeaf && node.bottomLeft.isLeaf && node.bottomRight.isLeaf
                    && node.topLeft.val == node.topRight.val && node.topRight.val == node.bottomLeft.val
                    && node.bottomLeft.val == node.bottomRight.val) {
                return new Node(node.topLeft.val, true);
            } else {
                return node;
            }
        }
    }
}
