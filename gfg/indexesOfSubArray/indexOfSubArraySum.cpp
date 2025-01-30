#include <iostream>
#include <vector>

using namespace std;

vector<int> subarraySum(vector<int> &arr, int target) {

        int size = arr.size();
        int sum;
        for(int i = 0; i < size; i++ ){
            sum = 0;
            for (int start = i; start < size; start++){
                sum += arr.at(start);
                if (sum == target){
                    return {i+1, start+1};
                }else if(sum > target){
                    break;
                }
            }
        }
        return {-1};
}

int main(){
	// Sample Code for output
	vector <int> arr = {11,7,4,2,8,6,3,1};
	int target = 9;
	vector <int> result;
	cout << "Actual Array :";
	for(int value : arr){
		cout << value << " ";
	}
	cout << "\nTarget :" << target << endl;
	result = subarraySum(arr, target);
	if (result[0] == -1){
		cout << -1 << endl;
	}else{
		cout << "Result : [" << result[0] << ", " << result[1] << "]" << endl ;
	}
	
	return 0;
}
