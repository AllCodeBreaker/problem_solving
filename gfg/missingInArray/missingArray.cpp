#include <iostream>
#include <vector>

using namespace std;

long missingNumber(vector<int> &arr){
	int n = arr.size() + 1;
	long expectedSum = n * (n+1) / 2 ;
	long mySum = 0;
	for(int number : arr){
		mySum += number;
	}
	return expectedSum - mySum;
}

int main(){
	vector<int> array = {1,2,3,4,5,7,8};
	cout << "Actual Array: " ;

	for(int number : array){

		cout << number << " ";

	}
	cout << "\nMissing In Array: " << missingNumber(array) << endl;
	return 0;
}
