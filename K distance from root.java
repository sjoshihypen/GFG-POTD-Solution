// K distance from root
class Tree {
     ArrayList<Integer> Kdistance(Node root, int k) {
          ArrayList<Integer> list = new ArrayList<>();
          if(root == null || k < 0){
              return list;
          }
          if(k == 0){
            System.out.print(root.data +" ");
          }
          Kdistance(root.left, k-1);
          Kdistance(root.right,k-1);
          return list;
     }
}