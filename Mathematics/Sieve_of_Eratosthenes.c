#include <stdio.h>
#include<stdbool.h>
int main()
{
    int n,count=0;
    printf("Enter Max Bound: ");
    scanf("%d",&n);
    bool a[n+1];
    for (int i =0;i<=n;i++){
        a[i]=true;
    }
    a[0]=false;
    a[1]=false;
    for (int i =2;i*i<=n;i++){
        for(int j =2*i;j<=n;j=j+i){
            a[j]=false;
        }
    }
    for (int i =1;i<=n;i++){
        if(a[i]){
            count++;
        }
    }
    printf("no of Prime nos between 1 and %d is %d",n,count);
}