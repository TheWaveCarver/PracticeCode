/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node struct is defined as follows:
   struct Node {
      int data;
      Node* left;
      Node* right;
   }
*/
   bool checkBST(Node* root) {
       vector<int> all_data;
       
       in_order_traversal(root, all_data);
       
       for(int i = 1; i < all_data.size(); i++) {
           if(all_data[i] <= all_data[i-1]) {
               return false;
           }
       }
       return true;
   }

   void in_order_traversal(Node* root, vector<int>& all_data){
       if(root == NULL){
           return;
       }
       in_order_traversal(root->left, all_data);
       all_data.push_back(root->data);
       in_order_traversal(root->right, all_data);
   }
