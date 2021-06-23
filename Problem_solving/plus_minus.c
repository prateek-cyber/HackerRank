#include<stdio.h>
int main(){
    int size;
    float neg,pos,zero;
    printf("Enter size of array: ");
    scanf("%d",&size);
    int arr[size];
    printf("Enter elements: ");
    for(int i = 0;i < size; i++){
        scanf("%d",&arr[i]);
    }
    for(int i = 0; i < size; i++){
        if(arr[i]<0)
        neg = neg + 1;
        else if(arr[i]>0)
        pos = pos + 1;
        else
        zero = zero + 1;

    }
    float p,n,z;
    p = pos/size;
    n=neg/size;
    z = zero/size;
    
    printf("%f\n%f\n%f",p,n,z);
    return 0;
}