#include <iostream>
using namespace std;

int binarySearch(int arr[], int n, int target) {
    int low = 0, high = n - 1;

    while (low <= high) {
        int mid = (low + high) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target)
            low = mid + 1;
        else
            high = mid - 1;
    }

    return -1;
}

int main() {
    int data[] = {2, 4, 6, 8, 10, 12, 14};
    int n = sizeof(data) / sizeof(data[0]);
    int target = 10;

    int hasil = binarySearch(data, n, target);
    if (hasil != -1)
        cout << "Data ditemukan di indeks " << hasil << endl;
    else
        cout << "Data tidak ditemukan." << endl;

    return 0;
}