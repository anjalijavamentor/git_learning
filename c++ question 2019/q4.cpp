#include<iostream>
using namespace std;
int main(){
    int i,j;
    for(i=0;i<5;++i){
        for(j=0;j<3;++i){
            if(j==2)
                continue;
                cout<<i<<"---"<<j<<endl;
        }
    }
}