//package DSA_C.Tree_Traversal;
//struct node *deleteNode(struct node *root, int value){
//
//        struct node* iPre;
//        if (root == NULL){
//        return NULL;  
//        }
//        if (root->left==NULL&&root->right==NULL){
//        free(root);
//        }
//
//        //searching for the node to be deleted
//        if (value < root->data){
//        deleteNode(root->left,value);
//        }
//        else if (value > root->data){
//        deleteNode(root->right,value);
//        }
//        //deletion strategy when the node is found
//        else{
//        iPre = inOrderPredecessor(root);
//        root->data = iPre->data;
//        deleteNode(root->left, iPre->data);
//        }
//        }
