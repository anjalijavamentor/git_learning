#include<stdio.h>
int main(){
    int arr[4][4];
    int i , j;
    for(i=0;i<4;++i){
        for(j=0;j<4;j++){
            printf("ENTER NUMBER");
            scanf("%d",&arr[i][j]);
        }
    }

     for(i=0;i<4;++i){
         for(j=0;j<4;j++){
             printf("%d ",arr[i][j]);
         }
         printf("\n");
     }
}