#include<iostream>
using namespace std;
int main(){
    int i;
    for(i=0;i<5;++i){
        if(i==2)
            continue;
            cout<<i;
    }
}