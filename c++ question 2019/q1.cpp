#include<iostream>
using namespace std;
int main(){
    int i,j;
    for(i=0;i<5;++i){
        for(j=0;j<3;++j){
            if(j==2)
                break;
                 cout<<i<<"------"<<j<<endl;
        }
       
    }
}