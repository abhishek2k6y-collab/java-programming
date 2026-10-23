#include <stdio.h>

void merge(int a[], int left, int mid, int right) {
    int i = left, j = mid + 1, k = left;
    int b[100];

    while (i <= mid && j <= right) {
        if (a[i] <= a[j]) {
            b[k] = a[i];
            i++;
        } else {
            b[k] = a[j];
            j++;
        }
        k++;
    }

    while (i <= mid) {
        b[k] = a[i];
        i++;
        k++;
    }

    while (j <= right) {
        b[k] = a[j];
        j++;
        k++;
    }

    for (i = left; i <= right; i++) {
        a[i] = b[i];
    }
}

void mergesort(int a[], int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;

        mergesort(a, left, mid);
        mergesort(a, mid + 1, right);
        merge(a, left, mid, right);
    }
}

int main() {
   int a[100] , i , j ,n;
   printf ("Enter the no of Elements:- ");
   scanf("%d",&n);

    printf("Enter the value:- ");
    for(i=0; i<n;i++)
    scanf("%d", &a[i]);

    printf("Original array:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", a[i]);
    }

    mergesort(a, 0, n - 1);

    printf("\nSorted array:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", a[i]);
    }

    return 0;
}
